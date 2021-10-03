package com.rest.api.bootstrap;

import com.rest.api.domain.Category;
import com.rest.api.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepo categoryRepo;

    @Autowired
    public Bootstrap(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepo.save(fruits);
        categoryRepo.save(dried);
        categoryRepo.save(fresh);
        categoryRepo.save(exotic);

        System.out.println("Data Loaded " + categoryRepo.count());

















    }
}
