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
		Scanner scan = new Scanner(System.in);

		
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
		
		//배열내용 출력 for 보다 while이 속도가 더 빠름
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] 번째 배열 기억공간 :" + rList.get(i));
		}
		int a = scan.nextInt();
		Iterator <String> it = rList.iterator();
		while(it.hasNext()) {
			String name = it.next();
			
			System.out.println("이름 :" + name);
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
		
		
		
		
	}

}
