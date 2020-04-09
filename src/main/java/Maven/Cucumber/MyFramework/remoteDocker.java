package Maven.Cucumber.MyFramework;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;



public class remoteDocker {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		remoteDocker();
		
	}

	public static void remoteDocker() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		URL url=new URL("");
		RemoteWebDriver rd=new RemoteWebDriver(url, dc);
		rd.get("https://wwww.google.com");
	}
}
