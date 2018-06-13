//check if a given year is a leap year or not//

class leap{
public static void main (String[] args){
 int year=2016;

if(year%400==0){
System.out.print("it is a leap year");
}
else if(year%100==0){
System.out.print("it is not a leap year");
}
else if(year%4==0){
System.out.print("it is a leap year");
}
else{System.out.print("it is not a leap year");}
}}



