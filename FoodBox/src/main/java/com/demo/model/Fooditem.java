package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
public class Fooditem {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int cost;
	private String  cuisine;
	private String description;
	private String offers;
	
	
	
	public Fooditem(String name, int cost, String cuisine, String description, String offers) {
		super();
		this.name = name;
		this.cost = cost;
		this.cuisine = cuisine;
		this.description = description;
		this.offers = offers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

}
