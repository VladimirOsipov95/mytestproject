package API.Reqres.Tests;

import API.Specification;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@DisplayName("API тесты на Reqres.in")
@Feature("Delete Reqres")
@Epic("API")
public class ReqresDeleteTest {
    private final static String URL = "https://reqres.in/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Проверка удаления")
    @DisplayName("1.Проверка удаления")
    public void deleteUserTest () {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(204));
        /**
         * 1. Отправляем запрос на удаление второго пользователя,проверяем статус код;
         */
        given()
                .when()
                .delete("api/users/2")
                .then()
                .log().all();
    }
}
