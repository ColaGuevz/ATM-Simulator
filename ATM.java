public class ATM
{
	private int maxCap;
	private int currentCashInTheMachine;
	private int amountToBeWithrawn;

	private int password = 12345678;
	private int inputPassword;

	public ATM()
	{
		this.maxCap = 1000000;
		this.currentCashInTheMachine = 1000000;
		this.amountToBeWithrawn = 0;
	}

	public int getMaxCap()
	{
		return maxCap;
	}

	public int getCurrentCap()
	{
		return currentCashInTheMachine;
	}

	public int amountToBeWithrawn()
	{
		return this.amountToBeWithrawn;
	}

	public void withraw(int inputPassword, int amount)
	{
		this.amountToBeWithrawn = amount;
		this.inputPassword = inputPassword;

		if (this.inputPassword == this.password)
		{
				this.currentCashInTheMachine = this.maxCap - this.amountToBeWithrawn;
			if (this.amountToBeWithrawn > this.maxCap)
			{
				this.currentCashInTheMachine = 0;
			}
			else if (this.amountToBeWithrawn <= 0)
			{
				this.currentCashInTheMachine = this.maxCap;
			}
		}
		else if (this.inputPassword != this.password)
		{
			System.out.println("WRONG PASSWORD!!!");
		}
	}

	@Override     
	public String toString()
	{
		return "Original capacity of the ATM: " + this.maxCap + "\nThe withdrew amount is: " + this.amountToBeWithrawn +"\nCurrent cash in the ATM: " + this.currentCashInTheMachine;
	}
}