package exam01;

public class NullExample {

	public static void main(String[] args) {
		int[][]scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);	
		}

}
