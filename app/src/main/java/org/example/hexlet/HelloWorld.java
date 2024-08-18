package org.example.hexlet;
import io.javalin.Javalin;

public class HelloWorld {

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
    public static Javalin getApp() {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        app.get("/user/{id}/post/{postId}", ctx -> {
            String userId = ctx.pathParam("id");
            String postId = ctx.pathParam("postId");
            ctx.result("User ID: " + userId + " " + "Post ID: " + postId);
        });

        return app;
    }
}
