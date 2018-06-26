package com.company.day13w3;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PippedStreamIOExample {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		final PipedInputStream pis = new PipedInputStream();
		final PipedOutputStream pos = new PipedOutputStream();
		
		//connect pipe - needs handling of IOException
		pis.connect(pos);
		
		Thread pipeWriter = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 65; i < 91; i++) {
					try {
						pos.write(i);
						//Thread.sleep(200);
					} //catch (IOException | InterruptedException e) {
						catch (IOException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
			
		});
		
		
		Thread pipeReader = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 65; i < 91; i++) {
					try {
						System.out.print((char)pis.read());
						//Thread.sleep(400);
					} //catch (IOException | InterruptedException e) {
						catch (IOException  e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
			
		});	
		
		pipeWriter.start();
		pipeReader.start();
		
		pipeWriter.join();
		pipeReader.join();
		
		
		pis.close();
		pos.close();
		

		
	}

}
