import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if (1 <= score && score <= 3) {
			score = score * 5;
		} else if (4 <= score && score <= 6) {
			score = score * 10;
		} else if (7 <= score && score <= 9) {
			score = score * 50;
		} else {
			System.out.println("Невалидни точки!");
		}
		System.out.println(score);
	}

}
