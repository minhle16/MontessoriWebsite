package product.spring.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//	@RequestMapping(value = {"/", "", "/index" })
//	public String index(Model model) {
//		model.addAttribute("msg", "Test Model");
//		return "index";
//	}
	
	@RequestMapping(value = {"/", "", "/index" })
	public String index() {
		return "homePage";
	}
	

//	@RequestMapping(value = "/product")
//	public ModelAndView products() {
//		
//		ModelAndView m = new ModelAndView("product");
//		m.addObject("msg", "Spring Hello");
//		List<Product> productList = new ArrayList<>();
//
//		Product p1 = new Product();
//		p1.setId(1);
//		p1.setName("Product1");
//		p1.setPrice("3000$");
//		productList.add(p1);
//
//		m.addObject("msg", "Spring Hello1");
//		m.addObject("allProduct", productList);
//		return m;
//	}
//
//	@RequestMapping(value = "/hello")
//	public String hello(HttpServletRequest request, HttpServletResponse response) {
//		request.setAttribute("title", "Hello Spring MVC");
//		return "hello";
//	}

}
