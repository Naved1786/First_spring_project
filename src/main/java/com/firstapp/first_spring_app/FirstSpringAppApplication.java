package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("hello all , this is our first Spring application");

		// tight coupling
//		Employee emp1=new Employee();
//		emp1.id=123;
//		emp1.name="Ajay";
//		emp1.email="ajay123@gmail.com";
//		emp1.designation="Developer";
//
//		Address adrs1=new Address();
//		adrs1.doorNo=3334;
//		adrs1.streetName="equisxn";
//		adrs1.city="vdvd";
//		emp1.address=adrs1;
		// when one object is dependent on the other object then it is called the tight coupling

//		System.out.println("emp1 : "+emp1);
//		System.out.println("adrs1 : "+adrs1);

//		adrs1.doorNo=6666;
//		adrs1.streetName="qqqqqqqqqqqqq";
//		adrs1.city="jjjjjj";
//		emp1.address=adrs1;

//		System.out.println("emp1 : "+emp1);
//		System.out.println("adrs1 : "+adrs1);

		Employee emp1=new Employee();
		emp1.setId(123);
		emp1.setName("ajay");
		emp1.setEmail("ajay123@gmail.com");
		emp1.setDesignation("developer");

		Address adrs1=new Address();
		adrs1.setDoorNo(333);
		adrs1.setStreetName("bbsshhh");
		adrs1.setCity("iumd");
		emp1.setAddress(adrs1);

		System.out.println("adrs1"+adrs1);
		System.out.println("emp1"+emp1);

	/*	adrs1.setDoorNo(555);
		adrs1.setStreetName("ppppp");
		adrs1.setCity("hyderabad");*/

		emp1.getAddress().setDoorNo(444);
		emp1.getAddress().setStreetName("oooooo");
		emp1.getAddress().setCity("yyyyyyy");

		System.out.println("adrs1"+adrs1);
		System.out.println("emp1"+emp1);

		/*Address adrs2=new Address(888,"jindal","vbvbvb");
		Employee emp2=new Employee(234,"jay","vijay123@gmail.com","developer", adrs2);*/
	}

}
