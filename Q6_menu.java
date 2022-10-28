//safiullah
//2k22
//Roll no 88


import java.util.Scanner;
class menu{
public static void main(String org[]){
Scanner obj=new Scanner(System.in);


System.out.println("Enter The choice ");


System.out.println("Enter 1 to find the price of Large pizza");

System.out.println("Enter 2 to find the price of Medium pizza");

System.out.println("Enter 3 to find the price of Small pizza");


System.out.println("Enter 4 to find the price Zingar burgar");

System.out.println("Enter 5 to find the price Mango Juice");

System.out.println("Enter 6 to find the price Chicken");

System.out.println("Enter 7 to find the price Beef");

int choice =obj.nextInt();

switch(choice){

case 1: System.out.println("The Price Of Large pizza is: 950");
break;


case 2: System.out.println("The Price Of Medium pizza is: 600");
break;


case 3: System.out.println("The Price Of Small pizza is: 250");
break;


case 4: System.out.println("The Price Of  Zingar burgur is: 250");
break;


case 5: System.out.println("The Price of Mango juice is: 250");
break;


case 6: System.out.println("The Price of Chicken is: 500");
break;


case 7: System.out.println("The Price Of Beef is: 1200");
break;
}
}
}