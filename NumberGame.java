import java. util.*;
class NumberGame{
public static void main(String[] args) {
int a=4;
int score=100;
Random number = new Random();
int n = number. nextInt(100);
System.out.println("System generated number: "+n);
System. out.println("A Randon Number between 1-100 is generated guess it within "+a+ " attempts");
for(int i=0;i<a;i++){
     Scanner s=new Scanner(System.in);
        System.out.print("Guess the number:");
        int userInput=s.nextInt();
if(userInput==n){
    System.out.println("You guessed the correct number!!!!");
     System.out.println("Your score:"+(score-(i*25)));
     break;
}
else if(userInput<n && userInput>=1 && userInput<=100){
      System.out.println("low");
}
else if(userInput>n && userInput>=1 && userInput<=100){
      System.out.println("high");
}
else{
    System.out.println("Limit exceeds-Enter value between 1-100");
}
if(i==a-1){
    System.out.println("Your "+a+" attempts are over!!");
    System.out.println("Your score:"+(score*0));
    System.out.println("The number to be guessed is "+n);
}
}
}
}