package ch6_3;

public class Car {
	
	String company;//제작회사 이름
	String model;//모델
	String color;//색깔
	int maxSpeed;//최고 속도
	
	int speed;//현재 속도
	int rpm;//엔진 회전 수	
	
	public void abc(int age, int grade, String name) {
		
		
	}
	
	
	public void abc(int a, int b) {
		
	}
	
	//생성자 오버로딩 -> 매개변수가 다른 3개의 생성자를 선언
	public Car( ) {//기본 생성자
		
	}
	
	public Car(int speed, int rpm) {
		this.speed = speed;
		this.rpm = rpm;
	}
	
	//자바의 생성자는 해당 클래스의 이름으로 메서드를 만들면 생성자가 됨
	public Car(String carName, String carColor, int carMaxSpeed) { // 생성자->Car클래스로 객체를 선언할때 자동으로 실행되는 메서드
		//System.out.println("Car클래스의 생성자가 실행됨!!");
		this.model = carName;
		this.color = carColor;
		this.maxSpeed = carMaxSpeed;
	}
	
}
