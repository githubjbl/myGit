package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	
	public static void main(String[] args) {
		int code = 0;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.print("입력 : ");
		try {
			code = isr.read();
			while(code !=13) {
				System.out.println((char)code+" ==> "+ code );
				code = isr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
