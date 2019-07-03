package com.dt.creational.builder;

public class PhoneBuilder {
	private String model;
	private String oS;
	private int screenSize;
	private int camera;
	private int memory;
	private Phone phone;
	
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setoS(String oS) {
		this.oS = oS;
		return this;
	}
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setMemory(int memory) {
		this.memory = memory;
		return this;
	}
	public Phone getPhone() {
		return new Phone(model, oS, screenSize, camera, memory);
	}
}
