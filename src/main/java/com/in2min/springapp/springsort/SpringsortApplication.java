package com.in2min.springapp.springsort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringsortApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringsortApplication.class, args);
		ctx.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgo());
		binarySearch.search(new int[] {10,23,45},8);


	}

}
