package myfirstapi.repository;

import myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

	private ProductRepository productRepository;

	@BeforeEach
	void setup() {
		AtomicLong nextId = new AtomicLong(1);
		this.productRepository = new ProductRepository();
	}

	@Test
	void findAll() {
		List<Product> allProducts = productRepository.findAll();
		assertNotNull(allProducts);
		assertFalse(allProducts.isEmpty());
		assertEquals(3, allProducts.size());
	}

	@Test
	void findById() {
		Optional<Product> product = productRepository.findById((long) 1);
		assertNotNull(product.isPresent());
		Product foundProduct = product.get();
		assertTrue(productRepository.getProducts().contains(foundProduct));
	}

	@Test
	void save() {
		Product newProduct = new Product("Grapes", 500);
		productRepository.save(newProduct);
		assertTrue(productRepository.getProducts().contains(newProduct));
	}
}