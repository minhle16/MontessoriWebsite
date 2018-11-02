package product.spring.demo.service;

import java.util.List;

import product.spring.demo.vo.ProductVo;

public interface ProductService {
	//CRUD  1.Create, 2 Read, 3 Update
	
	//2.read => R
	List<ProductVo> getAllProduct();   
	
	//1.create => C
	boolean createProduct(ProductVo vo);
	
	//3.Update => U
	boolean updateProduct(ProductVo vo);
	
	//2.Read By ID
	//ProductVo getProductById(Integer id);
	
	boolean deleteProduct(Integer id);
}
