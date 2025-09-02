package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner (System.in);
		String choice = scanner.nextLine();
		
		if(choice.equals("r") || choice.equals("s") || choice.equals("p")) {
			scanner.close();
		}else {
			System.out.println("正しい値ではありません。再度入力してください");
		}
		return choice;
	}
	
	public String getRandom() {
		String[] hands = {"r","s", "p"};
		int i = (int)Math.floor(Math.random()*3);
		return hands[i];
	}
	
	public void playGame() {
		HashMap<String,String> handMap = new HashMap<String,String>();
		handMap.put("r", "グー");
		handMap.put("s" ,"チョキ");
		handMap.put("p", "パー");
		
		String myHand = getMyChoice();
		
		
		String yourHand = getRandom();
		System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(yourHand));
		
		if(myHand.equals(yourHand)) {
			System.out.println("あいこです");
		}else if(myHand.equals("r") && yourHand.equals("s")) {
			System.out.println("自分の勝ちです");
		}else if(myHand.equals("r") && yourHand.equals("p")) {
			System.out.println("自分の負けです");
		}else if(myHand.equals("s") && yourHand.equals("r")) {
			System.out.println("自分の負けです");
		}else if(myHand.equals("s") && yourHand.equals("p")) {
			System.out.println("自分の勝ちです");
		}else if(myHand.equals("p") && yourHand.equals("r")) {
			System.out.println("自分の勝ちです");
		}else if(myHand.equals("p") && yourHand.equals("s")) {
			System.out.println("自分の負けです");
		}
	}
}
