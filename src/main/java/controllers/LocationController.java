package controllers;

import db.DBHelper;
import models.Location;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class LocationController {
    public LocationController()  {
        this.setupEndpoints();
    }

    public void setupEndpoints(){

//        INDEX
        get("/locations", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Location> locationList = DBHelper.getAll(Location.class);
            model.put("template", "templates/locations/index.vtl");
            model.put("locations", locationList);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        //        NEW
        get("/locations/new", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            List<Location> newLocation = DBHelper.getAll(Location.class);
            model.put("locations", newLocation);
            model.put("template", "templates/locations/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());
//        SHOW
        get("/locations/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Location location = DBHelper.find(Location.class, intId);
            Map<String, Object> model = new HashMap<>();
            model.put("locations", location);
            model.put("template", "templates/locations/show.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());




        post ("/locations", (req, res) -> {
            String locationName = req.queryParams("locationName");
            Location addLocations = new Location(locationName);
            System.out.println(addLocations);
            DBHelper.save(addLocations);
            HashMap<String, Object> model = new HashMap<>();
            model.put("template", "templates/locations/layout.vtl");
            res.redirect("/locations");
            return new ModelAndView(model, "layout.vtl");
        }, new VelocityTemplateEngine());


//        UPDATE
        get("/locations/edit/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Location location = DBHelper.find(Location.class, intId);

            Map<String, Object> model = new HashMap<>();
            model.put ("location", location);
            model.put("template", "templates/locations/edit.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        post ("/locations/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Location locationList = DBHelper.find(Location.class, intId);
            String locationName = req.queryParams("locationName");

            locationList.setLocationName(locationName);
            DBHelper.update(locationList);
            HashMap<String, Object> model = new HashMap<>();
            res.redirect("/locations");
            return new ModelAndView(model, "layout.vtl");
        }, new VelocityTemplateEngine());


//        DELETE
        get ("/locations/delete/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Location deletedLocation = DBHelper.find(Location.class, intId);
            DBHelper.delete(deletedLocation);
            res.redirect("/locations");
            return null;
        }, new VelocityTemplateEngine());

    }
}