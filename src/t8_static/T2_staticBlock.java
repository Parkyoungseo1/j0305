package t8_static;

public class T2_staticBlock {
	int field1;
	static int field2;
	
	void method1() {}
	static void method2() {}
	
	// 정적 블록
	static {		
		field2 = 200;
		method2();
		
		// field1 = 100; 정적블록은 정적만 옴
		//method1();
	}
}
