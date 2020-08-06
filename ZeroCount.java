package Task2;

public class ZeroCount
{
public static void main(String [] args) {
int count = 0, num = 101010;
while(num != 0)
{
  int n=num%10;
  num=num/10;
  if(n==0)
    count++;
}

System.out.println("Number of digits: " + count);
}
}