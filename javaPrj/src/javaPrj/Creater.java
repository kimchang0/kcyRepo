package javaPrj;

public class Creater {
	private String name;
	private String dept;

	Creater() {
		System.out.println("�� �⺻������ �޸� �ö� �� ����Ǵ� ������ �Լ�!");
	}
	Creater(String pName) {
		System.out.println(pName + "�� ���� ������, ������ ���� �޸� �ø��� ������ �Լ�!");
	}
	public static void main(String[] args) {
		Creater cr = new Creater("������");
		Creater cr1 = new Creater();
	}

}
