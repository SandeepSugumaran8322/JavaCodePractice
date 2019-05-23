package com.java.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) {
		Vehicle car=new Vehicle(4,"black","car");
		Vehicle bike=new Vehicle(2,"Red","bike");
		try(FileOutputStream fos=new FileOutputStream("vehicle.dat"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(bike);
				oos.writeObject(car);
				System.out.print("Created Successfully");
				
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
