package edu.profound;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productctrl {
	
	@Autowired
	Productservice productservice;
	
	@RequestMapping(method=RequestMethod.GET,value="/product")
	public List<Product> getproducts()
	{
		return productservice.getproduct();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/product/{productname}")
	public Product getproducts(@PathVariable String productname)
	{
		return productservice.getproduct(productname);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/product")
	public void addproducts(@RequestBody Product m1)
	{
	productservice.addproduct(m1);
	}
	
	

	@RequestMapping(method=RequestMethod.DELETE,value="/product/{productname}")
	public List<Product> deleteproducts(@PathVariable String productname)
	{
		return productservice.deleteproduct(productname);
	}
	
	
}
