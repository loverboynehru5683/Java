package com.vm.training.java.Test;

import java.util.*;
public class CharacterCount {
	static int wordCount(String s)  
	{  
		int count=0;  

		char ch[]= new char[s.length()];     
		for(int i=0;i<s.length();i++)  
		{  
			ch[i]= s.charAt(i);  
			if(((ch[0]!=' ')&&(i==0)) || ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) )  
				count++;  
		}  
		return count;  
	}  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();

		int count=0;
		for(int i = 0; i < str.length(); i++) {    
			if(str.charAt(i) != ' ')    
				count++;    
		}  

		System.out.println("Word-> "+wordCount(str));
		System.out.println("Character-> "+count);

	}

}
