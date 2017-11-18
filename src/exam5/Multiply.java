package exam5;

import java.util.*;

public class Multiply {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;								//x,y,z의 초기값을 0으로 설정한다
			try {
				Scanner input = new Scanner(System.in);			//x,y 값을 입력 받는다
				x = input.nextInt();							//x
				y = input.nextInt();							//y
			} catch (Exception e) {								//예외처리 구성
				System.out.println("예외발생: " + e);				//예외 출력
			} finally {											//예외가 아니면
				System.out.println("");								
				z = x * y;										//z는 x와 y를 곱한값
				System.out.printf("%d * %d = %d %n", x,y,z);	//x와 y를 곱한값을 출력한다.
			}	
	}
}
