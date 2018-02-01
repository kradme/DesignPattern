package cn.lang.introduceNullObject;

public class Site {
	
	private Customer customer;

	public Customer getCustomer() {
		
		return (customer==null)?customer.newNull():customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
