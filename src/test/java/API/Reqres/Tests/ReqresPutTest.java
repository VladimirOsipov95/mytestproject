package API.Reqres.Tests;

import API.Reqres.Pojo.UserTime;
import API.Reqres.Pojo.UserTimeResponse;
import API.Specification;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.Clock;

import static io.restassured.RestAssured.given;

@DisplayName("API тесты на Reqres.in")
@Feature("Put Reqres")
@Epic("API")
public class ReqresPutTest {
    private final static String URL = "https://reqres.in/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Проверка даты обновления с текущей датой")
    @DisplayName("1.Проверка даты обновления с текущей датой")
    public void checkServerAndPcDateTest() {
        /**
         * 1. Используя сервис https://reqres.in/ обновить информацию о пользователе
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        UserTime user = new UserTime("morpheus","zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);
        /**
         * 2. Сравниваем дату обновления с текущей датой на машине
         */
        String currentTime = Clock.systemUTC().instant().toString().replaceAll("(.{11})$","");
        Assertions.assertEquals(response.getUpdatedAt().replaceAll("(.{5})$",""),currentTime);
    }
}
