package ch6_5;

public class StaticTest {
	
	//객체를 선언하지 않아도 사용할 수 있는 변수
	static final double PI = 3.141592;//필드를 선언할 때 자료타입 앞에 static을 표기하면 정적 멤버가 됨->상수로 사용
	int radius;//반지름 값->인스턴스 멤버->객체가 선언되야지만 사용할 수 있는 필드
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	//객체를 선언하지 않아도 사용할 수 있는 메소드
	public static int add(int x, int y) {//정적 멤버->메모리에 객체가 생성되지 않아도 호출 가능한 메소드
		//this.radius; 정적 메소드내에 인스턴스 멤버 사용 불가
		return x+y;
	}
	
}
