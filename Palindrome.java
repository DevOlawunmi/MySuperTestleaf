package week1.homework;

public class Palindrome {

	public static void main(String[] args) {
		 String word = "A man, a plan, a canal: Panama";
		word = word.replaceAll("[^a-zA-Z]", "");
		 
		 String reverse = "";
		 for(int i = word.length()-1; i>=0; i--) {
			 reverse+=word.charAt(i);
		 }
		 System.out.println(reverse);
		 if(word.equalsIgnoreCase(reverse)) {
			 System.out.println(reverse + " is a palindrome");
		 }
		 else System.out.println(word + " is not a palindrome");

	}

}
