package javaPrj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class study2 {

	public static void main(String[] args) {
		/*

		Scanner scan = new Scanner(System.in);

		
		//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		rList.add(scan.nextLine());
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ��" + rList.size());
		
		//�迭���� ���
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] ��° �迭 ������ :" + rList.get(i));
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);

		
		//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø� List ���� <String>�� �� �� �ʿ�� ������ ����.
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		for(int i = 0; i < 5; i++ ) {
		rList.add(scan.nextLine());
		}
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ��" + rList.size());
		
		//�迭���� ���
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ������ :" + rList.get(i));
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);

		
		//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		List <String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		
		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		rList.add("��â��");
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ��" + rList.size());
		
		//�迭���� ��� for ���� while�� �ӵ��� �� ����
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "] ��° �迭 ������ :" + rList.get(i));
		}
		int a = scan.nextInt();
		Iterator <String> it = rList.iterator();
		while(it.hasNext()) {
			String name = it.next();
			
			System.out.println("�̸� :" + name);
		}
		*/
		/*
			Scanner scan = new Scanner(System.in);

		
		//List �������̽��� �޸𸮿� �ø� �� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø� List ���� <String>�� �� �� �ʿ�� ������ ����.
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		for(int i = 0; i < 5; i++ ) {
		rList.add(scan.nextLine());
		}
		
		//�迭ũ�� ���
		System.out.println("�迭�� ũ��" + rList.size());
		
		//�迭���� ���
		for(int i = 0; i < rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ������ :" + rList.get(i));
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
