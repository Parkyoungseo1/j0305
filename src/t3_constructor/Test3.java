package t3_constructor;

public class Test3 {
	// 기본생성자
	Test3() {} // #1
	
	int atom = 30;
	int atom2;
	double atom3;
	
	Test3(int su1) {
		System.out.println("su1 : " + su1);
	} // #2
	
	Test3(int su1, int su2) { // #3
		atom = su1;
		atom2 = su2;
	}

	Test3(int atom, double atom3) { // #4
		this.atom = atom;
		this.atom3 = atom3;
	}
	
	Test3(double su2, int su1) {}
	
	//Test2(int atom1, int atom2) {}
}
