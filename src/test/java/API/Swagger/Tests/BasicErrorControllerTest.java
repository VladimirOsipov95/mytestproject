package API.Swagger.Tests;

import API.Specification;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@DisplayName("API тесты на swagger-тренажере")
@Feature("basic-error-controller")
@Epic("API")
public class BasicErrorControllerTest {
    private final static String URL = "http://85.192.34.140:8080/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Проверка получения ошибки в get-запросе")
    @DisplayName("1.Проверка получения ошибки в get-запросе")
    public void getErrorTest() {
        /**
         * 1. Используя сервис  отправляем get-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .get("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверка получения ошибки в head-запросе")
    @DisplayName("2.Проверка получения ошибки в head-запросе")
    public void headErrorTest() {
        /**
         * 1. Используя сервис  отправляем head-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .head("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверка получения ошибки в post-запросе")
    @DisplayName("3.Проверка получения ошибки в post-запросе")
    public void postErrorTest() {
        /**
         * 1. Используя сервис  отправляем post-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .post("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверка получения ошибки в put-запросе")
    @DisplayName("4.Проверка получения ошибки в put-запросе")
    public void putErrorTest() {
        /**
         * 1. Используя сервис  отправляем put-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .put("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("Проверка получения ошибки в delete-запросе")
    @DisplayName("5.Проверка получения ошибки в delete-запросе")
    public void deleteErrorTest() {
        /**
         * 1. Используя сервис  отправляем delete-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .delete("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("Проверка получения ошибки в options-запросе")
    @DisplayName("6.Проверка получения ошибки в options-запросе")
    public void optionsErrorTest() {
        /**
         * 1. Используя сервис  отправляем options-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .options("error")
                .then().log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("Проверка получения ошибки в patch-запросе")
    @DisplayName("7.Проверка получения ошибки в patch-запросе")
    public void patchErrorTest() {
        /**
         * 1. Используя сервис  отправляем patch-запрос
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(401));
        given()
                .when()
                .patch("error")
                .then().log().all();
    }
}
