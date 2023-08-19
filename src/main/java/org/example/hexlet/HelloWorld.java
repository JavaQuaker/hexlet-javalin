package org.example.hexlet;
import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        // Описываем что загрузится по адресу /

        app.get("/hello", ctx -> {
            String name = ctx.queryParam("name");
            ctx.result("Hello" + " " + name);
            if (name == null) {
                ctx.result("Hello World!");
            }
        });

        app.start(7070); // Стартуем веб-сервер

    }
}
