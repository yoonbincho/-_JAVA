package choyoonbin;

import java.util.Scanner;

class yoonbin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int m;//������ �ݾ�
		int p;//��ǰ ����
		while(true) //while���� ����Ͽ� �ݺ������ش�.
		{
		System.out.print("��ǰ ������ �Է��Ͻÿ�(1~10000): ");
		p=in.nextInt();
		//��ǰ ���� ���� ����
		if(p==0)//0�� �Է��ϸ�
			break;//�ݺ��� ����
		System.out.print("���� �ݾ� �Է�(1~10000): ");
		m=in.nextInt();
		//������ ���� ���� ����
		
		
		System.out.printf("- 5000�� :%d��\n",(m-p)/5000);//5000���� �ʿ��� ����
		System.out.printf("- 1000�� :%d��\n",((m-p)%5000)/1000);//1000���� �ʿ��� ����
		System.out.printf("- 500�� :%d��\n",((m-p)%1000)/500);//500���� �ʿ��� ����
		System.out.printf("- 100�� :%d��\n",((m-p)%500)/100);//100���� �ʿ��� ����
		System.out.printf("- 50�� :%d��\n",((m-p)%100)/50);//50���� �ʿ��� ����
		System.out.printf("- 10�� :%d��\n",((m-p)%50)/10 );//10���� �ʿ��� ����
		System.out.printf("- 5�� :%d��\n", ((m-p)%10)/5);//5���� �ʿ��� ����
		System.out.printf("- 1�� :%d��\n", (m-p)%5);//1���� �ʿ��� ����
		System.out.println("============================");
		}
		System.out.print("���α׷� ����......");//0�� �Է��ϸ� ������ �޼���
	}

	

}
