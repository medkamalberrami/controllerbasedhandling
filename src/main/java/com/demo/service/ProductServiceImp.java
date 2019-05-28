package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exceptions.NoProductFoundException;
import com.demo.model.Product;

@Service
public class ProductServiceImp implements ProductService {

	@Override
	public Product findProductById(Integer pId) {

		if(pId==101) {
			
			return new Product("101", "keyboard", 800.00);
		}
		else {
			
			throw new NoProductFoundException("No produt found");
			
		}

	}

}
