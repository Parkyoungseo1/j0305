package t11_Singleton;

public class Singleton {
	// 2.정적필드(자신의 객체타입으로 만들기)를 선언하고, 초기앖으로 객체를 생성시켜준다.
	private static Singleton singleton = new Singleton();
	
	// 1.객제를 외부에서 생성하지 못하도록 생성자앞에 private 접근제한자를 붙여준다.
	private Singleton() {}
	
	// 3.외부에서 호출하여 사용할수 있는 정적메소드(getInstance())를 만들어준다.
	static Singleton getInstance() {
		return singleton;
	}
}
