package com.company.day21w5_factoryInClassTest;

import com.company.day21w5.Bike;
import com.company.day21w5.Vehicle;

public class GetPlanFactory {

	
	public Plan createPlan(char i) {
		switch (i) {
        case 'D':  return new DomesticPlan();
        case 'C':  return new CommercialPlan();
        case 'I':  return new InstitutionalPlan();
        case 'd':  return new DomesticPlan();
        case 'c':  return new CommercialPlan();
        case 'i':  return new InstitutionalPlan();
        default: return new DomesticPlan();
    }
	}
}
