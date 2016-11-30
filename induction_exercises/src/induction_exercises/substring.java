package induction_exercises;

import java.util.Scanner;

public class substring {

	public static void main(String Args[]){
		String strTarget = "";
		int intStartPoint = 0;
		int intGetCharCount = 0;
		int intLength = 0;

		//to do : wait until input characters
		System.out.println("type something");

		Scanner sc = new Scanner(System.in);

		//入力された文字をstrTargetに入れる
		strTarget = sc.next();
		//文字列の文字数を取得してintLengthに入れる
		intLength = strTarget.length();
		System.out.println("legth is..." + intLength);
		
		String strcut = strTarget.substring(2);
		
		System.out.println(strcut);
	}
	
}


//import java.util.Scanner;
//
//public class substring {
//	
//
//	public static void main(String[] arg) {
//	
//		String taisyostring = "Hello!World!";
//		System.out.println("Hello!World!");
//		
//		
//		Scanner sc1 = new Scanner(System.in);
//		
//		System.out.println("開始文字位置を入力してください(最初の文字を0と数える)");
//		
//		
//		int startPoint;
//		
//		while(true){
//			if (sc1.hasNextInt()){
//				startPoint = sc1.nextInt();
//				break;
//			}else{
//				System.out.println("数字で入力してください");
//				sc1.next();
//			}
//		}
//		
//		System.out.println("開始文字位置:" + startPoint);
//		
//		
//	
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("取得文字列長を入力してください");
//		
//		int length;
//		
//		while(true){
//			if (sc2.hasNextInt()){
//				length = sc2.nextInt();
//				break;
//			}else{
//				System.out.println("数字で入力してください");
//				sc2.next();
//			}
//		}	
//		
//		System.out.println("取得文字列長:" + length);
//		
//		
//	String taisyoString = "Hello!World!";
//
//
//	int cnt;
//	cnt = startPoint;
//
//	for(cnt=startPoint ; cnt<=length ; cnt++){
//		char c =taisyoString.charAt(cnt);
//		System.out.print(c);
//		}
//	}
//}