package com.gilbut.Exception;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class DirCommand {
	private SimpleDateFormat fmt;
	
	public DirCommand() {
		// TODO Auto-generated constructor stub
		fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm;ss");
	}

	public static void main(String[] args) {
		String path = "D:\\";
		DirCommand dir = new DirCommand();
		dir.printFileList(path);
		
	}
	public void printFileList(String path){
		
		File file  =new File(path);
		File[] childList = file.listFiles();
		
		
		for (File child : childList) {
			String fileName = "";
			long modifiedTime = child.lastModified();
			long fileSize = child.length();
			
			if (child.isFile()) {
				
				fileName="[File]"+child.getName();
				
			} else if(child.isDirectory()) {
				fileName = "[Dir]"+child.getName();
			}else {
				fileName = child.getName();
			}
			
		System.out.println(fileName+",("+fileSize+"),"+fmt.format(new Date(modifiedTime)));
		}
		
	}

}
