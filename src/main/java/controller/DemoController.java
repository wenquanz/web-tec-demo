package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/welcome")
	public String welcome(Model model){
		model.addAttribute("message", "welcome to demo");
		return "welcome";
	}

	@RequestMapping("/welcome")
	public String home(Model model){
		return "home";
	}
}
