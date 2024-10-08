package com.ext.info.controller;

import com.ext.info.model.Coffee;
import com.ext.info.model.Size;
import com.ext.info.service.CoffeeService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class RequestController {


    private final CoffeeService coffeeService;

    public RequestController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @QueryMapping
    public List<Coffee> findAll() {
        return coffeeService.findAll();
    }

    @QueryMapping
    public Optional<Coffee> findOne(@Argument Integer id) {
        return coffeeService.findOne(id);
    }

    @MutationMapping
    public Coffee create(@Argument String name, @Argument Size size) {
        return coffeeService.create(name,size);
    }

    @MutationMapping
    public Coffee update(@Argument Integer id, @Argument String name, @Argument Size size) {
        return coffeeService.update(id,name,size);
    }

    @MutationMapping
    public Coffee delete(@Argument Integer id) {
        return coffeeService.delete(id);
    }
}
