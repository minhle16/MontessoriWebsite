package product.spring.demo.controller.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.spring.demo.vo.ProductVo;

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

	@RequestMapping(value = "/product")
	public ModelAndView products() {
		
		ModelAndView m = new ModelAndView("product");
		m.addObject("msg", "Spring Hello");
		List<ProductVo> productList = new ArrayList<>();

		ProductVo p1 = new ProductVo();
		p1.setId(1);
		p1.setName("Product1");
		p1.setPrice("3000$");
		p1.setActive(true);
		
		ProductVo p2 = new ProductVo();
		p1.setId(2);
		p1.setName("Product2");
		p1.setPrice("2000$");
		p1.setActive(false);
		
		productList.add(p1);
		productList.add(p2);

		m.addObject("msg", "Spring Hello1");
		m.addObject("allProduct", productList);
		return m;
	}
	
//
//	@RequestMapping(value = "/hello")
//	public String hello(HttpServletRequest request, HttpServletResponse response) {
//		request.setAttribute("title", "Hello Spring MVC");
//		return "hello";
//	}

}
