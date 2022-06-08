public class Account
{
	private String accName;
	private int password;

	public void Account()
	{
		this.accName = "Default Name";
		this.password = 000000;
	}

	public void Account(String accName, int password)
	{
		this.accName = accName;
		this.password = password;
	}
}