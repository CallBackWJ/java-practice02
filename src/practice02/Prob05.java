package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		while (true) {
			int k = r.nextInt(100) + 1;
			int count = 1;
			int result = 0;
			System.out.println("수를 결정하였습니다. 맞추어보세요");

			
			while (flag) {
				System.out.print(count+">>");
				result = scanner.nextInt();
				if (k > result) {
					System.out.println("더 높게");
					count++;
				} else if (k < result) {
					System.out.println("더 낮게");
					count++;
				} else {
					System.out.println("맞았습니다.");
					flag=false;
					
				}
			}
			flag=true;
			System.out.print("다시하시겠습니까?(y/n)>>");
			String answer = scanner.next();
			if (answer.equals("n")) {
				break;
			}
		}

	}

	public static boolean checkNum(int num) {
		return false;

	}

}
