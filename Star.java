// Draw a pattern//

class Star{
public static void main(String[] args){
int i=1;
int j=1;
while(i<=4){

while(j<=i){
System.out.print("*");
j++;
}
System.out.println();
i++;
j=1;
}
}}