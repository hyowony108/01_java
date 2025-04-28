package edu.kh.io.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoService {

	public void output1() {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			
			String str = "안녕하세요!";
			
			
			
			fos.write(str.getBytes());
			
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(fos != null) fos.close();
				
			}catch(IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
