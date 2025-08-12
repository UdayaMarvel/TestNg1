package com.TestRoshan;

import java.util.Scanner;

public class CharacterCount  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count characters (excluding spaces)
        int charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                charCount++;
            }
        }
        
        //int charCountLn = input.length();
        
        // Display result

        //System.out.println("Total characters (excluding spaces): " + charCount);
        //System.out.println("Total characters (including spaces): " + charCountLn);
        //sc.close();
	
	

        
        
        
        



	}

}
