package ����¯;

import java.util.Scanner;
import java.util.stream.Stream;

public class ch11_6 
{

	public static void main(String[] args) {
		Stream<String> kb = Stream.generate(() -> 
		new Scanner(System.in).nextLine());
		int a=5;//���� �� �ִ� ���� ������ ���Ѵ�.
		int l=2;//������ ���̸� ���Ѵ�.
		
		System.out.print(kb.limit(a).filter(s -> s.length() == l).count());
		//���� ���� ���̰� 2�� ���� ��� ����Ѵ�.
	}

}