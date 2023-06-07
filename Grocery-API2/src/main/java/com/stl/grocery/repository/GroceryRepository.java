package com.stl.grocery.repository;

import org.springframework.data.repository.CrudRepository;

import com.stl.grocery.entity.Grocery;

public interface GroceryRepository extends CrudRepository<Grocery, String>{

}
