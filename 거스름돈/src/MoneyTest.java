import java.util.*;
public class MoneyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마를 받았나요? ");
		int money = sc.nextInt();
		
		int moneyCount = 0;
		int[] coinTypes = { 500, 100, 50, 10 };
		
		for(int i = 0; i < 4; i++) {
			moneyCount += money / coinTypes[i];
			money %= coinTypes[i];
		}
		System.out.println(moneyCount);
	}
}
