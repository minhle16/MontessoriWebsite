package product.spring.demo.controller.web;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import product.spring.demo.model.Product;

@Controller
public class HelloController {

	@RequestMapping(value = { "/", "", "/index" })
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/product")
	public ModelAndView products() {
		ModelAndView m = new ModelAndView();
		m.setView(new View() {
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				// TODO Auto-generated method stub
//				request.setAttribute("msg", "Spring Hello");
				List<Product> productList = new ArrayList<>();
		
				Product p1 = new Product();
				p1.setId(1);
				p1.setName("Product1");
				p1.setPrice("3000$");
				productList.add(p1);
		
				request.setAttribute("msg", "Spring Hello");
				request.setAttribute("allProduct", productList);
				
				request.getRequestDispatcher("\\WEB-INF\\views\\product.jsp").forward(request, response);
			}
		});
		
//		m.setViewName("product");
		
//		m.addObject("msg", "Spring Hello");
//		List<Product> productList = new ArrayList<>();
//
//		Product p1 = new Product();
//		p1.setId(1);
//		p1.setName("Product1");
//		p1.setPrice("3000$");
//		productList.add(p1);
//
//		m.addObject("msg", "Spring Hello");
//		m.addObject("allProduct", productList);
		return m;
	}

	@RequestMapping(value = "/hello")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("title", "Hello Spring MVC");
		return "hello";
	}
	
	

}
