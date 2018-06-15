//check if a number is a palindrome or not//

class Palindrome{
public static void main(String[] args){
int number=1234;
int a,b,c,n,reverse;
a=number%10;
n=number/10;
b=n%10;
n=n/10;
c=n%10;
n=n/10;
System.out.print("a");
System.out.print("b");
System.out.print("c");
System.out.print("n");
reverse=a*1000+b*100+c*10+n;
if(number==reverse){
System.out.print("the given no is a palindrome");
}
else{
System.out.print("the given no is not a palindrome");
}
}
} 
