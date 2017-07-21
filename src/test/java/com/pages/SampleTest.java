package com.pages;

public class SampleTest 
{
public static void main(String[] args) {
	String str = "abcd 1234";
	String[] part = str.split("(?<=\\D)(?=\\d)");
	System.out.println(part[0]);
	System.out.println(part[1]);
}
}
