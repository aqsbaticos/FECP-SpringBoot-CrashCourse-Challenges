package myfirstapi.controller;

import jakarta.validation.Valid;
import myfirstapi.model.Product; // Import your Product model
import myfirstapi.repository.ProductRepository; // Import your ProductRepository
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController // This annotation makes it a REST controller
public class ProductController {

	private final ProductRepository productRepository; // Declare the dependency

	// Constructor Injection: Spring will automatically provide ProductRepository here
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	// We will add methods here in the next steps
	@GetMapping("/products") // Maps HTTP GET requests to /products
	public List<Product> getAllProducts() {
		return productRepository.findAll(); // Call our repository to get all products
	}

	@GetMapping("/products/{id}") // {id} is a path variable
	public ResponseEntity<Product> getProductById(@Valid @PathVariable Long id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Product with ID " + id + " not found"));
		return ResponseEntity.ok(product);
	}

	@PostMapping("/products") // Maps HTTP POST requests to /products
	@ResponseStatus(HttpStatus.CREATED) // Optional: Returns 201 Created by default for POST success
	public Product createProduct(@Valid @RequestBody Product newProduct) {
		// newProduct object automatically populated from JSON in request body
		return productRepository.save(newProduct); // Save and return the saved product (with its new ID)
	}
}