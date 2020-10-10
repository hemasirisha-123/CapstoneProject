package com.demo.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Fooditem;



@Repository
public interface FooditemsRepository  extends JpaRepository<Fooditem, Integer> {

		public List<Fooditem> findByCost(int cost);
	}
