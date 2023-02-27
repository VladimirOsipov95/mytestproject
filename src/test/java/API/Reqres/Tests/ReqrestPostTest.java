package API.Reqres.Tests;

import API.Reqres.Pojo.Register;
import API.Reqres.Pojo.SuccessReg;
import API.Reqres.Pojo.UnsuccessReg;
import API.Specification;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
@DisplayName("API тесты на Reqres.in")
@Feature("Post Reqres")
@Epic("API")
public class ReqrestPostTest {
    private final static String URL = "https://reqres.in/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Проверка авторизации с валидныи данными")
    @DisplayName("1.Проверка авторизации с валидныи данными")
    public void successRegTest() {
        /**
         * 1. Используя сервис https://reqres.in/ отправляем запрос на регистрацию
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessReg.class);
        /**
         * 2. Проверяем что регистрация успешна
         */
        Assertions.assertNotNull(successReg.getId());
        Assertions.assertNotNull(successReg.getToken());
        Assertions.assertEquals(Integer.valueOf(4), successReg.getId());
        Assertions.assertEquals("QpwL5tke4Pnpja7X4", successReg.getToken());
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверка авторизации без пароля")
    @DisplayName("2.Проверка авторизации без пароля")
    public void unsuccessfulRegTest() {
        /**
         * 1. Используя сервис https://reqres.in/ отправляем запрос на регистрацию
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(400));
        Register user = new Register("sydney@fife", "");
        UnsuccessReg unsuccessReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnsuccessReg.class);
        /**
         * 2. Проверяем что регистрация не завершилась, ошибка
         */
        Assertions.assertEquals("Missing password", unsuccessReg.getError());
    }
}
