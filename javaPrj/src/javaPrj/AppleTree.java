package javaPrj;

public class AppleTree extends Tree {

	public void exe() {
		super.treePrint();

	}
	
	public static void main(String [] args) {
		AppleTree at = new AppleTree();
		at.treePrint();
		
		
	}
	@Override
	public void treePrint() {
		System.out.println("����Ŭ�������� ������ �Լ��� �̰����� ������");
	}
}
