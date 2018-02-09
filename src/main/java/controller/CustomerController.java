package controller;

import model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	

	/*public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}*/

	@RequestMapping("/get")
	public @ResponseBody String home(){
		return "hello";
	}
	
	@GetMapping("/customer/{customercode}")
	public @ResponseBody Customer get(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		return customer;
	}
}
