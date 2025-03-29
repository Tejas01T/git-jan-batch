package com.example;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
	
	 public static void main(String[] args) {
		
		 List<Integer> list=new ArrayList<Integer>();
		 list.add(10);
		 list.add(20);
		 
		 for(Integer i:list) {
			 System.err.println(i);
		 }
	}

}
