package week1.day1;

public class Browser {

	public String launchBrowser(String chrome)
	{
		System.out.println("Browser launched successfully");
		
		return chrome;
		
	}
	
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	
	public static void main(String[] args)
	{
		Browser obj = new Browser(); 
		obj.launchBrowser("chrome");
		obj.loadUrl();
		
	}
}
