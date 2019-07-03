package com.dt.creational.factory;

public class PlanFactory {
	public Plan getInstance(String str) {
		if(str.equalsIgnoreCase("domestic")) 
		{
			return new DomesticPlan();
		}
		else if(str.equalsIgnoreCase("commercial"))
		{
			return new CommercialPlan();
		}
		else 
		{
			return null;
		}
	}

}
