package Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serial implements Serializable{
	
	
	int i=10;
	int j=20;
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serializable
		
		Serial serial=new Serial();
		
		
		
		FileOutputStream file=new FileOutputStream("text.txt");
		
		ObjectOutputStream h=new ObjectOutputStream(file);
		h.writeObject(serial);
		
		
		//deserilizable
		
		FileInputStream input=new FileInputStream("text.txt");
		
		ObjectInputStream out=new ObjectInputStream(input);
		
		Serial t2=(Serial) out.readObject();
		
		System.out.println(t2.i);
		System.out.println(t2.j);
		

	}

}
