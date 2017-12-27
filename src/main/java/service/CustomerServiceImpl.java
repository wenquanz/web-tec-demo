package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CustomerMapper;
import model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer get(String customercode) {
		if(customercode == null || "".equals(customercode))
			return null;
		return customerMapper.get(customercode);
	}

}
