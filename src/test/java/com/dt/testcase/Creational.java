package com.dt.testcase;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dt.creational.builder.Phone;
import com.dt.creational.builder.PhoneBuilder;
import com.dt.creational.factory.Plan;
import com.dt.creational.factory.PlanFactory;
import com.dt.creational.singleton.SingletonDP;

public class Creational {

	@Test
	public void factory() {
		PlanFactory planFactory = new PlanFactory();
		Plan plan = planFactory.getInstance("Domestic");
		assertTrue(plan.display().equals("DomesticPlan")); 
		plan = planFactory.getInstance("Commercial");
		assertTrue(plan.display().equals("CommercialPlan"));
	}
	
	@Test
	public void builder() {
		Phone phone = new PhoneBuilder().setCamera(16).setModel("Samsung").getPhone();
		assertTrue(phone.getCamera() == 16);
		assertTrue(phone.getModel().equals("Samsung"));
		assertTrue(phone.getoS() == null);
	}
	
	@Test
	public void singleton() {
		/*
		 * SingletonDP cannot be instantiated as the constructor is a private entity 
		 * and cannot be accessed from outside the class, below code will not work
		 * SingletonDP sdp = new SingletonDP();
		 */	
		SingletonDP sdp1 = SingletonDP.getInstance();
		sdp1.setName("Singletone");
		SingletonDP sdp2 = SingletonDP.getInstance();
		assertTrue(sdp2.getName().equals("Singletone"));
		sdp2.setName("SecondName");
		assertTrue(sdp1.getName().equals("SecondName"));
	}

}
