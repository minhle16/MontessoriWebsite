package product.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.spring.demo.entities.Product;
import product.spring.demo.repositories.ProductRepository;
import product.spring.demo.vo.ProductVo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public List<ProductVo> getAllProduct() {
		List<Product> productList = repository.findAll();
		List<ProductVo> voList = new ArrayList<>();
		
		for (Product product : productList) {
			ProductVo vo = new ProductVo();
			
			vo.setId(product.getId());
			vo.setName(product.getName());
			vo.setPrice(product.getPrice());
			
			boolean active = product.getIsActive() == 1 ? true : false;
			vo.setActive(active);
			voList.add(vo);
		}
		return voList;
	}

}
