package exam51;

class PrimeNumber01 extends Thread {
	int n=0;
	public PrimeNumber01(int n) {
		this.n = n;
	}
		
	public void run() {
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


public class Ex04 {
	public static void main(String[] args) {
		PrimeNumber01 pn = new PrimeNumber01(20);
		pn.start();
		
	}

}
