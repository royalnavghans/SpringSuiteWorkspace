package com.royal.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.royal.product.Products;
import com.royal.productService.AddResponse;
import com.royal.productService.ProductsServiceImpl;

@RestController
public class ProductController {
    @Autowired
	ProductsServiceImpl product;
    
    @GetMapping("/product/{id}")
    public Products find(@PathVariable int id) {
		return product.find(id);
	}
    
    @GetMapping("/products")
    public List findAll() {
    	return product.findAll();
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Products prod) {
    	product.addProduct(prod);
    }
    @PostMapping("/products")
    public void addProducts(List<Products> prod) {
    	product.addProducts(prod);
    }
    @PutMapping("/products")
   public Products update(@RequestBody Products prod) {
	  return  product.updateProduct(prod);
   }
    @DeleteMapping("/products/{id}")
    public AddResponse delete(@PathVariable int id) {
    	return product.deleteProduct(id);
    }
}
