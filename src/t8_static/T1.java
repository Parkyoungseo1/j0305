package t8_static;

public class T1 {
	// 인스턴스 필드
	//double pi = 3.141592;
	
	// 정적 필드 (메소드영역에 올라감)
	public static double pi = Math.PI; // 대문자로 쓰는게 관례 
	
	// 정적 메소드
	static double cicleArea(int r){
		double res = r * r * pi;
		return res;
	}
}
