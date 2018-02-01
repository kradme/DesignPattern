package cn.lang.introduceNullObject;

public class Customer {
	
	private String name;
	private String plan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public boolean isNull() {
		return false;
	}
	static Customer newNull() {
		return new NullCustomer();
	}
	
}
