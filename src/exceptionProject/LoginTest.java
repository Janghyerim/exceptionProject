package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id �Է� : ");
		id = sc.next();
		
		System.out.println("password �Է� : ");
		password = sc.nextInt();
		

		if(!id.equals("tis")) {  //���ڿ� (String)�� �� .equals() ����ؾ� �Ѵ�.  // ==,!= 
			//����ó��
			//���̵� ����ġ �մϴ�.
			try {
				throw new LoginIdException ("���̵� ����ġ �մϴ�.");
			}catch(LoginIdException e) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
			
		if(password != 1234) {
			//����ó��
			//��й�ȣ�� ����ġ �մϴ�.
			try {
				throw new LoginPwException ("��й�ȣ�� ����ġ �մϴ�.");
			}catch(LoginPwException e) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		if(id.contentEquals("tis") && password == 1234) {
			System.out.println("�α��� ����");
		}
		
		
	}

}
