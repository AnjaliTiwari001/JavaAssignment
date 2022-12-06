package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
     public static int Findmax(int arr[])
{
    int max = arr[0];
    for (int i=0;i<arr.length;i++)
    {
        if (arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max;

}
    }

