package yoonbinquiz;


public class friend{
	String fSae;//�÷��̾�� �������� ����
	String usac="����� ����";
	String cinsa="ģ�� ����";
	String jurchin="��ģ";
	String cho="������ �� ��ü";
	int score;
	String thinkSae;//�ڽ��� �����ϰ� �ִ� �÷��̾�� �������� ����
	public friend(int score,String thinksae)//������
	{
		this.score=score;
		this.thinkSae=thinksae;
	}
	
	public void friends(){//������ ���� ���̸� �����Ѵ�.
		try{//����ó�� ���� (������ �´� �����밡 ���� ��, Ȥ�� ���ڰ� �ƴ� �� ������ ����Ѵ�.
			if(score>=0&&score<=30)
			{
				fSae=usac;
			}
			else if(score>30&&score<=60)
			{
				fSae=cinsa;
			}
			else if(score>60&&score<=90)
			{
				fSae=jurchin;
			}
			else if(score==100)
			{
				fSae=cho;
			}
		
			if(fSae==thinkSae)
			{
				System.out.println("\n�����մϴ�! ����� ������ ���̿� ���׿�~!");
			
			}
			else
				System.out.println("\n����� ������ ������ ģ�е���,,,Ʋ�Ⱦ��,,����,,");
		}catch(Exception e)//������ ��� ��µǴ� ����
			{
				System.out.println("������ �����ϴ�. �� ������� �������� �ʳ�����. : ");
				e.printStackTrace();//�޼����� ȣ�� ����� ����Ʈ���ش�.
			}
	}
}