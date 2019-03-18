package vehicleApp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("ini.properties")
public class UserConfig {

	//IOC
		//1.Create Object
		@Bean
		public User customer()
		{
			Customer customer = new Customer();
			return customer;
		}
		
		@Bean
		public VehicleCourse carCourse()
		{
			CarCourse carCourse = new CarCourse();
			return carCourse;
		}
		
		//DEPENDENCY INJECTION
		@Bean
		public User customer(VehicleCourse vehicleCourse)
		{
			Customer customer2 = new Customer(carCourse());
			return customer2;
		}
		
	
}
