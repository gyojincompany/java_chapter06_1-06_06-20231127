package ch6_5;

public class MainClass {
	
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st1 = new StaticTest();
		a = 10;
		int result = st1.sum(10, 20);
		
		int result2 = StaticTest.add(10, 20);//정적메소드를 호출(객체 선언 없이 호출 가능)
		
		//StaticTest.PI = 100;->final로 선언된 final필드이므로 변경 불가
		
		double area = 10*10*StaticTest.PI;//원의 넓이
		
		System.out.print(area);
		
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
	}

}
