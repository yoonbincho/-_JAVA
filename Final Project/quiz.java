package yoonbinquiz;

import java.util.Scanner;
import java.util.ArrayList;




interface interScore{
	
	void printScore();//������ ����ϴ� �޼��带 ������ ��Ų��.
	
}
public class quiz {//���� Ŭ����

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int ifFriend;//�÷��̾ �����ϴ� ��������� ����
		String thinkSae=null;
		System.out.println("����� �����̿� ���� �����ΰ���?");
		System.out.println("����� �����ϴ� ���̴� ������� ����ּ���.");
		System.out.println("1. ����� ����");
		System.out.println("2. ģ�� ����");
		System.out.println("3. ��ģ");
		System.out.println("4. ������ �� ��ü\n");
		
		
		ArrayList<Integer> scores=new ArrayList<>();//�����鿡 ���� Arraylist�� �����Ѵ�
		int []answer=new int[10];//������ ���� ������ ��� �迭
		

		System.out.print("���� �Է��ϼ��� : ");
		ifFriend=in.nextInt();
		if(ifFriend==1)//���� ������ ������ش�.
		{
			System.out.println("����� ���̶�� ���ϼ̽��ϴ�.");
			thinkSae="����� ����";
		}
		else if(ifFriend==2)
		{
			System.out.println("ģ�� ���̶�� ���ϼ̽��ϴ�.");
			thinkSae="ģ�� ����";
		}
		else if(ifFriend==3)
		{
			System.out.println("��ģ��� ���ϼ̽��ϴ�.");
			thinkSae="��ģ";
		}
		else if(ifFriend==4)
		{
			System.out.println("������ �� ��ü��� ���ϼ̽��ϴ�.");
			thinkSae="������ �� ��ü";
		}
		
		//1�� ���� �� 2
		System.out.println();
		System.out.println();
		System.out.print("���������� ������ ���۵˴ϴ�. �ٵ� �غ��ϼ���!\n\n");
		System.out.print("1�� ���� ) ���� �̸��� �����ϱ��?\n");
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("3. ������");
		System.out.println("4. ������");
		System.out.println("5. ������");
		System.out.print("���� �Է��ϼ��� : ");
		answer[0]=in.nextInt();
		if(answer[0]==2)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		
		//2�� ���� �� 4
		System.out.println();
		System.out.print("2�� ���� ) ���� ����ϱ��? \n");
		System.out.println("1. 8");
		System.out.println("2. 13");
		System.out.println("3. 19");
		System.out.println("4. 21");
		System.out.println("5. 25");
		System.out.print("���� �Է��ϼ��� : ");
		answer[1]=in.nextInt();
		if(answer[1]==4)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		
		//3�� ���� ��1
		System.out.println();
		System.out.print("3�� ���� ) ���� ���� �б��� �������ϱ��? \n");
		System.out.println("1. ������б�");
		System.out.println("2. �������б�");
		System.out.println("3. ������б�");
		System.out.println("4. ������б�");
		System.out.println("5. ���Ǵ��б�");
		System.out.print("���� �Է��ϼ��� : ");
		answer[2]=in.nextInt();//�����̶��
		if(answer[2]==1)
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		

		//4�� ���� ��3
		System.out.println();
		System.out.print("4�� ���� ) ���� �Ⱦ��ϴ� ������ �����ϱ��?\n");
		System.out.println("1. ġ��");
		System.out.println("2. ������");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.println("5. ����");
		System.out.print("���� �Է��ϼ��� : ");
		answer[3]=in.nextInt();
		if(answer[3]==3)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		//5�� ���� ��2
		System.out.println();
		System.out.print("5�� ���� ) ���� ���� �����ϱ��?\n");
		System.out.println("1. �����ͻ��̾�");
		System.out.println("2. ��������ũ�����");
		System.out.println("3. �ǾƳ�");
		System.out.println("4. ����");
		System.out.println("5. ü��");
		System.out.print("���� �Է��ϼ��� : ");
		answer[4]=in.nextInt();
		if(answer[4]==2)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		//6�� ���� ��1
		System.out.println();
		System.out.print("3�� ���� ) ���� �����ϴ� �������� �����ϱ��?\n");
		System.out.println("1. ������");
		System.out.println("2. ��ź�ҳ��");
		System.out.println("3. ������");
		System.out.println("4. ��");
		System.out.println("5. ���� ���ϸ���");
		System.out.print("���� �Է��ϼ��� : ");
		answer[5]=in.nextInt();
		if(answer[5]==1)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		

		//7�� ���� ��4
		System.out.println();
		System.out.print("7�� ���� ) ���� ���� �帣�� ���� �����ұ��?\n");
		System.out.println("1. ����");
		System.out.println("2. ��");
		System.out.println("3. �߶��");
		System.out.println("4. ����ƽ");
		System.out.println("5. ����");
		System.out.print("���� �Է��ϼ��� : ");
		answer[6]=in.nextInt();
		if(answer[6]==4)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		

		//8�� ���� ��3
		System.out.println();
		System.out.print("8�� ���� ) ���� ��Ʈ������ ��� Ǯ���? \n");
		System.out.println("1. ���ִ� ����Ʈ�� �Դ´�.");
		System.out.println("2. ģ����� ���ٸ� ����.");
		System.out.println("3. ������, ����� ������ ����.");
		System.out.println("4. ���� �뷡�� ��´�.");
		System.out.println("5. ȥ�ڸ��� �ð��� ���´�.");
		System.out.print("���� �Է��ϼ��� : ");
		answer[7]=in.nextInt();
		if(answer[7]==3)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		//9�� ���� ��1
		System.out.println();
		System.out.print("9�� ���� ) ���� ����ϴ� ������ �����ϱ��?\n");
		System.out.println("1. �������");
		System.out.println("2. īƮ���̴�");
		System.out.println("3. ������ġ");
		System.out.println("4. ��Ͼ���̹�");
		System.out.println("5. ��");
		System.out.print("���� �Է��ϼ��� : ");
		answer[8]=in.nextInt();
		if(answer[8]==1)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		
		//10�� ���� ��5
		System.out.println();
		System.out.print("10�� ���� ) ���� ���� �����ϴ� �������� �����ϱ��?\n");
		System.out.println("1. ����ѹ� ������");
		System.out.println("2. �販�� ������");
		System.out.println("3. ��ƹ��� ������");
		System.out.println("4. ��õ�� ������");
		System.out.println("5. ������ ������");
		System.out.print("���� �Է��ϼ��� : ");
		
		answer[9]=in.nextInt();
		if(answer[9]==5)//�����̶��
		{
			scores.add(10);//Arraylist�� 10���� �߰��Ѵ�.
		}
		int score=0;//������ �� ������ ������ش�.
		for(int i=0;i<scores.size();i++) {
			score+=scores.get(i);//Arraylist�� �ִ� ��� ������ �����ش�.
		}
		score sc=new score(score);//�����ڸ� ���� score��ü ����
		sc.printScore();//scoreŬ������ printScore ȣ��
		friend fr=new friend(score,thinkSae);//�����ڸ� ���� friend��ü ����
		fr.friends();//friendŬ�������� friends ȣ��
		
	}

}
