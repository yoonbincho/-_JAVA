package yb;

public class Complex {
	
	double t;//�Ǽ� ���� 
	double f;//��� ����
	
	public Complex(double t) 
	{
		this(t, 0.0);} // ��� �κ��� 0�� ��ü ������
	
	public Complex(double t, double f) 
	{
		this.t = t;//������ �Ǽ� �κ�
		this.f = f;} //������ ��� �κ�

	void print()
	{
		System.out.println(t + " + " + f + "i");
	} //ȭ�� ���
}
