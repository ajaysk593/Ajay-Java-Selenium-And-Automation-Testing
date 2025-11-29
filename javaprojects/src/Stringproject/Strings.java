package Stringproject;

import java.util.Scanner;

public class Strings {

	Scanner sc=new Scanner(System.in);
	
	void countcharaters(String Text) {
		System.out.println("charaters with spaces:"+Text.length());
		System.out.println("charaters without spaces:"+Text.replace("","").length());
	}
	
	void countwords(String Text) {
		String[] words=Text.trim().split("+");
		System.out.println("Total counts:"+words.length);
	}
	
	void wordfrequency(String Text) {
		String[] words=Text.toLowerCase().split("+");
		int count=0;
		for(String w:words) {
			if(w.equals(words.length)){
				count++;
			}
		}
		System.out.println("Frequency of \""+words +"\" ="+count);
	}
	
}
