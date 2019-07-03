package com.dt.creational.singleton;

public class SingletonDP {
	private static SingletonDP singletonDP = new SingletonDP();
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingletonDP() {
	}

	public static SingletonDP getInstance() {
			return singletonDP;
	}
}
