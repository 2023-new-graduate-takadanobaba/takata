package Lesson1;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		System.out.println("数値を入力してください。");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
	
		try {
			int num = Integer.parseInt(word);
			System.out.println(num);
			
		}catch(NumberFormatException ex){
			System.out.println("数字ではありません。");
		}

	}

}
