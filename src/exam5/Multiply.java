package exam5;

import java.util.*;

public class Multiply {
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;								//x,y,z�� �ʱⰪ�� 0���� �����Ѵ�
			try {
				Scanner input = new Scanner(System.in);			//x,y ���� �Է� �޴´�
				x = input.nextInt();							//x
				y = input.nextInt();							//y
			} catch (Exception e) {								//����ó�� ����
				System.out.println("���ܹ߻�: " + e);				//���� ���
			} finally {											//���ܰ� �ƴϸ�
				System.out.println("");								
				z = x * y;										//z�� x�� y�� ���Ѱ�
				System.out.printf("%d * %d = %d %n", x,y,z);	//x�� y�� ���Ѱ��� ����Ѵ�.
			}	
	}
}
