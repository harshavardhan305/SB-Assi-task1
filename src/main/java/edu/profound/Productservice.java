package edu.profound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Productservice {
	
	Product m1=new Product("Dell Latitude 5420,Lenovo T14 Gen2","Laptop,Washing Machine","Electronics","1223");
	Product m2=new Product("lll","samsung","clothing","233");
	Product m3=new Product("xxx","redmi","physics","345");
	
	List<Product> mlist=new ArrayList<Product>(Arrays.asList(m1,m2,m3));
	
	public List<Product> getproduct()
	{
		return mlist;
	}
	
	public  Product getproduct(String productName)
	{
		Product m1=null;
		for(Product product:mlist)
		{
			if(product.getProductName().equals(product))
			{
				m1=product;
			}
		}
		return m1;
	}
	
	public void addproduct(Product m1)
	{
		mlist.add(m1);
	}
	
	public List<Product> deleteproduct(String productName)
	{
		for(Product m1:mlist)
		{
			if(m1.getProductName().equals(productName))
			{
				mlist.remove(m1);
			}
		}
		
		return mlist;
	}
	
	

}
