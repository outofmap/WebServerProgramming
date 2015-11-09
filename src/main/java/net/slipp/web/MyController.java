package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/test")
	public String home(long id){
		// prefix/view.jsp(suffix)
		return "test";
	}
}
