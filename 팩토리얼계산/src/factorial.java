import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int result;
		result = result(n, m);
		System.out.print(result);
	}	
		static int result(int x, int y) {
			int r = 1;
			for (int i = x; i <= y; i++)
				r *= i;
			return r;
		}
	}