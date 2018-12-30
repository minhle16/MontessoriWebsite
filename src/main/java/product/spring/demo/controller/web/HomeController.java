package product.spring.demo.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "", "/index" })
	public ModelAndView index() {
		ModelAndView m = new ModelAndView("homePage");
		return m;
	}

}
