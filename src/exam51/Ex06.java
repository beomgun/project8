package exam51;

class PrimeNumber03 implements Runnable {
	int n=0;														//n의 초기값을 0으로 설정
	String x;														//x문자열 설정
	public PrimeNumber03(int n) {									//int n을 받는 생성자 생성
		this.n = n;
	}
	public PrimeNumber03(int n,String name) {						//int n과 String x를 가지는 생성자 생성
		this.n = n;			
		Thread.currentThread().setName(name);
	}	
	public void run() {												//run함수
		System.out.println(Thread.currentThread().getName()+":");	//출력
		int num, count, i;											//num count i 설정
		for(num=2;num<=n;num++) {									//num이 2보다 크고 설정함 n보다 크고 num이 계속 커져갈때
			count = 0;												//count 초기값을 0으로 설정
			for(i=2;i<num;i++) {									//i가 2부터 num보다 작을때 까지 i를 더해줄때
				if(num%i==0)										//num%i가 0이 아닐때
					count+=1;										//count를 1을 더해줌
			}
			if(count==0)											//count가 0일때
				System.out.printf(num+" ");							//num 출력
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "소수 만드는 스래드").start();
		
	}

}
