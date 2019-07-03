package com.dt.creational.builder;

public class Phone {
	private String model;
	private String oS;
	private int screenSize;
	private int camera;
	private int memory;
	
	public Phone(String model, String oS, int screenSize, int camera, int memory) {
		super();
		this.model = model;
		this.oS = oS;
		this.screenSize = screenSize;
		this.camera = camera;
		this.memory = memory;
	}
	
	public String getModel() {
		return model;
	}

	public String getoS() {
		return oS;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public int getCamera() {
		return camera;
	}

	public int getMemory() {
		return memory;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", oS=" + oS + ", screenSize=" + screenSize + ", camera=" + camera
				+ ", memory=" + memory + "]";
	}

}
