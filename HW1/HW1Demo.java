package yb;

public class HW1Demo {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(2.0);//������ ���� ���
		c1.print(); 
		
		Complex c2 = new Complex(1.5, 2.5);//������ �Ǽ��� ���� ���
		c2.print(); 

		System.out.println();

		GolfClub g1 = new GolfClub();
		g1.print(); 
		
		GolfClub g2 = new GolfClub(8);
		g2.print(); //�Լ����� �޴� ������ ����
		
		GolfClub g3 = new GolfClub("����");
		g3.print(); //�Լ����� �޴� ������ ���ڿ�
		
	}

}
