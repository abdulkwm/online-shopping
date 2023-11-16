package com.example.productservice;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Product product = Product.builder()
				.id("1")
				.name("apple")
				.description("this is apple")
				.price(new BigDecimal("19.99"))
				.build();
		Product product1 = Product.builder()
				.id("2")
				.name("apple")
				.description("this is apple")
				.price(new BigDecimal("19.99"))
				.build();
		Product product2 = Product.builder()
				.id("3")
				.name("apple")
				.description("this is apple")
				.price(new BigDecimal("19.99"))
				.build();
		productRepository.save(product);
		productRepository.save(product1);
		productRepository.save(product2);
	}
}
