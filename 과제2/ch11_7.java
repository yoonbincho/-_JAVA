package ����¯;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

public class ch11_7 {

	public static void main(String[] args) {
		
		String[] s1 = {"a", "b", "a", "b", "c"};
		String[] s2 = {"c"};
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		System.out.println("set1 : " + set1);//set1�� �ִ� �ߺ����� �ʴ� ���� ������ �����ش�.
		System.out.println("set2 : " + set2);//set2�� �ִ� �ߺ����� �ʴ� ���� ������ �����ش�.
		
		System.out.println("set1 �� set2�� ���� : " + (set1 == set2));//���� �ٸ��ϱ� false�� ���
		System.out.println("set1�� set2�� ��� ���Ҹ� �����Ѵ� : " + set1.containsAll(set2));//c����
		
		set1.addAll(set2);//set1�� set2�� ���� �߰��Ѵ�. (������)
		System.out.println("������ : " + set1.toString());
		set1.retainAll(set2);//�ߺ����� �����Ѵ�. (������)
		System.out.println("������ : " + set1.toString());
	}

}