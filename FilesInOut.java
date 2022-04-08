import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.Scanner;

/**
 *
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("supply filename for input:");
        Scanner in = new Scanner(System.in); // Creating scanner object called "in"
        boolean inputSuccess = false;
        String inputPath = "";

        // Testing  the input file exists
        while (inputSuccess == false){ // While  boolean value = false
             inputPath = in.nextLine();  // Read the next line
             File inputFile = new File(inputPath);
            try {
                Scanner inFile = new Scanner(inputFile);
                inputSuccess = true; // If successful set boolean value to true
            }catch(IOException e){ // To catch exception
                System.err.println("IOException: " + e.getMessage()
                        + "not found" + ".Try adding a new filepath");
            }
        }

        File inputFile =new File(inputPath);
        Scanner inFile = new Scanner(inputFile);
        inFile.useDelimiter("\n"); // Using a line as a delimiter
        inFile.tokens(); // Separating the lines

        System.out.println("supply filename for output:");
        Scanner out = new Scanner(System.in); // Creating a scanner object called "out"
        boolean outputSuccess = false;
        String outputPath = "";

                   System.out.println("File operation succesfull");


            
    } // main
    
    public String string_To_Date(String date) {
		StringBuffer dateBuffer = new StringBuffer(date);
		dateBuffer.insert(2, '/');
		dateBuffer.insert(5, '/');
		String result = dateBuffer.toString();
		return result;
	}
    
    public static String formatString(String inputString, boolean allCaps){
        if (allCaps){
            return inputString.toUpperCase();
        }
        else{
            return inputString.substring(0,1).toUpperCase() + inputString.substring(1);
        }
    }

} // FilesInOut

