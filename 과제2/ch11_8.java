package ����¯;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ch11_8 {

	public static void main(String[] args) {
	
		String[] s = {"������", "�����", "������"};
		List<String> list = new ArrayList<String>();//���ο� ArrayList�� ������ش�.
		
		list.add("����");//list�� ���̸� �߰��Ѵ�.
		list.add("����");//list�� ���̸� �߰��Ѵ�.
		
		System.out.println(list);//list�� ����Ѵ�.
		
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);
		
		al1.set(0, "��");//al1�� 0��°�� ���� �߰��Ѵ�.
		al1.set(1, "��");//al1�� 1��°�� ���� �߰��Ѵ�.
		System.out.println("'��'�� ä�� �� : " + al1);//���� ä�� �ĸ� �߰��Ѵ�.
		
		for(String i : s) {
			al1.add(i);
		}//��� �׸��� �߰��Ѵ�.
		
		System.out.println("����Ʈ�� ��� �߰��� �� : " + al1);
		
		Collections.sort(al1);//����Ʈ�� ���´�.
		System.out.println("����Ʈ�� ���� �� : " + al1);
		
		Collections.reverse(al1);//����Ʈ�� �ݴ�� ���Ľ�Ų��.
		System.out.println("����Ʈ�� �������� ������ �� : " + al1);
		
		System.out.println("����Ʈ���� �ּ� : " + Collections.min(al1));//���������� �ּڰ��� ��ȯ�Ѵ�.(��->�ּڰ�)
		System.out.println("����Ʈ���� �ִ� : " + Collections.max(al1));//���������� �ִ��� ��ȯ�Ѵ�.<��->�ִ�)
		System.out.println("����Ʈ���� ���� �� : " + Collections.frequency(al1, "��"));//���� �󸶳� ���Դ��� �󵵸� ����Ѵ�.
	}
}
