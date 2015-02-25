package lab2_Naila;

import java.io.*;
import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class interpret {
	 static BufferedReader bufferedReader =null;
	static FileReader fileReader=null;
	public static void main(String[] args) {
		try {
			 //BufferedReader in = new BufferedReader;
			File file = new File("C:\\Users\\hp\\Desktop\\lab2_Naila_0874\\naila.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
		//	BufferedReader in = new BufferedReader(in);
			
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		String string;

		
		try {
			while ((string = bufferedReader.readLine()) != null) 
			{
			
				String[] check = string.split(" ");

				if (check[0].compareToIgnoreCase("let") == 0) { 
					String[] check2 = check[1].split("=");
					if (check2.length == 1) {
						System.out.println("ERROR:The operator '=' not found.");
						// return false;
						
					} else {
						try {
							Integer.parseInt(check2[0]);
							System.out.println("Incorrect syntax");
						} catch (Exception e) {
							System.out.println("Correct syntax");
							try {
								fileReader.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							// return false;
						}
						
					}
				}
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	//public static void main(String[] args) {
		//interpret a = new interpret();
		//a.checkvalid();
///	}
	
}
