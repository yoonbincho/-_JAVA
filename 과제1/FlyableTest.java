package cho;
interface Flyable {
	void speed();
	void height();
}

public class FlyableTest {

	public static void main(String[] args) {
		
		Flyable f = new Flyable() {
	         @Override//�������̵� �Ѵ�.
	         public void speed() 
	         {
	            System.out.println("�ӵ�");
	         }
	         
	         @Override
	         public void height() 
	         {
	            System.out.println("����");
	         }
	      };//�������̽� ���
		
		f.speed();//���ǵ� ����
		f.height();//���� ����
	
		

	}

}
