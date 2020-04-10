package Maven.Cucumber.MyFramework;

import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;
import java.util.Calendar;


public class startDocker {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		startBatchFile();

}

	public static void startBatchFile() throws IOException, InterruptedException{
		
		//execute your batch file from Java code
		Runtime rt=Runtime.getRuntime();
		rt.exec("cmd /c start Docker.bat");
		//rt.exec("cmd /c start File.bat");
		System.out.println("command run from batch file");
		Thread.sleep(5000);
		
		boolean flag=false;
		
		Calendar cal=Calendar.getInstance(); // get current time
		cal.add(Calendar.SECOND, 45);  // add seconds to current time
		long stopNow=cal.getTimeInMillis(); // time to stop scanning
		
			
		while(System.currentTimeMillis()<stopNow)  //Continuous monitoring of log file
		{
			
		if(flag==true)
		{
			break;
		}
		//Scan the log file to find the required text
		
		System.out.println("inside loop1");
		FileReader f=new FileReader("logOutput.txt"); // this read string as file name 
		BufferedReader reader=new BufferedReader(f); // this opens file in Read mode for scanning
		
		String currentLine=reader.readLine();// to read first line of log file
		while(currentLine !=null && !flag)
		{
			System.out.println("inside loop2");
			if(currentLine.contains("Git"))
			{
				System.out.println("text found");
				flag=true;
				break;
			}
			
			currentLine=reader.readLine();
			}
		reader.close();
		
		//Assert.assertTrue(flag);
		
		rt.exec("cmd /c start ScaleChrome.bat");//once docker is started, scale Chrome to 5 browser
		}
	}
		
}


