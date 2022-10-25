package com.alejrest.proyectoSesion1.controllers;

import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import com.alejrest.proyectoSesion1.entities.typesCar.HydrogenCar;
import com.alejrest.proyectoSesion1.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/")
public class CarController {

    @Autowired
    private CarService carService;

    @GET
    @Path("/randomCar/{typeCar}")
    @Produces("application/json")
    public Car getOneRandomCar(@PathParam("typeCar") String typeCar){
        return carService.getOneRandomCar(typeCar);
    }

    @POST
    @Path("/randomCar/save")
    @Produces("application/json")
    @Consumes("application/json")
    public Response saveOneRandomCar(Car car){
        System.out.println(car);
        carService.saveRandomCar(car);

        return Response.ok().build();
    }

    @GET
    @Path("/randomCar/list")
    @Produces("application/json")
    public List<Car> listAllCars(){
        return carService.listAllCars();
    }

}
