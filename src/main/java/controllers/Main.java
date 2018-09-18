package controllers;

import db.DBArticle;
import db.DBHelper;
import db.Seeds;
import models.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.staticFileLocation;

public class Main {
    public static void main(String[] args) {

        Seeds.seedData();
        staticFileLocation("/public");

        ArticleController articleController = new ArticleController();
        CategoryController categoryController = new CategoryController();
        JournalistController journalistController = new JournalistController();
        LocationController loctionController = new LocationController();

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<String> articleTimeStamp = new ArrayList<>();
            List<Article> articles = DBArticle.orderArticlesByAgeDesc();
            List<Journalist> journalists = DBHelper.getAll(Journalist.class);
            List<Category> categories = DBHelper.getAll(Category.class);
            List<Location> locations = DBHelper.getAll(Location.class);
            for (Article article : articles) {
                String time = Seeds.storyAgeSimple(article.getTimeStamp());
                articleTimeStamp.add(time);
            }
            List<Article> articlesByViews = DBArticle.orderArticlesByViews();
            model.put("articlesByViews", articlesByViews);
            model.put("articles", articles);
            model.put("journalists", journalists);
            model.put("categories", categories);
            model.put("locations", locations);
            model.put("articleTimeStamp", articleTimeStamp);
            model.put("template", "templates/main.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
    }
}

