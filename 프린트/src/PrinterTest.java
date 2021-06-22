class Printer {
	private int numOfPapers = 0;
	
	public Printer(int a) {
	numOfPapers = a;
	}
	
	void print(int amount) {
		if (numOfPapers >= amount) {
			System.out.println(amount + "�� ����߽��ϴ�. ���� " + (numOfPapers -= amount) + "�� ���� �ֽ��ϴ�.");
			}
		else if(numOfPapers < amount) {
			System.out.println("��� ����Ϸ��� ������ " + (amount - numOfPapers) + "�� �����մϴ�. " + numOfPapers + "�常 ����մϴ�.");
			numOfPapers -= numOfPapers;
		}
		else if(numOfPapers <= 0) {
			System.out.print("������ �����ϴ�.");
		}
	}
}
public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}
}
