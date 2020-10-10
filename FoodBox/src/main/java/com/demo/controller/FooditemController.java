package com.demo.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exception.BusinessException;
import com.demo.model.Fooditem;

import com.demo.service.FooditemsService;




//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FooditemController {
	@Autowired
	private FooditemsService service;
	
	private MultiValueMap<String, String> map;

	@PostMapping("/Fooditem")
	public Fooditem addFooditem(@RequestBody Fooditem kitchen) {

		return service.addFooditem(kitchen);
	}

	@PutMapping("/Fooditem")
	public Fooditem updateFooditem(@RequestBody Fooditem kitchen) {

		return service.updateFooditem(kitchen);
	}

	@GetMapping("/Fooditem/{id}")
	public ResponseEntity<Fooditem> getFooditemById(@PathVariable int id) {

		try {
			return new ResponseEntity<>(service.getFooditemById(id),HttpStatus.OK);
		} catch (BusinessException e) {
			map=new LinkedMultiValueMap<>();
			map.add("errorMessage", e.getMessage());
			return new ResponseEntity<>(null,map, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/Fooditems/{id}")
	public void deleteFooditemById(@PathVariable int id) {
		service.deleteFooditemById(id);

	}

	@GetMapping("/Fooditems")
	public List<Fooditem> getAllFooditems() {

		return service.getAllFooditems();
	}

	@GetMapping("/Fooditems/cost/{cost}")
	public List<Fooditem> getAllFooditemsByCost(@PathVariable int cost) {
		
		return service.getAllFooditemsByCost(cost);
	}

	
}

