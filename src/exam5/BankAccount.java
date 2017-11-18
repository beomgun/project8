package exam5;

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
class Ex02{
	public int minMoney;									//���� ��
	public int money;										//�Ա��� �� or ����� ��
	public int myMoney = 0;									//���� ��
	public Ex02(int minMoney) {								//������
		this.minMoney = minMoney;
	}
	public int deposit(int money) {							//�Է��Ѵ�
		myMoney += money;									//���絷 + �Ա��� ��
		System.out.println("�ܰ�: "+ myMoney);				//�ܰ�
		return myMoney;										//�� �� ��ȯ
	}
	public int withdraw(int money) throws InvalidWithdraw{	//���ܿ� ���
		myMoney -= money;									//���絷 - ����� ��
		if(money < 0) {										//����� ���� 0���� ������
			throw new InvalidWithdraw("�����Դϴ�.");			//���� �߻�
		}
		else if(myMoney < minMoney) {						//�� ���� ���� �ݾ׺��� ������
			throw new InvalidWithdraw("�����Դϴ�.");			//���� �߻�
		}
		else {												//��������
			System.out.println("�ܰ�: "+ myMoney + ", ���: "+ money);		//�ܰ�� ��ݵ� �� ���
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
