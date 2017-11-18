package exam51;
import java.util.Calendar;														//Ķ������ ����Ʈ����

class PrimeTime implements Runnable {
	int n=0;																	//n�� �ʱⰪ�� 0���� ����
	String x;																	//x���ڿ� ����
	public PrimeTime(int n) {													//int n�� �޴� ������ ����
		this.n = n;
	}
	public PrimeTime(int n,String name) {										//int n�� String x�� ������ ������ ����
		this.n = n;
		Thread.currentThread().setName(name);
	}	
	public void run() {
		Calendar now = Calendar.getInstance();									//���� ��¥�� ����
		for(int i=0;i<n;i++) {													//i�� 0���� n���������� ���� i�� Ű���ָ�
			System.out.println("����: "+Thread.currentThread().getPriority() 		//å���ִ´�� ��� �ϵ��� ��� ����
					+" "+now.getTime()+" "+Thread.currentThread().getName());
		}
	}
}
public class Ex07 {
	public static void main(String[] args) {
		PrimeTime p1 = new PrimeTime(3);										//å�� �ڵ� �״�� �Դϴ�.
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrimeTime p2 = new PrimeTime(6);
		Thread th2 = new Thread(p2, "�ݰ����ϴ�!");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
