package home.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceView;
@Controller
public class Fcontroller {
	@RequestMapping("/cake")
	public String cake() {
		return"cake";

	/*@RequestMapping("/cake")
	public String cake() {
		return"WEB-INIF/view/cake.html";*/
	}

}
