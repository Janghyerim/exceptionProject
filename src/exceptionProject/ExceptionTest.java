package exceptionProject;

public class ExceptionTest {  //예외 발생

	public static void main(String[] args) {
		
		//예외처리 : 코드상에서 개발자가 인지할 수 있는 실행시 문제점을 해결하는 것.
//		try {
//			실행문장; //예외를 발생시킬 수 있는 구문
//		}catch(예외타입){
//			예외처리 구문
//		}
		
//		Exception
//		
//		for(int i=0;i<100;i++) {
//			try {
//				int r = (int)(Math.random()*10);  //0 ~ 9
//				System.out.println(r);
//				int result = 10 / r;  //정수를 0으로 나눌 수 없다. -> 예외발생 
//			}catch(ArithmeticException e) { //오류문장을 타입으로 적어준다.  java.lang./**ArithmeticException*/: / by zero
//				System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
//			}
//
//		}
		
		int[] arr = new int [5]; //0 ~ 4
		
		try {
			int r = (int)(Math.random()*10);  //0 ~ 9
			System.out.println(r);
			int result = 10 / r;  //정수를 0으로 나눌 수 없다. -> 예외발생
			arr[5] = 10;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {  //예외구문 잘 모르겠으면 Exception(상위)이라고 적어도 예외처리 하는데 무방하다.
			System.out.println("index number 오류");
		}catch(Exception e) { 
			System.out.println("모든 예외 처리");
		}finally {  //예외발생 유무와 상관없이 실행 하는 구문
			System.out.println("예외발생 유무와 상관없이 실행");
		}

		
//		arr[3] = 10;
//		System.out.println(arr[3]);
//		
//		try {
//			throw new Exception("고의로 예외발생"); //고의로 예외발생
//		}catch(Exception e) {
//			System.out.println(e.getMessage());  //null
//			e.printStackTrace(); //예외 오류문 발생    >>printStackTrace : 스택에 있는걸 추적하고 출력한다는 뜻.
//		}
		
//		add(); //메소드 호출하기
//		
//		//ArithmeticException.... 구문 사용정의
//		//catch문 타입
//		//throw에서 강제 예외
//		//throws에서 예외 선언
//		
//		
//		try {  //나를썼을때 위험하니 니가 써도되지만 알아서 처리해라 라는 try구문.
//			sub();
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		
//
//	} //main() end
//	
//	static void add() {
//		try {  //try-catch구문으로 실행해야 에러 안남.
//		    throw new Exception("add() 예외발생");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	} //add() end 
//	
//	static void sub() throws ArithmeticException{  //예외 선언하기
//		throw new ArithmeticException("sub() 예외발생");
//	}

}
}
