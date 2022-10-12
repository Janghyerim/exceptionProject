package exceptionProject;

public class ObjectTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동",10);
		Person p2 = new Person("홍길동",10);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
//		//이퀄스 하기 전 다르다고 뜸.
//		if(p1.equals(p2)) {  // p1 == p2  .equals() 오브젝트에서 주소값이 다른지 비교할 수 있다.
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
		
		//이퀄스 하고 나면 같다고 뜸.
		if(p1.equals(p2)) {  // "홍길동"  == "홍길동" && 10 == 10
			System.out.println("같은사람");
		}else {
			System.out.println("다른사람");
		}

		
	}
}
