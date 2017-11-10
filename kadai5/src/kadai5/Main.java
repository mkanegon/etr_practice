package kadai5;//Scannerについて理解不足//

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		System.out.println("足し算："+(x + y));
        System.out.println("引き算："+(x - y));
        System.out.println("掛け算："+(x * y));
        System.out.println("割り算："+(x / y));

        scanner.close();
	}

}
