package comgilbut;
import java.io.File;
import java.io.IOException;;
public class FileSample1 {
	public static void main(String[] args) {
		FileSample1 sample = new FileSample1();
		
		String dirPath = "C:\\Test\\Chepter17";
		String logName = "system_log.txt";
		String confName = "system.conf";
		
		File logFile = sample.createFile(dirPath, logName);
		File conFile = sample.createFile(dirPath, confName);
		
		System.out.println("Exist log file:"+logFile.exists());
		System.out.println("Exist con file:"+conFile.exists());
		conFile.delete();
		System.out.println("Exist log file:"+conFile.exists() );
	}
	
	
	
	public File createFile(String path,String fileName){
		File dirPath = new File(path);
		File file = new File(dirPath,fileName);
		
		if(file.exists())
			return file;
		
		dirPath.mkdirs();
		try{
			file.createNewFile();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return file;
	}
}
