package ch6_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();//기본 생성자 호출
		
		Car car2 = new Car(80, 1000);//speed, rpm을 초기화하는 생성자 호출
		
		Car car3 = new Car("소나타", "검정", 200);//name, color, maxspeed를 초기화하는 생성자 호출
		
		System.out.println(car3.model);
		
		Korean kor1 = new Korean("홍길동", "123456-4567812");
		
	}

}
