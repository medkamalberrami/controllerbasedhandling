package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exceptions.NoBookFoundException;

@Service
public class BookServiceImp implements BookService{

	@Override
	public double findPriceById(String IdBook) {
		
		if(IdBook.equals("B101")) {
			return 450.00;
		}
		else {
			throw new NoBookFoundException("No book found with this giveb id");
		}
	}

}
