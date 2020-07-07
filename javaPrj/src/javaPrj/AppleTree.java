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
		System.out.println("슈퍼클래스에서 정의한 함수를 이것으로 변경함");
	}
}
