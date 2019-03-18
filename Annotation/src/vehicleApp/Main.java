package vehicleApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		User dimas = context.getBean("customer", User.class);
		Customer dimas2 = (Customer)dimas;
		
		dimas2.setId(001);
		dimas2.setName("Dimas Kamurapi");
		dimas2.setEmail("dkamurapi@gmail.com");
		dimas2.setNohp("081259988776");
		System.out.println("profile");
		
		System.out.println(dimas2.toString());
		System.out.println("Course Description : " + dimas2.getCourse().description());
		System.out.println("Course Price : " + dimas2.getCourse().price());
		
		
		context.close();
	}

}




