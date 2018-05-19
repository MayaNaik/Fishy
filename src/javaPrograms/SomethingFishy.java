package javaPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;



public class SomethingFishy {

	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg="HELLO SANDEEP";
		try {
			Robot rb=new Robot();
			for(int i=0;i<msg.length();i++)
			{
				rb.keyPress(KeyEvent.VK_SHIFT);
				rb.keyPress(msg.charAt(i));
				rb.keyRelease(msg.charAt(i));
				rb.keyRelease(KeyEvent.VK_SHIFT);
			//	rb.keyRelease(msg.charAt(i));
				System.out.println("" +(int)msg.charAt(i));
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
