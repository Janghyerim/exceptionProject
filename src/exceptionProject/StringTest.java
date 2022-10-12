package exceptionProject;

public class StringTest {

	public static void main(String[] args) {  //String 활용법
		
		//charAt()
		//subString()
		//indexOf()
		//.equals()
		//valueOf()
		
//		String str1 = "abc";  //이걸로 숙지할 것.
//		String str2 = "def";  // 값이 같을 때 하나의 "abc"가 주소값 str1,str2로 같이 들어간다.
//		str1 = "가나다";
//		
//		str1 = str1 + str2; //"abcdef" 하나로 완성  값이 더해지면 기존 주소값에 합해지는게 아니고,새로운 주소값이 생긴다.
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
	
		String str3 = new String("abc");  //이렇게 잘 안씀.
		String str4 = new String("abc");   // 값이 같을 때  각각 "abc"가 주소값 str1,str2로 각각 들어간다.
		
		 //문자열 출력1               /**or "abc" or "abc".equals("abc")*/
		if(str3.equals(str4)) {  
			System.out.println("같은 문자열이다.");  //O
		}
//		
//		주소값 비교
//		if(str3 == str4) { 
//			//주소값
//			System.out.println("같은 문자열이다.");  //X
//		}else {
//			System.out.println("다른 문자열이다.");  //O
//		}
//		
//		//문자열 출력2
//		int x = 10;
//		String str = String.valueOf(x); //문자 -> 숫자 변환시에 사용
//		System.out.println(str.charAt(0));   //1
//		System.out.println(str.charAt(1));   //0
//		
//		문자열 출력3
//		String fileName = "Hello.Java"; //Hello Java
//		//                 0123456789
//		
//		int index = fileName.indexOf('.');  //5
//		System.out.println(index);   //배열 .에 있는 인덱스 번호를 불러옴.
//		System.out.println(fileName.substring(0, index));  //Hello
//		System.out.println(fileName.substring(index+1));   //Java
		
		
//		1.
//		System.out.println(fileName.charAt(0));  //인덱스 0번째인 H출력 
//		2.
//		char c = fileName.charAt(0);
//		System.out.println(c);                   //인덱스 0번째인 H출력 
//		
//		for (int i=0;i<fileName.length();i++) {
//			System.out.println(fileName.charAt(i));
//			H
//			e
//			l
//			l
//			o
//			.
//			J
//			a
//			v
//			a
//		}
		
//		String str = fileName.substring(0, 5);
//		System.out.println(str);   //Hello 출력		
//		
//		String str2 = fileName.substring(6, 10);
//		System.out.println(str2);  //인덱스 10번이 없음에도 출력에 이상 없음.
//		
//		String str3 = fileName.substring(3);
//		System.out.println(str3);  //인덱스 3번부터 끝까지 출력됨.
		
		//StringBuffer클래스  //스트링버퍼 : 개선된 내용
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		
	}

}
