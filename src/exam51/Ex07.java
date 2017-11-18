package exam51;
import java.util.Calendar;														//캘린더를 임포트해줌

class PrimeTime implements Runnable {
	int n=0;																	//n의 초기값을 0으로 설정
	String x;																	//x문자열 설정
	public PrimeTime(int n) {													//int n을 받는 생성자 생성
		this.n = n;
	}
	public PrimeTime(int n,String name) {										//int n과 String x를 가지는 생성자 생성
		this.n = n;
		Thread.currentThread().setName(name);
	}	
	public void run() {
		Calendar now = Calendar.getInstance();									//현재 날짜를 잡음
		for(int i=0;i<n;i++) {													//i가 0부터 n보다작을때 까지 i를 키워주면
			System.out.println("순위: "+Thread.currentThread().getPriority() 		//책에있는대로 출력 하도록 출력 설정
					+" "+now.getTime()+" "+Thread.currentThread().getName());
		}
	}
}
public class Ex07 {
	public static void main(String[] args) {
		PrimeTime p1 = new PrimeTime(3);										//책의 코드 그대로 입니다.
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrimeTime p2 = new PrimeTime(6);
		Thread th2 = new Thread(p2, "반갑습니다!");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
