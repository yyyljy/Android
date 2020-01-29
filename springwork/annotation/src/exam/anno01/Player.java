package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//Player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection�޾� ����ؾ� 
//�ϹǷ� Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�.
//==> Constuctor or Setter�޼ҵ�
@Service("myplayer")
public class Player implements AbstractPlayer {
	@Autowired
	@Qualifier("dice2")
	AbstractDice d;
	int totalValue=0;
	public Player() {
		System.out.println("�⺻������...");
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}