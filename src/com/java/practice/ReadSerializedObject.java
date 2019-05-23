package com.java.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerializedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileInputStream fis = new FileInputStream("vehicle.dat"))
		{
			try(ObjectInputStream ois= new ObjectInputStream(fis))
					{
						Vehicle v1 = (Vehicle)ois.readObject();
						Vehicle v2=(Vehicle)ois.readObject();
						System.out.println(v1.toString());
						System.out.println(v2.toString() );
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
