package exam02;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---�Ҹ� �ø���.");

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---�Ҹ� ������.");

	}
}