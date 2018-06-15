//write a java program using any loop to given no is palindrome or not//

class Palindrome2{

public static void main(String[] args)
{ 
int number=1331;
int x=number;
int remainder=0;
int reverse=0;

while(x!=0){
remainder=x%10;
reverse= (reverse*10) + remainder;
x=x/10;
}

System.out.println(reverse);
if(number == reverse)
System.out.print("the given number is a palindrome");
else
System.out.print("the given number is not a palindrome");
}
}