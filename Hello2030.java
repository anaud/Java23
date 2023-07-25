package sam1;

import java.util.Scanner;
public class Hello2030 {
	public static void main(String[] args) {
		String a = null;
		String b = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		a = scanner.nextLine();
		System.out.print("영희 >> ");
		b = scanner.nextLine();
		if(a.equals("가위")) {
			if(b.equals("가위"))
				System.out.println("무승부");
			else if(b.equals("바위"))
				System.out.println("패배");
			else if(b.equals("보"))
				System.out.println("승리");
		
		}
		else if(a.equals("바위")) {
			if(b.equals("가위"))
				System.out.println("승리");
			else if(b.equals("바위"))
				System.out.println("무승부");
			else if(b.equals("보"))
				System.out.println("패매");
		}
		else if(a.equals("보")) {
			if(b.equals("가위"))
				System.out.println("패배");
			else if(b.equals("바위"))
				System.out.println("승리");
			else if(b.equals("보"))
				System.out.println("무승부");
		}
		scanner.close();
	}

}
