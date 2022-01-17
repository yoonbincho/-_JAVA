package cho;

import java.util.Scanner;

abstract class Echoer {
	
	void start() //���� �޼���
	{
		System.out.println("�����մϴ�.");//������ �˸���.
	}

	abstract void echo();

	void stop() //���� �޼���
	{
		System.out.println("�����մϴ�.");
	}
}

public class EchoerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() 
		{
	         @Override //�������̵� �Ѵ�.
	         void echo()
	         {
	            String a;
	            while(true) {  //���� �ݺ�
	               a = in.nextLine();
	               if(a.equals("��")) {
	                  System.out.println(a);
	                  break;  //"��"�̶� �ܾ �Է��ϸ� ����ȴ�.
	               }
	               else
	                  System.out.println(a);
	            }
	         }
	      };  //�� �� �̻� �ڵ� �ʿ�
		e.start();//���� �޼��� ����
		e.echo();//���� �޼��� ����
		e.stop();//stop�޼��� ����
	}

}
