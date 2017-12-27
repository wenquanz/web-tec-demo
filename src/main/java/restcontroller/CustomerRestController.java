package restcontroller;

import model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service.CustomerService;


@RestController
@RequestMapping("customer")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("get")
	public @ResponseBody String home(){
		return "hello";
	}
	
	@RequestMapping("{customercode}")
	public @ResponseBody Customer get(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		return customer;
	}
}