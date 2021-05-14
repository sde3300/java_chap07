package java_chap07;

public class Car {
//	Tire 클래스로 앞뒤좌우 4개의 Tire 객체 생성
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4),
	};
	
//	Tire[] tires = new Tire[4];
//	tires[0] = new Tire ("앞왼쪽", 6);
//	tires[1] = new Tire ("앞오른쪽", 2);
//	tires[2] = new Tire ("뒤왼쪽", 3);
//	tires[3] = new Tire ("뒤오른쪽", 4);
//	
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1; // 타이어의 위치 / 1:앞왼쪽, 2:앞오른쪽, 3:뒤왼쪽 4:뒤오른쪽
		}
		
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
