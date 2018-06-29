package com.company.day20w4;

public class LunchOrderBean {

	private String bread, condiments, dressing, meat;

	public LunchOrderBean() {
		super();
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	@Override
	public String toString() {
		return "LunchOrderBean [bread=" + bread + ", condiments=" + condiments + ", dressing=" + dressing + ", meat="
				+ meat + "]";
	}
	
	
	
}
