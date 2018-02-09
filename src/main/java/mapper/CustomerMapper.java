package mapper;

import java.util.List;
import java.util.Map;

import model.Customer;

public interface CustomerMapper {
	
	public Customer get(String customercode);
	
	public List<Customer> list(Map<String,String> map);
}
