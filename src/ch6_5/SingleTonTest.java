package ch6_5;

public class SingleTonTest {
	
	private SingleTonTest() {//생성자의 접근을 제한함->private
		
	}
	
	private static SingleTonTest singleTonTest = new SingleTonTest();//객체 생성
	
	public static SingleTonTest getInstance() {
		
		return singleTonTest;
	}
	

}
