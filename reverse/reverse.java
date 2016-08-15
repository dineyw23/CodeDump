import java.io.*;
import java.util.*;

public class reverse {
  public static void main(String args[]) {
    String input = "";
    System.out.println("Please enter the string to be reversed: ");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
      String result = "";
      result = reverse(input);
      System.out.println(result);
    }
    catch(IOException e) {
      e.printStackTrace(); 
    }
  }

  public static String reverse(String input) {
    char[] output = input.toCharArray();
    String returnString = ""; 
     for (int i=output.length-1; i>=0; i--)
       returnString = returnString + output[i];
      
     return returnString;
  }
}
