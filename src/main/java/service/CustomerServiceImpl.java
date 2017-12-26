package service;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.CustomerMapper;
import model.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer get(String customercode) {
		if(customercode == null || "".equals(customercode))
			return null;
		return customerMapper.get(customercode);
	}

}
