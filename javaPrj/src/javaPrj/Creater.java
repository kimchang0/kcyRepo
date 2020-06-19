package javaPrj;

public class Creater {
	private String name;
	private String dept;

	Creater() {
		System.out.println("난 기본적으로 메모리 올라갈 때 실행되는 생성자 함수!");
	}
	Creater(String pName) {
		System.out.println(pName + "난 원래 없지만, 강제로 만든 메모리 올리는 생성자 함수!");
	}
	public static void main(String[] args) {
		Creater cr = new Creater("이협건");
		Creater cr1 = new Creater();
	}

}
