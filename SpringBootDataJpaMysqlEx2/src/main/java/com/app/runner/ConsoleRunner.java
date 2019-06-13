package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
List<Product> prds=Arrays.asList(
		new Product(1,"AA",2.2),
		new Product(2,"BB",3.3),
		new Product(3,"CC",4.4),
		new Product(4,"DD",5.5),
		new Product(5,"EE",6.6),
		new Product(6,"FF",7.7)
		);

repo.saveAll(prds);
      //----findAll()----fetch all data in list----
/*List<Product> list=repo.findAll();
list.forEach(System.out::println);*/

//--findAll(Sort)---provide order by clause----
/*repo.findAll(
		Sort.by(Direction.DESC,"prodCode")
		
		).forEach(System.out::println);*/


//----findAll(Pageable)---fetch data based on pagination process---
/*PageRequest p=PageRequest.of(1,3);
repo.findAll(p)
.forEach(System.out::println);*/

//--findAll(Example)--not null row selected and compare with all other rows
Product p=new Product();
p.setProdCost(7.7);
Example<Product> ex=Example.of(p);
repo.findAll(ex).forEach(System.out::println);


//with Sort

/*Product p=new Product();
p.setProdCost(3.3);
Example<Product> ex=Example.of(p);
repo.findAll(ex,Sort.by(Direction.DESC,"prodCode")
		).forEach(System.out::println);*/
	
//with pagination
/*Product p=new Product();
p.setProdCost(3.3);
Example<Product> ex=Example.of(p);
repo.findAll(ex,PageRequest.of(0,2)
		).forEach(System.out::println);*/
	}
	

}
