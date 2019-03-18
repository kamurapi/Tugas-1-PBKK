package vehicleApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer implements User {

	@Autowired
	@Qualifier("carCourse")
	private VehicleCourse course;
	private int id;
	private String name;
	private String email;
	private String nohp;
	
	public String desscription() {
		// TODO Auto-generated method stub
		return "User Customer type that learn from this Vehicle Course";
	}

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(VehicleCourse course) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", nohp=" + nohp + "]";
	}
	
	
	

}
