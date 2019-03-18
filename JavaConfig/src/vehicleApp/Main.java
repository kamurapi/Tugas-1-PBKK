package vehicleApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Create IoC 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		
		Customer dimas = context.getBean("customer", Customer.class);
		
		System.out.println(dimas);
		System.out.println(dimas.desscription());
		System.out.println("Course Description : " + dimas.getCourse().description());
		System.out.println("Course Price : " + dimas.getCourse().price());
		
		
		context.close();
	}

}




