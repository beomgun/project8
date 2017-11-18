package exam51;

class PrimeNumber02 extends Thread {
	int n=0;
	String x;
	public PrimeNumber02(int n, String x) {
		this.n = n;
		this.x = x;
	}
		
	public void run() {
		System.out.println(x+":");
		int num, count, i;
		for(num=2;num<=n;num++) {
			count = 0;
			for(i=2;i<num;i++) {
				if(num%i==0)
					count+=1;
			}
			if(count==0)
				System.out.printf(num+" ");
			}
		}
}


public class Ex05 {
	public static void main(String[] args) {
		PrimeNumber02 pn = new PrimeNumber02(20, "소수 만드는 스레드");
		pn.start();
		
	}

}
