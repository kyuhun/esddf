package comgilbut;
import java.io.*;

public class CopySample1 {
	public static void main(String[] args) {
		String srcPath = "C:\\system_gilbut.log";
		String destPath = "C:\\system_gilbut.log_20121104";
		CopySample1 sample = new CopySample1();
		sample.copy(srcPath,destPath);
		
	}

	private void copy(String srcPath, String destPath) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		FileWriter writer = null;
		
		try
		{
			reader = new FileReader(srcPath);
			writer = new FileWriter(destPath);
			
			int count = 0;
			char [] c = new char[1024];
			while((count = reader.read(c))!=-1)
			{
				writer.write(c,0,count);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally{
			try{
				if(reader!=null)
					reader.close();
				
				if(writer!=null)
					writer.close();
				
			}catch(IOException ignoreable){
				
			}
		}
	}
}
