package exceptionProject;

public class StringTest {

	public static void main(String[] args) {  //String Ȱ���
		
		//charAt()
		//subString()
		//indexOf()
		//.equals()
		//valueOf()
		
//		String str1 = "abc";  //�̰ɷ� ������ ��.
//		String str2 = "def";  // ���� ���� �� �ϳ��� "abc"�� �ּҰ� str1,str2�� ���� ����.
//		str1 = "������";
//		
//		str1 = str1 + str2; //"abcdef" �ϳ��� �ϼ�  ���� �������� ���� �ּҰ��� �������°� �ƴϰ�,���ο� �ּҰ��� �����.
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
	
		String str3 = new String("abc");  //�̷��� �� �Ⱦ�.
		String str4 = new String("abc");   // ���� ���� ��  ���� "abc"�� �ּҰ� str1,str2�� ���� ����.
		
		 //���ڿ� ���1               /**or "abc" or "abc".equals("abc")*/
		if(str3.equals(str4)) {  
			System.out.println("���� ���ڿ��̴�.");  //O
		}
//		
//		�ּҰ� ��
//		if(str3 == str4) { 
//			//�ּҰ�
//			System.out.println("���� ���ڿ��̴�.");  //X
//		}else {
//			System.out.println("�ٸ� ���ڿ��̴�.");  //O
//		}
//		
//		//���ڿ� ���2
//		int x = 10;
//		String str = String.valueOf(x); //���� -> ���� ��ȯ�ÿ� ���
//		System.out.println(str.charAt(0));   //1
//		System.out.println(str.charAt(1));   //0
//		
//		���ڿ� ���3
//		String fileName = "Hello.Java"; //Hello Java
//		//                 0123456789
//		
//		int index = fileName.indexOf('.');  //5
//		System.out.println(index);   //�迭 .�� �ִ� �ε��� ��ȣ�� �ҷ���.
//		System.out.println(fileName.substring(0, index));  //Hello
//		System.out.println(fileName.substring(index+1));   //Java
		
		
//		1.
//		System.out.println(fileName.charAt(0));  //�ε��� 0��°�� H��� 
//		2.
//		char c = fileName.charAt(0);
//		System.out.println(c);                   //�ε��� 0��°�� H��� 
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
//		System.out.println(str);   //Hello ���		
//		
//		String str2 = fileName.substring(6, 10);
//		System.out.println(str2);  //�ε��� 10���� �������� ��¿� �̻� ����.
//		
//		String str3 = fileName.substring(3);
//		System.out.println(str3);  //�ε��� 3������ ������ ��µ�.
		
		//StringBufferŬ����  //��Ʈ������ : ������ ����
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		
	}

}
