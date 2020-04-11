import java.util.Random;

class Main
{
	public static void main(String[] args) 
	{
		Player npad = new Player("System", "Fighter");
		npad.healing(400.0);
		npad.setLevel(38);
		npad.setDamage(15.0);

		Player pemain = new Player("pemain", "Fighter");
		pemain.healing(400.0);
		pemain.setLevel(36);
		pemain.setDamage(12.0);
		
		npad.showStatus();
		pemain.showStatus();
	}
}