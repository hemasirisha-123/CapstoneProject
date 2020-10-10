package com.demo.service;

import java.util.List;



import com.demo.exception.BusinessException;
import com.demo.model.Fooditem;


public interface FooditemsService {
 
	public Fooditem addFooditem(Fooditem kitchen);
	public Fooditem updateFooditem(Fooditem kitchen);
	public Fooditem getFooditemById(int id) throws BusinessException;
	public void deleteFooditemById(int id);
	public List<Fooditem> getAllFooditems();
	public List<Fooditem> getAllFooditemsByCost(int cost);
}

