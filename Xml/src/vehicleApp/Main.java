package vehicleApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		User customer = context.getBean("profil", User.class);
		
		Customer dimas = (Customer)customer;
		
		System.out.println(dimas.toString());
		System.out.println("Course Description : " + dimas.getCourse().description());
		System.out.println("Course Price : " + dimas.getCourse().price());
		
		
		context.close();
	}

}




