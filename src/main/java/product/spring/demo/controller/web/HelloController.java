package product.spring.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.spring.demo.service.ProductService;

@Controller
public class HelloController {

	@Autowired
	private ProductService service;
	
	@RequestMapping(value = {"/", "", "/index" })
	public String index() {
		return "homePage";
	}

	@RequestMapping(value = "/product")
	public ModelAndView products() {
		
		ModelAndView m = new ModelAndView("productListPage");
		m.addObject("msg", "Spring Hello");
				
		m.addObject("msg", "Spring Hello1");
		m.addObject("allProduct", service.getAllProduct());
		return m;
	}

}
