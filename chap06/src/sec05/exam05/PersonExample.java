package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-7890123", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; nation 필드값은 final로 설정되었기 때문에 변경 불가함
		
		p1.name = "홍삼원";
		System.out.println("변경된 이름 : " + p1.name);
	}

}
