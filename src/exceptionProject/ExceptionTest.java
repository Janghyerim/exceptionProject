package exceptionProject;

public class ExceptionTest {  //���� �߻�

	public static void main(String[] args) {
		
		//����ó�� : �ڵ�󿡼� �����ڰ� ������ �� �ִ� ����� �������� �ذ��ϴ� ��.
//		try {
//			���๮��; //���ܸ� �߻���ų �� �ִ� ����
//		}catch(����Ÿ��){
//			����ó�� ����
//		}
		
//		Exception
//		
//		for(int i=0;i<100;i++) {
//			try {
//				int r = (int)(Math.random()*10);  //0 ~ 9
//				System.out.println(r);
//				int result = 10 / r;  //������ 0���� ���� �� ����. -> ���ܹ߻� 
//			}catch(ArithmeticException e) { //���������� Ÿ������ �����ش�.  java.lang./**ArithmeticException*/: / by zero
//				System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
//			}
//
//		}
		
		int[] arr = new int [5]; //0 ~ 4
		
		try {
			int r = (int)(Math.random()*10);  //0 ~ 9
			System.out.println(r);
			int result = 10 / r;  //������ 0���� ���� �� ����. -> ���ܹ߻�
			arr[5] = 10;
		}catch(ArithmeticException e) {
			System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {  //���ܱ��� �� �𸣰����� Exception(����)�̶�� ��� ����ó�� �ϴµ� �����ϴ�.
			System.out.println("index number ����");
		}catch(Exception e) { 
			System.out.println("��� ���� ó��");
		}finally {  //���ܹ߻� ������ ������� ���� �ϴ� ����
			System.out.println("���ܹ߻� ������ ������� ����");
		}

		
//		arr[3] = 10;
//		System.out.println(arr[3]);
//		
//		try {
//			throw new Exception("���Ƿ� ���ܹ߻�"); //���Ƿ� ���ܹ߻�
//		}catch(Exception e) {
//			System.out.println(e.getMessage());  //null
//			e.printStackTrace(); //���� ������ �߻�    >>printStackTrace : ���ÿ� �ִ°� �����ϰ� ����Ѵٴ� ��.
//		}
		
//		add(); //�޼ҵ� ȣ���ϱ�
//		
//		//ArithmeticException.... ���� �������
//		//catch�� Ÿ��
//		//throw���� ���� ����
//		//throws���� ���� ����
//		
//		
//		try {  //���������� �����ϴ� �ϰ� �ᵵ������ �˾Ƽ� ó���ض� ��� try����.
//			sub();
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		
//
//	} //main() end
//	
//	static void add() {
//		try {  //try-catch�������� �����ؾ� ���� �ȳ�.
//		    throw new Exception("add() ���ܹ߻�");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	} //add() end 
//	
//	static void sub() throws ArithmeticException{  //���� �����ϱ�
//		throw new ArithmeticException("sub() ���ܹ߻�");
//	}

}
}
