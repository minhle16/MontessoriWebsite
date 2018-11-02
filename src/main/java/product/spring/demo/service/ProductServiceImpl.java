package product.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

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

	@Override
	public boolean createProduct(ProductVo vo) {
		boolean result = false;
		try {
			//1. Create instance of Product
			Product product = new Product();
			//2 Convert data Vo to Entity
			//product.setId(vo.getId());
			product.setName(vo.getName());
			product.setPrice(vo.getPrice());
			
			//2... Convert Active boolean to Int
			int active = vo.isActive() == true ? 1 : 0;
			product.setIsActive(active);
			
			//3. Save Product to Database
			repository.save(product);
			result = true;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean updateProduct(ProductVo vo) {
		boolean result = false;
		try {
			//1. Create instance of Product
			Product product = repository.getOne(vo.getId());
			//2 Convert data Vo to Entity
			product.setName(vo.getName());
			product.setPrice(vo.getPrice());
			
			//2... Convert Active boolean to Int
			int active = vo.isActive() == true ? 1 : 0;
			product.setIsActive(active);
			
			//3. Save Product to Database
			repository.save(product);
			result = true;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteProduct(Integer id) {
		if (id != null) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

}
