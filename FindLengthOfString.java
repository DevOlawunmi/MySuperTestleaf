package week1.homework;

public class FindLengthOfString {

	public static void main(String[] args) {
		
/*
 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */
		String sentence = "What a wonderful World";
		
		String[] words = sentence.split(" ");
		
		int lengthOfLastWord = words[words.length-1].length();
		System.out.println("The last word is " + words[words.length-1] + " and its length is " + lengthOfLastWord);
	}
}
