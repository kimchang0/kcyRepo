package javaPrj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class study2 {

	public static void main(String[] args) {
		/*

		Scanner scan = new Scanner(System.in);

		
		//List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클레스를 통해 메모리를 올림
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		rList.add(scan.nextLine());
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size());
		
		//배열내용 출력
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] 번째 배열 기억공간 :" + rList.get(i));
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);

		
		//List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클레스를 통해 메모리를 올림 List 옆에 <String>은 꼭 쓸 필요는 없지만 쓰자.
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		for(int i = 0; i < 5; i++ ) {
		rList.add(scan.nextLine());
		}
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size());
		
		//배열내용 출력
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 :" + rList.get(i));
		}
		*/
		/*
		//List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클레스를 통해 메모리를 올림
		List <String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		rList.add("김창영");
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size());
		
		//배열내용 출력 
		Iterator <String> it = rList.iterator(); // rlist 복제한 Iterator 선언
		while(it.hasNext()) {// Iterator에 다음 내용이 있는지 물어봄. 있으면 트루값으로 와일문 실행 없으면 펄스로 와일문 실행 안 함.
			String name = it.next(); //String형 변수 name에 Iterator다음 주소값 대입
			
			System.out.println("이름 :" + name); //name변수 출력
		}
		*/
		/*
			Scanner scan = new Scanner(System.in);

		
		//List 인터페이스는 메모리에 올릴 수 없기 때문에 ArrayList 클레스를 통해 메모리를 올림 List 옆에 <String>은 꼭 쓸 필요는 없지만 쓰자.
		List<String> rList = new ArrayList<>();
		
		//List 컬렉션 프레임워크에 데이터를 추가함
		for(int i = 0; i < 5; i++ ) {
		rList.add(scan.nextLine());
		}
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size());
		
		//배열내용 출력
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 :" + rList.get(i));
		}
		*/
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		String [] t = new String[a];
		int i = 0;
		
		while(i < a) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			t[i] = String.valueOf(b + c);
			i++;
		}
		
		i = 0;
		
		while(i < a) {
			System.out.println(t[i]);
			i++;
		}
		*/
		
		
		
		
		
		
		
		
		
		

				List <String> rList = new ArrayList<>();
				
				rList.add("1");
				rList.add("2");
				rList.add("3");
				rList.add("4");
				rList.add("5");
				
				int a =  rList.size() - 1;
				
				while(a >= 0) {
					System.out.println(a + "번째 배열 : " + rList.get(a));
					a--;
				}
				
				Iterator <String> it = rList.iterator(); 
				int i = 0;
				while(it.hasNext()) {
					
					String name = it.next(); 
					
					System.out.println(i + "번 째 Iterator :" + name);
					i++;
				}
		
		
		
	}

}
