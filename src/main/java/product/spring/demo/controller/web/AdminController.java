package product.spring.demo.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/admin")
public class AdminController {

	//@Autowired
//	private ProductService productService;
	
	@RequestMapping(value = {"/", ""})
	public String index() {
		return "homeAdminPage";
	}

	//PRODUCT START
	@RequestMapping(value = "/product")
	public ModelAndView products() {
		ModelAndView m = new ModelAndView("productListAdminPage");
		m.addObject("msg", "Spring Hello1");
		//m.addObject("allProduct", productService.getAllProduct());
		return m;
	}
	
	@RequestMapping(value = "/product/create")
	public ModelAndView createProduct() {
		ModelAndView m = new ModelAndView("createProductAdminPage");
		return m;
	}
	
	@RequestMapping(value = "/product/edit/{id}")
	public ModelAndView editProduct() {
		ModelAndView m = new ModelAndView("editProductAdminPage");
		return m;
	}
	
	@RequestMapping(value = "/product/delete/{id}")
	public ModelAndView deleteProduct() {
		ModelAndView m = new ModelAndView();
		return m;
	}

}
