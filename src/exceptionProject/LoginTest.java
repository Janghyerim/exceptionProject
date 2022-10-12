package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id 입력 : ");
		id = sc.next();
		
		System.out.println("password 입력 : ");
		password = sc.nextInt();
		

		if(!id.equals("tis")) {  //문자열 (String)비교 시 .equals() 사용해야 한다.  // ==,!= 
			//예외처리
			//아이디가 불일치 합니다.
			try {
				throw new LoginIdException ("아이디가 불일치 합니다.");
			}catch(LoginIdException e) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
			
		if(password != 1234) {
			//예외처리
			//비밀번호가 불일치 합니다.
			try {
				throw new LoginPwException ("비밀번호가 불일치 합니다.");
			}catch(LoginPwException e) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		if(id.contentEquals("tis") && password == 1234) {
			System.out.println("로그인 성공");
		}
		
		
	}

}
