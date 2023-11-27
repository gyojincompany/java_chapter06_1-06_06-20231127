package ch6_5;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SingleTonTest single1 = new SingleTonTest();
//		SingleTonTest single2 = new SingleTonTest();
//		SingleTonTest single3 = new SingleTonTest();
		
		SingleTonTest single1 = SingleTonTest.getInstance();//객체 불러오기
		SingleTonTest single2 = SingleTonTest.getInstance();//객체 불러오기
		SingleTonTest single3 = SingleTonTest.getInstance();//객체 불러오기
		
		
		

	}

}
