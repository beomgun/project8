package exam5;

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
class Ex02{
	public int minMoney;									//최저 돈
	public int money;										//입금할 돈 or 출금할 돈
	public int myMoney = 0;									//나의 돈
	public Ex02(int minMoney) {								//생성자
		this.minMoney = minMoney;
	}
	public int deposit(int money) {							//입력한다
		myMoney += money;									//현재돈 + 입금할 돈
		System.out.println("잔고: "+ myMoney);				//잔고
		return myMoney;										//내 돈 반환
	}
	public int withdraw(int money) throws InvalidWithdraw{	//예외에 출력
		myMoney -= money;									//현재돈 - 출력한 돈
		if(money < 0) {										//출력할 돈이 0보다 작으면
			throw new InvalidWithdraw("오류입니다.");			//오류 발생
		}
		else if(myMoney < minMoney) {						//내 돈이 최저 금액보다 작으면
			throw new InvalidWithdraw("오류입니다.");			//오루 발생
		}
		else {												//나머지는
			System.out.println("잔고: "+ myMoney + ", 출금: "+ money);		//잔고랑 출금된 돈 출력
		}
		return myMoney;
	}
}
public class BankAccount {
	public static void main(String[] args) throws InvalidWithdraw {
	Ex02 ba = new Ex02(-100000);
	ba.withdraw(50000);
	}
}
