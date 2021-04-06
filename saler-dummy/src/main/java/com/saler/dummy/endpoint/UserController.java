package com.saler.dummy.endpoint;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saler.dummy.modal.Product;
import com.saler.dummy.service.ProductService;

@RestController
@RequestMapping(value = "/dummy")
public class UserController {
	//1

	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> productList() {
		List<Product> lists = null;
		HttpStatus status = HttpStatus.NO_CONTENT;
		try {
			lists = ProductService.getDummyProductList();
			status = HttpStatus.OK;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(lists, status);
	}
}
