package com.demo.test;

import java.util.Arrays;

public class TestStringFunctions {
	public static void main(String[] args) {
		System.out.println("indexOf(substr) ");
		String s1="some data"; 
		System.out.println(s1.indexOf("data"));
		System.out.println("toLowerCase()");
		String s2="ABCTest";
		System.out.println(s2.toLowerCase());
		System.out.println("toUpperCase()");
		String s3="ABCTest";
		System.out.println(s3.toUpperCase());
		System.out.println("contains(substr)");
		String s4="some data"; 
		System.out.println(s4.contains("data"));
		System.out.println("split(delimiter) ");
		String s5="xxx,yyy,zzz-rrr"; 
		String[] result =s5.split(",");
		System.out.println(Arrays.toString(result));
		System.out.println("join(delimiter, arr of strings)");
		String s6="xxx,yyy,zzz-rrr"; 
		System.out.println(s6.join(":",s6));
		System.out.println("startswith(substr) ");
		String s7="ABC Test"; 
		System.out.println(s7.startsWith("AB"));
		System.out.println("endswith(substr) ");
		String s8="ABC Test"; 
		System.out.println(s7.startsWith("st"));
		System.out.println("charAt(i)");
		String s9="ABC Test"; 
		System.out.println(s7.startsWith("st"));
	    System.out.println("matches(regexpresssion) ");
	    String s10="Happy Life"; 
		System.out.println(s10.matches("fe$"));
        System.out.println("equals(Object ob)");
        String s11="test"; 
        String s12=new String("test"); 
        s11.equals(s12);
        System.out.println("compareTo(Object ob)");
        String s13="aaaa"; 
        String s14="AAAA"; 
        s13.compareTo(s14);
        
    
		
	}

}
