package comgilbut;

import java.io.File;

public class FileSample3 {
	public static void main(String[] args) {
		FileSample3 sample = new FileSample3();
		
		String filePath = "C:\\Test\\Chepter17\\system_log.txt";
		sample.testPermission(filePath);
	}
	public void testPermission(String path){
		File file = new File(path);
		
		if(!file.exists()){
			System.out.println("No file at "+path);
			return;
		}
	file.setReadOnly();
	System.out.println("Permission to execute:" +file.canExecute());
	System.out.println("Permission to read:" +file.canRead());
	System.out.println("Permission to write" +file.canWrite());
	}
}
