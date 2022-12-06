package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String RevesreString(String given_string)
    {
          String reverse ="";

//          for (int i=given_string.length()-1;i>=0;i--)
//          {
//              reverse+=given_string.charAt(i);
//          }
        for (int i=0; i<given_string.length();i++)
        {
            reverse=given_string.charAt(i)+reverse;
        }
     return reverse;
    }
}
