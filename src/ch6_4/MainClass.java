package ch6_4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator();
		
		int result = cal1.sum(10, 20);//sum은 리턴값이 있는 메소드
		
		System.out.println(result);
		
		cal1.print();//print는 리턴값이 없는 메소드
		int result2 = cal1.sum();
		
		cal1.abc(100);
	}

}
