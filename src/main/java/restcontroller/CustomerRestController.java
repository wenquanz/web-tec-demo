package restcontroller;

import java.util.List;
import java.util.Map;

import model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service.CustomerService;

/**
 * 除了数据本身，还有一些header要改动
 * 分页：
 * 
 * @author wenquanz
 *
 */
@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	//page pagesize sortby order
	@GetMapping("/customers")
	@ResponseBody
	public List<Customer> list(@PathVariable Map<String,String> map){
		return customerService.list(map);
	}
	
	@PostMapping(path="/customers")
	@ResponseBody
	public  Customer insert(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		System.out.println("insert");
		return customer;
	}
	
	@GetMapping(path="/customers/{customercode}")
	public @ResponseBody Customer get(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		return customer;
	}
	
	@PutMapping(path="/customers/{customercode}")
	@ResponseBody
	public  Customer update(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		System.out.println("post");
		return customer;
	}
	
	@DeleteMapping(path="/customers/{customercode}")
	@ResponseBody
	public  Customer delete(@PathVariable String customercode){
		Customer customer = customerService.get(customercode);
		System.out.println("post");
		return customer;
	}

}