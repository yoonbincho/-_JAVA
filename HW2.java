package ����¯;

import java.util.HashMap;
import java.util.Scanner;

public class hw2_2018204037 {
	public static void main(String[] args) 
{
		HashMap<String, String> capital = new HashMap<>();//HashMap ȣ��
		//5���� ������ �������ش�.
		
		capital.put("������", "�ĸ�");
		capital.put("������", "������");
		capital.put("�׸���", "���׳�");
		capital.put("���ѹα�", "����");
		capital.put("����", "����");
		String [] keys = capital.keySet().toArray(new String[0]);
		
		System.out.println("***  �������߱� ���� ����  ***");
		
		while(true)
		{//��� �ݺ�
			Scanner A = new Scanner(System.in);
			int r = (int)(Math.random() * 5);//���� �Լ��� �������ش�.
			String input;//�亯�� ���� ����
			String key = keys[r];
			System.out.print(key + "�� ������?");
			input = A.next();
			
			if(input.equals(capital.get(key))) {//������ ���
				System.out.println("����");
			}
			else if(input.equals("����")) {//���Ḧ �Է��� ���
				System.out.println("���� ����...");
				break;
			}else{
				System.out.println("�ƴմϴ�!!");
			}
		}
	}

}