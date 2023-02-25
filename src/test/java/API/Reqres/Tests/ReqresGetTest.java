package API.Reqres.Tests;


import API.Reqres.Pojo.ListResource;
import API.Reqres.Pojo.UserData;
import API.Specification;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
@DisplayName("API тесты на Reqres.in")
@Feature("Get Reqres")
@Epic("API")
public class ReqresGetTest {
    private final static String URL = "https://reqres.in/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Проверка avatar, id, email")
    @DisplayName("1.Проверка avatar, id, email")
    public void checkAvatarAndIdTest () {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        /**
         * 1. Получаем список пользователей со второй страница на сайте https://reqres.in/;
         */
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        /**
         * 2. Убеждаемся  что id пользователей содержаться в их avatar;
         */
        users.forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
        /**
         * 3. Убеждаемся, что email пользователей имеет окончание reqres.in;
         */
        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверка что данные отсортированы по годам")
    @DisplayName("2.Проверка что данные отсортированы по годам")
    public void sortedYearsTest () {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        /**
         * 1.Используя сервис вызываем операцию LIST<RESOURCE>;
         */
        List<ListResource> resources = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ListResource.class);
        /**
         * 2. Проверяем, что операция возвращает данные отсортированные по годам.
         */
        List<Integer> years = resources.stream().map(ListResource::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedYears, years);
    }
}
