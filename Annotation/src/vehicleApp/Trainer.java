package vehicleApp;

public class Trainer implements User {

	public VehicleCourse course;
	
	private int id;
	private String name;
	private int license;
	
	@Override
	public String desscription() {
		// TODO Auto-generated method stub
		return "User Trainer type that learn from this Vehicle Course";
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(VehicleCourse course) {
		super();
		this.course = course;
	}

	public VehicleCourse getCourse() {
		return course;
	}

	public void setCourse(VehicleCourse course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

}
