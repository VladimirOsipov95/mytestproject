# Тестовой проект
Проект состоит из:
- _Java_ - как язык разработки автотестов;
- _Selenide_ - фреймворк для автоматизации UI тестов;
- _Junit_ - фреймворк для автоматизации;
- _Gradle_ - сборщик проекта;
- _Allure_ - инструмент для пострения отчетов.
- За основу для разработки автоматизированных тестовых сценариев взять тренажер UI - http://85.192.34.140:8081/
## Для локального запуска всех тестов
```bash
$ ./gradlew   test
```

## Построение отчета
Для построения локального отчета о прохождении тестов можно запустить команду
```bash
$ ./gradlew allureServe
```
