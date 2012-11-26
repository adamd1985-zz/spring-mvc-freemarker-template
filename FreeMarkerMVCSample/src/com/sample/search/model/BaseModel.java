package com.sample.search.model;

public abstract class BaseModel {
	
	String name;
	
	public BaseModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " [getName()=" + getName() + "]";
	}

}
