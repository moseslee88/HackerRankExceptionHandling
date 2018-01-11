import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */                //Java has built-in mechanism to handle exceptions. Using the try statement we can test a         //block of code for errors. The catch block contains the code that says what to do if exception occurs. 
//This problem will test your knowledge on try-catch block.
//You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
           try (Scanner in = new Scanner(System.in)) {     int x = in.nextInt();     int y = in.nextInt();     System.out.println(x / y);                     in.close();   }        catch (Throwable t) {     System.out.println(t.getClass().getName()       + ((t instanceof ArithmeticException) ? (": " + t         .getMessage()) : ""));    } 
               }}
