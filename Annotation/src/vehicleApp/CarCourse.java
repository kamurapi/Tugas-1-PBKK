package vehicleApp;

import org.springframework.stereotype.Component;

@Component
public class CarCourse implements VehicleCourse {

	@Override
	public Integer price() {
		return 100000;
	}

	@Override
	public Integer courseTime() {
		return 5;
	}

	@Override
	public String description() {
		return "Course for beginner car driver";
	}

	@Override
	public String benefit() {
		return "get SIM A";
	}

}
