package product.spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import product.spring.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
