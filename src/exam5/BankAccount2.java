package exam5;

class InvalidWithdraw2 extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw2(String msg) {
		super(msg);
	}
}
class Ex03{
	public int minMoney;													//최저 돈
	public int money;														//입금할 돈 or 출금할 돈
	public int myMoney = 0;													//나의 돈
	public Ex03(int minMoney) {												//생성자
		this.minMoney = minMoney;
	}
	public int deposit2(int money) {										//입력한다
		myMoney += money;													//현재돈 + 입금할 돈
		System.out.println("정상 입금처리: 입금금액="+ money + ", 잔금=" + myMoney);	//잔고
		return myMoney;														//내 돈 반환
	}
	public int withdraw2(int money) throws InvalidWithdraw2{				//예외에 출력
		myMoney -= money;													//현재돈 - 출력한 돈
		if(money < 0) {														//출력할 돈이 0보다 작으면
			throw new InvalidWithdraw2("초과출금 요구 예외.");					//위의 InvalidWithdraw2 클래스로 던져줘 오류문 출력
		}
		else if(myMoney < minMoney) {										//내 돈이 최저 금액보다 작으면
			throw new InvalidWithdraw2("초과출금 요구 예외.");					//위의 InvalidWithdraw2 클래스로 던져줘 오류문 출력
		}
		else {																//나머지는
			System.out.println("정상 출금처리: 인출금액="+ money + ", 잔금=" + myMoney);//잔고랑 출금된 돈 출력
		}
		return myMoney;
	}
}
public class BankAccount2 {
	public static void main(String[] args) throws InvalidWithdraw2 {
	Ex03 ba = new Ex03(-100000);
	ba.deposit2(100000);
	ba.withdraw2(100000);
	ba.withdraw2(200000);
	}
}

