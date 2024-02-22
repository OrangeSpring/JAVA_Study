public class Shutdown
{
	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("shutdown -s -t 60");
	}
}