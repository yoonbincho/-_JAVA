package cho;



class Hotel {
	
	private class Room {
		int number;
		String client;

		public Room(int number, String client) {
			
			this.number = number;
			this.client = client;
			//������ �ϼ�
		}
	}

	Room[] room = new Room[10];// room �迭 ����
	public void add(int number, String client) {
		for(int i = 0; i < room.length; i++) {
			if(room[i] == null) 
			{
				//room�迭�� ����ִٸ�
				room[i] = new Room(number, client);//Ŭ���� �Ҵ��Ѵ�.
				break;
			}
			else //room�迭�� �� ���
			{
				continue; 
			}
		}
	}
	public void show() {//show �޼���
		for(int i = 0; i < room.length; i++) {
			if(room[i] == null) {
				break;
			}
			else {
				System.out.println(room[i].number + "�� ���� " + room[i].client + "�� ���� �߽��ϴ�.");
			}//���� ����Ѵ�.
		}
		
	}
}

public class HotelTest {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		hotel.add(5, "ȣ����");
		hotel.add(7, "�浿��");
		hotel.show();

	}

}
