package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class Mcontroller {
	@ResponseBody
	@RequestMapping("/suger")
	public String giveSuger() {
		return "HELLO SUGER IS HERE::::";
	}

}
