package javaBasicsQues;

public class Arr {
 public static void main (String[] args) {
	 
	 String str="welcome my india";
	 String s[]=str.split(" ");
	 String ss=" ";
	for(int i=0;i<s.length;i++) {
		if(s[i].contains("india")) {
			ss=s[i];
			System.out.println(ss);
		}
	}
 }
}
