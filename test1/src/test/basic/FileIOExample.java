package test.basic;

import java.io.File;
import java.io.FilenameFilter;

public class FileIOExample {
	public static void main(String[] args) {
		File fileObj = new File("C:\\data\\");
		
		System.out.println(fileObj.getAbsolutePath());
		
		//List of files and print absolute path of all files only
		File[] files = fileObj.listFiles();
		
		for (int i=0; i<files.length; i++) {
			if(files[i].isFile()) {
				System.out.println(files[i].getAbsolutePath());
			}
		}
		
		File[] txtFiles = fileObj.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("jpg")){
					return true;
				}
				else {
					return false;
				}
			}
		});
		
		System.out.println("\n\n\n\n");
		
		for (int i=0; i<txtFiles.length; i++) {
				System.out.println(txtFiles[i].getAbsolutePath());
		}
	}
}
