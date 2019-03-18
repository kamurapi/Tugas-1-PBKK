package vehicleApp;

public class BoatCourse implements VehicleCourse {

	@Override
	public Integer price() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public Integer courseTime() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Course for beginner boat driver";
	}

	@Override
	public String benefit() {
		// TODO Auto-generated method stub
		return "no sim";
	}

}
