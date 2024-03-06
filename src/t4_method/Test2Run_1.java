package t4_method;

import java.util.Scanner;

public class Test2Run_1 {
	public static void main(String[] args) {
		Test2_1 t2 = new Test2_1();
		int res;
		
		t2.mod1();
		res = t2.mod2(50);
		System.out.println("res : " + res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수? ");
		int su1 = sc.nextInt();
		System.out.print("두번째 수? ");
		int su2 = sc.nextInt();
		
		res = t2.add(su1, su2);
		System.out.println(su1 +  " + "+su2+" = " + res);
		
		// 뺴기 (sub)
		res = t2.sub(su1, su2);
		System.out.println(su1 +  " - "+su2+" = " + res);
		
		// 곱하기 (mul)
		res = t2.mul(su1, su2);
		System.out.println(su1 +  " * "+su2+" = " + res);
		
		// 나누기 (div)
		double res2 = t2.div(su1, su2);
		System.out.printf("%d / %d = %.1f", su1, su2, res2);
	}
}
