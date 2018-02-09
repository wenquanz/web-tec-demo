package service;


import java.util.List;
import java.util.Map;

import model.Customer;

public interface CustomerService {
	
	public Customer get(String customername);
	
	public List<Customer> list(Map<String,String> map);

}
