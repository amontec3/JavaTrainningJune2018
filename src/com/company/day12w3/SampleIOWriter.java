package com.company.day12w3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class SampleIOWriter {

	private String firstName;
	private String lastName;
	private int empId;
	private boolean isActive;
	
	public SampleIOWriter(String firstName, String lastName, int empId, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.isActive = isActive;
	}

	public void writeBinary(OutputStream out) throws IOException{
		DataOutputStream dataOut = new DataOutputStream(out);
		dataOut.writeChars(this.firstName);
		dataOut.writeChars(this.firstName);
		dataOut.writeInt(this.empId);
		dataOut.writeBoolean(this.isActive);
	}
	
	public void writeText(Writer out) throws IOException{
		PrintWriter printOut = new PrintWriter(out);
		printOut.println(this.firstName);
		printOut.println(this.lastName);
		printOut.println(this.empId);
		printOut.println(this.isActive);
	}
	
	


	public static void main(String[] args){
		
		SampleIOWriter emp1 = new SampleIOWriter("Arnold", "Montecinos", 33445588, true);
		SampleIOWriter emp2 = new SampleIOWriter("Henry", "Washington", 55443322, false);
		SampleIOWriter emp3 = new SampleIOWriter("Joe", "Lee", 99778855, true);

		try {
			FileOutputStream dat = new FileOutputStream("/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day12w3/SampleEmpBinary.txt");
			emp1.writeBinary(dat);
			emp2.writeBinary(dat);
			emp3.writeBinary(dat);
			dat.close();
			
			
			FileWriter txt = new FileWriter("/Users/kgmontecinos92/Desktop/eclipse Oxygen/Workspace/JavaDemoDayOne/src/com/company/day12w3/SampleEmpText.txt");
			emp1.writeText(txt);
			emp2.writeText(txt);
			emp3.writeText(txt);
			txt.close();
			
			System.out.println("Requested Text has been printed to the files");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("An Exception Occurred");
			// TODO: handle exception
		}
		
		
		
		// TODO Auto-generated method stub
//		String str = "Java IO package session";
//		Writer writer = new StringWriter();
//		
//		System.out.println();
//	
//		try {
//			writer.write(str);
//			System.out.println(writer.toString());
//			
//			
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally {
//			writer.close();
//		}
		
	}

}
