package API.Swagger.Tests;

import API.Specification;
import API.Swagger.Pojo.CarsBrand;
import API.Swagger.Pojo.VersionApp;
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

@DisplayName("API тесты на swagger-тренажере")
@Feature("response-train-controller")
@Epic("API")
public class ResponseTrainControllerTest {
    private final static String URL = "http://85.192.34.140:8080/";
    private final static String brand = "ALfa Romeo";
    private final static String version = "1.0.2";
    @Test
    @Owner("osipov_vr")// сделать проверку на конкретную модель
    @Order(1)
    @Description("Проверка получения списка машин")
    @DisplayName("1.Проверка получения списка машин")
    public void carsBrandsTest() {
        /**
         * 1. Используя сервис  отправляем запрос на получение списка машин
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        List<CarsBrand> carsBrands = given()
                .when()
                .get("api/easy/carBrands")
                .then().log().all()
                .extract().body().jsonPath().getList(".", CarsBrand.class);
        /**
         * 2. Проверяем что список машин содержит указанный бренд
         */
        List<String> brands = carsBrands.stream().map(CarsBrand::getBrand).collect(Collectors.toList());
        Assertions.assertTrue(brands.contains(brand));
    }
    @Test
    @Owner("osipov_vr")
    @Order(3) // надо сделать
    @Description("Проверка редиректа на 301 статус-код")
    @DisplayName("3.Проверка редиректа на 301 статус-код")
    public void redirectTest() {
        /**
         * 1. Используя сервис  отправляем запрос на получение актуальной версию API приложения
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        given()
                .when()
                .get("/api/easy/redirect")
                .then()
                .log().all();
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверка получения актуальной версию API приложения")
    @DisplayName("4.Проверка получения актуальной версию API приложения")
    public void versionAppTest() {
        /**
         * 1. Используя сервис  отправляем запрос на получение актуальной версию API приложения
         */
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(200));
        VersionApp versionApp = given()
                .when()
                .get("api/easy/version")
                .then().log().all()
                .extract().as(VersionApp.class);
        /**
         * 2. Проверяем версию приложения
         */
        Assertions.assertEquals(version, versionApp.getApiVersion());
    }
}
