package exam5;

class InvalidWithdraw2 extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw2(String msg) {
		super(msg);
	}
}
class Ex03{
	public int minMoney;													//���� ��
	public int money;														//�Ա��� �� or ����� ��
	public int myMoney = 0;													//���� ��
	public Ex03(int minMoney) {												//������
		this.minMoney = minMoney;
	}
	public int deposit2(int money) {										//�Է��Ѵ�
		myMoney += money;													//���絷 + �Ա��� ��
		System.out.println("���� �Ա�ó��: �Աݱݾ�="+ money + ", �ܱ�=" + myMoney);	//�ܰ�
		return myMoney;														//�� �� ��ȯ
	}
	public int withdraw2(int money) throws InvalidWithdraw2{				//���ܿ� ���
		myMoney -= money;													//���絷 - ����� ��
		if(money < 0) {														//����� ���� 0���� ������
			throw new InvalidWithdraw2("�ʰ���� �䱸 ����.");					//���� InvalidWithdraw2 Ŭ������ ������ ������ ���
		}
		else if(myMoney < minMoney) {										//�� ���� ���� �ݾ׺��� ������
			throw new InvalidWithdraw2("�ʰ���� �䱸 ����.");					//���� InvalidWithdraw2 Ŭ������ ������ ������ ���
		}
		else {																//��������
			System.out.println("���� ���ó��: ����ݾ�="+ money + ", �ܱ�=" + myMoney);//�ܰ�� ��ݵ� �� ���
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

