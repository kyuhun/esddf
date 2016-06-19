package comgilbut;
import java.io.*;
public class FileSample5 {
	public static void main(String[] args) {
		
		FileSample5 sample = new FileSample5();
		sample.printDirectoryInfo("./");
	}

	private void printDirectoryInfo(String path) {
		File file = new File(path);
		
		if(!file.exists()||!file.isDirectory())
			return;
		
		System.out.println("Path:"+file.getPath());
		System.out.println("Absolute Path:"+file.getAbsolutePath());
		try{
			System.out.println("Canonical Path:"+file.getCanonicalPath());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("------------------------------");
	String [] fileList = file.list();
	for(String fileItem : fileList){
		System.out.println("-"+fileItem);
	}
	
	System.out.println("---------------------------------");
	
	fileList = file.list(new FilenameFilter() {
		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.startsWith("lib");
		}
	});
		
		for(String fileItem : fileList)
		{
			System.out.println("-"+fileItem);
		}
		System.out.println("-------------------------");
		File[] fileObjList = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().startsWith(".");
			}
		});
		for(File fileObj : fileObjList)
		{
			System.out.println("-"+fileObj.getName());
		}
	}



}
