package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping("/welcome")
	public @ResponseBody String welcome(Model model){
		return "welcome";
	}

}
