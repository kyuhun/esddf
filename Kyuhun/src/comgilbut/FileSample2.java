package comgilbut;
import java.io.File;
import java.io.IOException;
public class FileSample2 {
	public static void main(String[] args) {
		
		FileSample2 sample = new FileSample2();
		String path = "C:\\Test\\Chapter17";
		String logPrefix = "System_";
		String tracePrefix = "trace_";
		String suffix = ".log";
		
		File tempTraceFile = sample.crateTempFile(path, tracePrefix, suffix);
		File tempLogFile = sample.crateTempFile(path, logPrefix, suffix);
		
		if(tempTraceFile == null || tempTraceFile == null){
			System.out.println("Fail to create");
			
		}else{
			System.out.println("Success to create:"+tempTraceFile.getName());
			System.out.println("Success to create:"+tempLogFile.getName());
		}
		tempLogFile.deleteOnExit();
	}
	
	public File crateTempFile(String path,String prefix, String suffix)
	{
		File tempDir = new File(path);
		if(!tempDir.exists())
			tempDir.mkdirs();
		
		File tempFile = null;
		try{
			tempFile = File.createTempFile(prefix, suffix,tempDir);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		return tempFile;
	}
}
