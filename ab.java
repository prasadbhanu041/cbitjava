
import java.util.Scanner;
class main
{
public static void main(String args [])
{
int sum=0;
while(sum>=0)
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
if(i>0)
{
System.out.println(sum);
}
else{
sum=sum+i;
}
}
}

