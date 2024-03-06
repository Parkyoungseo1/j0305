package t5_application;

public class StudentVO { // Value Object(VO)/Data Transfer Object(DTO)
	int no;
	String name;
	int age;
	boolean gender;
	String job;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}

// 저장하는걸 set 읽어오는걸 get
// set -> secter , get -> getter