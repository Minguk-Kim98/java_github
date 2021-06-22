class Printer {
	private int numOfPapers = 0;
	
	public Printer(int a) {
	numOfPapers = a;
	}
	
	void print(int amount) {
		if (numOfPapers >= amount) {
			System.out.println(amount + "장 출력했습니다. 현재 " + (numOfPapers -= amount) + "장 남아 있습니다.");
			}
		else if(numOfPapers < amount) {
			System.out.println("모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
			numOfPapers -= numOfPapers;
		}
		else if(numOfPapers <= 0) {
			System.out.print("용지가 없습니다.");
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
