package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		System.out.println("こんにちは、"+ name + "さん");
		int res;
		String all="";
		
		List<String> foods = new ArrayList<>();
		do {
			System.out.println("好きな食べ物は何ですか？");
			Scanner scan2 = new Scanner(System.in);
			String food = scan2.nextLine();
			foods.add(food);
			
			System.out.println("ほかに好きな食べ物はありますか？");
			System.out.print("はい：0、いいえ :1  >");
			Scanner scan3 = new Scanner(System.in);
			res = scan3.nextInt();
		}while(res==0);
			
			if(foods.get(0)=="") {
				System.out.println("ありがとうございました");
			}else if(foods.size()==1) {
				System.out.println(name +"さんの好きな食べ物は"+foods.get(0)+"ですね");
			}else {
				for(int i=0; i<foods.size(); i++ ) {
					all = all +"、" + foods.get(i); 
				}
				
				System.out.println("好きな食べ物は"+all+"ですね");	
			}
			
		
	}

}
