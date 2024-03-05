package t1_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		if(t1 == t2) {
			System.out.println("t1객체와 t2객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t2객체는 서로 다른 객체입니다.");
		}
		
		Test1 t3;
		t3 = t1;
		if(t1 == t3) {
			System.out.println("t1객체와 t3객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t3객체는 서로 다른 객체입니다.");
		}
		
		Test1 t4 = null;
		if(t1 == t4) {
			System.out.println("t1객체와 t4객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("t1객체와 t4객체는 서로 다른 객체입니다.");
		}
		
		if(t4 == null) {
			System.out.println("t4는 null입니다.");
		}
		else {
			System.out.println("t4는 null이 아닙니다.");
		}
		// null비교시는 '== / !='로 비교해야 한다. 아래는 실행오류 발생
//		if(t4.equals(null)) {
//			System.out.println("t4는 null입니다.");
//		}
//		else {
//			System.out.println("t4는 null이 아닙니다.");
//		}
	}
}
