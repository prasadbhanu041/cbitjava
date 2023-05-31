import java.util.Scanner;
import java.util.Arrays;
public class asl
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for (int i=0;i<=arr.length-1;i++)
{
arr[i]=sc.nextLine();
}
String key=sc.nextLine();

System.out.println(key +"at the index of "+Arrays.binarySearch(array,key));
}
}

