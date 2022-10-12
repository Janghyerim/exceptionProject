package exceptionProject;

public class Person {  //.equals() 왜쓰냐? String의 값을 비교하기 위해서
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {  //.equals() 
		if(obj instanceof Person) {
			Person another = (Person)obj;
			return this.name.equals(another.name) && this.age == another.age;
		}
		return false;
	}


	@Override
	public int hashCode() {  //hashCode()
		return (this.name + age).hashCode();  //"홍길동10".hashcode()
	}


	@Override
	public String toString() {  //toString()
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
