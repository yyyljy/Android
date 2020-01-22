package di.constructor01;

//Player�� ���� �ִ� Dice�� �ܺο���(Spring Container) Injection�޾� ����ؾ�
//�ϹǷ� Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�. 
//==> Constructor or Setter�޼ҵ�
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
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