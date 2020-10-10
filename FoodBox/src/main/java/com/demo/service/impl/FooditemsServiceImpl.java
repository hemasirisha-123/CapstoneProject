package com.demo.service.impl;

import java.util.List;




import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.FooditemsRepository;

import com.demo.exception.BusinessException;
import com.demo.model.Fooditem;

import com.demo.service.FooditemsService;


@Service
public  class FooditemsServiceImpl implements FooditemsService {
	@Autowired
	private FooditemsRepository dao;

	@Override
	public Fooditem addFooditem(Fooditem kitchen) {

		return dao.save(kitchen);
	}

	@Override
	public Fooditem updateFooditem(Fooditem kitchen) {

		return dao.save(kitchen);
	}

	@Override
	public Fooditem getFooditemById(int id)  throws BusinessException{
		if(id<=0) {
			throw new BusinessException("Entered id "+id+" is invalid");
		}
		Fooditem kitchen=null;
		try {
			kitchen=dao.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new BusinessException("No Food Item found for the id "+id);
		}
		
		return kitchen;
	}

	@Override
	public void deleteFooditemById(int id) {
		dao.deleteById(id);

	}

	@Override
	public List<Fooditem> getAllFooditems() {
		
		return dao.findAll();
	}
	@Override
	public List<Fooditem> getAllFooditemsByCost(int cost) {
		
		return dao.findByCost(cost);
	}


}