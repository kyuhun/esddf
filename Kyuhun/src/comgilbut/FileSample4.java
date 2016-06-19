package comgilbut;
import java.io.File;
import java.util.Date;

public class FileSample4 {
	private final static String UNIT_BYTE = "Byte";
	private final static String UNIT_KILO = "KByte";
	private final static String UNIT_MEGA = "MByte";
	private final static String UNIT_GIGA = "GByte";
	private final static long SIZE_KILO = 1024;
	private final static long SIZE_MEGA = 1024*1024;
	private final static long SIZE_GIGA = 1024*1024*1024;
	
	public static void main(String[] args) {
		FileSample4 sample = new FileSample4();
		sample.printStatus("C:\\Test\\Chepter17");
		sample.printStatus("C:\\Test\\Chepter17\\system_log.txt");
	}
	public void printStatus(String pathName)
	{
		File file = new File(pathName);
		if(!file.exists())
			return;
		
		if(file.isDirectory())
		{
			System.out.println("Directory Name:"+file.getName());
			System.out.println("TOTAL:"+FileSample4.getSizeWithUnit(file.getTotalSpace()));
			System.out.println("FREE:"+FileSample4.getSizeWithUnit(file.getFreeSpace()));
		}
		else if(file.isFile())
		{
			Date lastModified = new Date(file.lastModified());
			long size = file.length();
			
			System.out.println("File Name :"+file.getName());
			System.out.println("Last Modified Date :" +lastModified.toString());
			System.out.println("SIZE :" +FileSample4.getSizeWithUnit(size));
		}
		System.out.println("-----------------------------------");
	}
	private static String getSizeWithUnit(long size) {
		StringBuffer sb = new StringBuffer();
		if(size >= SIZE_GIGA)
		{
			sb.append(size / SIZE_GIGA).append("").append(UNIT_GIGA);
		}
		else if(size<SIZE_GIGA && size >= SIZE_MEGA)
		{
			sb.append(size / SIZE_MEGA).append("").append(UNIT_MEGA);
		}
		else if(size<SIZE_MEGA && size>=SIZE_KILO){
			sb.append(size/SIZE_KILO).append("").append(UNIT_KILO);
		}
		else if(size < SIZE_KILO)
		{
			sb.append(size).append("").append(UNIT_BYTE);
		}
		return sb.toString();
	}

}
