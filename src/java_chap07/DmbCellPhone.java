package java_chap07;

// DmbCellPhone 클래스가 CellPhone 클래스를 상속받음
// CellPhone의 필드인 model, color와 메서드인 powerOn, powerOff, hangUp, sendVoice, receiveVoice, bell을 상속받음
// DmbCellPhone은 상속받은 필드 및 메서드를 구현 할 필요가 없음
// 구현하지 않아도 사용이 가능함

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
//		부모 생성자 호출
//		컴파일러가 부모생성자를 호출하는 명령어인 super()를 자동으로 생성
//		컴파일러가 생성하는 super()는 기본 생성자를 호출하는  super()만 생성
//		부모 클래스에 기본 생성자가 없을 경우에는 사용자가 직접 해당 부모 생성자를 호출하는 super(매개변수, ...) 명령어를 입력해야 함
//		super();
		
		
//	부모 클래스인 CellPhone의 필드인 model, color이지만 상속받았기 때문에 DmbCellPhnoe의 필드처럼 사용이 가능하다
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
//	부모 클래스인 CellPhone의 메서드를 상속받기 때문에 따로 구현하지 않아도 사용이 가능하다.
	void turnOnBmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다." );
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
