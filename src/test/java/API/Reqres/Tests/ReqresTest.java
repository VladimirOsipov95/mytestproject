package API.Reqres.Tests;


import API.Reqres.Pojo.Register;
import API.Reqres.Pojo.SuccessReg;
import API.Reqres.Pojo.UnsuccessReg;
import API.Reqres.Pojo.UserData;
import API.Specification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/";
    /**
     * 1. Получить список пользователей со второй страница на сайте https://reqres.in/;
     * 2. Убедиться что id пользователей содержаться в их avatar;
     * 3. Убедиться, что email пользователей имеет окончание reqres.in;
     */

    @Test
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
        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        /**
         * 3. Убеждаемся, что email пользователей имеет окончание reqres.in;
         */
        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));
    }
    /**
     * 1. Используя сервис https://reqres.in/ протестировать регистрацию пользователя в системе
     * 2. Тест для успешной регистрации и неуспешной регистрации
     */
    @Test
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
        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());
        Assert.assertEquals(Integer.valueOf(4), successReg.getId());
        Assert.assertEquals("QpwL5tke4Pnpja7X4", successReg.getToken());
    }
    @Test
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
        Assert.assertEquals("Missing password", unsuccessReg.getError());
    }
}
