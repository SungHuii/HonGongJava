package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dPhone.model);
		System.out.println("색상 : " + dPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출.
		//CellPhone 객체 생성을 하지 않았지만 DmbCellPhone 객체에서 이미 상속을 받았기 떄문에 사용가능
		dPhone.powerOn();
		dPhone.bell();
		dPhone.sendVoice("여보세요");
		dPhone.receiveVoice("안녕하세요~ 저는 홍길동입니다.");
		dPhone.sendVoice("아 네 반갑습니다");
		dPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dPhone.turnOnDmb();
		dPhone.changeChannelDmb(12);
		dPhone.turnOffDmb();

	}

}
