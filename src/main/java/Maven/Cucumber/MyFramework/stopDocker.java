package Maven.Cucumber.MyFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;  
import java.io.IOException;
import java.util.Calendar;


public class stopDocker {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		startBatchFile();

}

	public static void startBatchFile() throws IOException, InterruptedException{
		
		//execute your batch file from Java code
		Runtime rt=Runtime.getRuntime();
		rt.exec("cmd /c start DockerDown.bat");
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
		
	
		FileReader f=new FileReader("logOutput.txt"); // this read string as file name 
		BufferedReader reader=new BufferedReader(f); // this opens file in Read mode for scanning
		
		String currentLine=reader.readLine();// to read first line of log file
		while(currentLine !=null && !flag)
		{
			
			if(currentLine.contains("Shut down complete"))
			{
				System.out.println("text found");
				flag=true;
				break;
			}
			
			currentLine=reader.readLine();
			}
		reader.close();
		
		//Assert.assertTrue(flag);
		
		File fl=new File("logOutput.txt");// store log file in f
		if(fl.delete()) // delete log file
		{
			System.out.println("log file deleted");
		}
		}
	}
		
}


