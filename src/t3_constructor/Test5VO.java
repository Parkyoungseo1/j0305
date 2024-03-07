package t3_constructor;

public class Test5VO {
	private String name;
	private String mid;
	private String password;
	private int age;
	private boolean genger;
	private String address;
	
	public Test5VO() {}
	
	public Test5VO(String name, String mid, String password, int age, boolean genger, String address) {
		super();
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.genger = genger;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGenger() {
		return genger;
	}
	public void setGenger(boolean genger) {
		this.genger = genger;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
