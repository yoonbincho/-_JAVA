package yb;

public class GolfClub {
	
	int i; // i���� ��ȯ
	String club; 
	boolean Iron; //�� ���� �Ǹ�

	public GolfClub(int i) 
	{
		this.i = i;//������ �Է� ����
		Iron = true;//���Ƿ� ���̾��� ���� ��ü
	}

	public GolfClub(String club) 
	{
		this.club = club;//���ڿ��� �Է� ����
	} // ���Ƿ� Ŭ���� ���� ��ü ������

	public GolfClub() 
	{
		this(7);// ���̾� 7�� ��ü�� �����.
	} 

	void print() //����ϴ� �Լ�
	{
		
		if (Iron) //�������� �ƴ����� �Ǻ��Ѵ�.
		{
			System.out.println(i + "�� ���̾��Դϴ�.");
			
		} 
		
		else //�ƴ� ���
		{
			System.out.println(club + "�Դϴ�.");
		}
	} 

	
}
