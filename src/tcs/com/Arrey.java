package tcs.com;

import java.util.ArrayList;
import java.util.List;

public class Arrey {
public static void main(String[] args) {
	List<ArrayList<String>>emp=new ArrayList<ArrayList<String>>();
	
	ArrayList<String>al=new ArrayList<String>();
	al.add("vasim");
	al.add("vasi@gamil.com");
al.add("java");
	

ArrayList<String>a2=new ArrayList<String>();
a2.add("munish");
a2.add("munish @gmail.com");
a2.add("selenium");



ArrayList<String>a3=new ArrayList<String>();
a3.add("sathish");
a3.add("sathish@gmail.com");
a3.add("api");

//  insert in outerlist
emp.add(al);
emp.add(a2);
emp.add(a3);
//  retrive
ArrayList<String> a = emp.get(1);
System.out.println(a);













}



		
		
		
		
	}

