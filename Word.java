/*Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".
*/
import java.io.*;
import java.util.Scanner;

class Word{
	public static void main(String[] args){

System.out.println("Enther the string");
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();
//String str=s1.toLowerCase();
String words[]=str.split(" ");
System.out.println("Hi");
	for(int i=words.length-1;i>words.length-4;i--){
System.out.println(words[i]);
}
}
}

/*
Output------
admin1@admin1-desktop:~/Desktop$ javac Word.java
admin1@admin1-desktop:~/Desktop$ java Word
Enther the string
poonam john bob alice Rashmi 
Hi
Rashmi
alice
bob
*/
