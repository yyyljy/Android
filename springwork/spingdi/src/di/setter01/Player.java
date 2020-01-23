package di.setter01;

//Player�� ���� �ִ� Dice�� �ܺο���(Spring Container) Injection�޾� ����ؾ�
//�ϹǷ� Injection���� �� �ֵ��� �̸� �غ��ؾ� �Ѵ�. 
//==> Constructor or Setter�޼ҵ�
public class Player implements AbstractPlayer{
	AbstractDice dice;
	public AbstractDice getDice() {
		return dice;
	}

	public void setDice(AbstractDice d) {
		this.dice = d;
	}
	int totalValue=0;
	public Player() {
	}
	
	public Player(AbstractDice d) {
		super();
		this.dice = d;
		System.out.println("Player�� �Ű����� 1�� ������");
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=dice.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}