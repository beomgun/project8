package exam51;

class PrimeNumber03 implements Runnable {
	int n=0;														//n�� �ʱⰪ�� 0���� ����
	String x;														//x���ڿ� ����
	public PrimeNumber03(int n) {									//int n�� �޴� ������ ����
		this.n = n;
	}
	public PrimeNumber03(int n,String name) {						//int n�� String x�� ������ ������ ����
		this.n = n;			
		Thread.currentThread().setName(name);
	}	
	public void run() {												//run�Լ�
		System.out.println(Thread.currentThread().getName()+":");	//���
		int num, count, i;											//num count i ����
		for(num=2;num<=n;num++) {									//num�� 2���� ũ�� ������ n���� ũ�� num�� ��� Ŀ������
			count = 0;												//count �ʱⰪ�� 0���� ����
			for(i=2;i<num;i++) {									//i�� 2���� num���� ������ ���� i�� �����ٶ�
				if(num%i==0)										//num%i�� 0�� �ƴҶ�
					count+=1;										//count�� 1�� ������
			}
			if(count==0)											//count�� 0�϶�
				System.out.printf(num+" ");							//num ���
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "�Ҽ� ����� ������").start();
		
	}

}
