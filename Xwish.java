
/**
 * Description:
 * This program allows mutiple users to be inputed and have multiple xwishes to be inputed
 * You can search by wish,user,or assigned number. This program uses 3 parallel arrays
 * 
 * Venmo @Catelyn-Bragg
 * @Catelyn Bragg
 * @02/13/2022
 */////////////////////////////Main////////////////////////////////////////////////////////////
 import java.util.Scanner;
 import java.util.Random;
 import java.util.ArrayList;

public class Xwish
{
/**
 * Main method where the arrays are set up and the if statements that allows the user to select
 * which method they want to go to
 * 
 */
    public static void main(String[] args){
        int h=100;
    String [] nameRay = new String[h];
  ArrayList<String>[] wishRay= new ArrayList[h];
    int [] numRay= new int[h];
    int n=0;
 
    
    
    
        String Input ="";
        
   while(!Input.equals("6")){
    System.out.println("1. Enter Subject Data \n2. Search system by name\n"+ 
    "3. Search system by ID \n4. Search system by gift keyword. \n5."+
    " Print all \n6. Exit ");
    
     Scanner scanner = new Scanner(System.in);
     
     Input= scanner.nextLine();
   if(Input.equals("1"))
    {
     OP1(nameRay,numRay,wishRay,n);
     
     n++;
    }
    
    if(Input.equals("2"))
    {
     OP2(nameRay,numRay,wishRay);
     
    }
    
    if(Input.equals("3"))
    {
     OP3(nameRay,numRay,wishRay,n);
    }
    
    if(Input.equals("4"))
    {
     OP4(nameRay,numRay,wishRay);
    }
   
    if(Input.equals("5"))
    {
     OP5(nameRay,numRay,wishRay);
    }
     
    

}
}
/**
 * Method OP1 is user option 1 where the user inputs their name and wishes. The user is then
 * assigned a unique ID number 
 * 
 */
   static void OP1(String nameRay[],int numRay[],ArrayList <String> wishRay[],int n){
    //add a new method section for option 1
    Random randy = new Random();
    //System.out.println("op1");
    Scanner scanner = new Scanner(System.in);
    String name="";
    System.out.println("Hello there. what is your name?");
    name= scanner.nextLine();
    
    nameRay[n] = name;
    
    System.out.println(nameRay[n] ); 
String wish="";

wishRay[n]= new ArrayList<String>();

    while(!wish.equals("7")){
    System.out.println("what is your wish?");
    System.out.println("input '7' to stop inputing wishes");
    wish= scanner.nextLine();
    if (wish.equals ("7"))
     break;
    wishRay[n].add(wish);
}
  
    
    int num= randy.nextInt(100000);
     
     
       
        for ( int i = 0; i < numRay.length; i++ )
        {
            if ( numRay[i]==( num ) )
            {
                num=randy.nextInt(100000);
                i=0;
            }
            else if (i==numRay.length)
            { break;
               
            }
        }
        
        numRay[n] = num;
        System.out.println("your assigned number is " +numRay[n] );
        
             
        
    
     
    }
    /**
 * Method OP2 is user option 2 where the user searches for wishes and ID number by name. 
 * 
 */
   static void OP2 (String nameRay[],int numRay[],ArrayList <String> wishRay[]){
       Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name you would like to search? " );
        String nameSearch =scanner.nextLine();
        String output="";
        for ( int i = 0; i < nameRay.length; i++ )
        {
            if ( nameRay[i].contains( nameSearch ) )
            {
                System.out.println(numRay[i]+"\t"+wishRay[i]+"\t" + "\n");
                break;
            }
            else if (i==nameRay.length)
            { break;
               
            }
        }
        
   }
  /**
 * Method OP3 is user option 3 where the user can search for names and wishes by inputting the 
 * ID number
 * 
 */
    static void OP3 (String nameRay[],int numRay[],ArrayList <String> wishRay[],int n){
       Scanner scanner = new Scanner(System.in);
        int numSearch=0;
        System.out.println("What is the number you would like to search?" );
        numSearch =Integer.parseInt(scanner.nextLine());
       

        
        for(int i=0; 1 <numRay.length;i++){
            if (numRay[i]==(numSearch)){
                 System.out.print(nameRay[i]+wishRay[i] + " ");
                break;
        }
        else if (i==numRay.length)
        {
            System.out.println("number not Found");
            break;
        }

    }
   }
    /**
 * Method OP4 is user option 4 where the user can search for names and ID numbers by 
 * inputting the a gift key word
 * 
 * 
 */
   static void OP4 (String nameRay[],int numRay[],ArrayList <String> wishRay[]){
       Scanner scanner = new Scanner(System.in);
        System.out.println("What is the gift you would like to search? " );
        String giftSearch =scanner.nextLine();
        
        for(int i=0; 1 <wishRay.length;i++){
            if (wishRay[i].contains(giftSearch)){
                 System.out.print(nameRay[i]+" "+numRay[i] + " ");
                break;
        }
        else if (i==wishRay.length)
        {
            System.out.println("gift not Found");
            break;
        }

    }
   }
    /**
 * Method OP5 is user option 5 where the user can print out all the names, ID numbers and wishes
 * 
 */
    static void OP5 (String nameRay[],int numRay[],ArrayList <String> wishRay[]){
        for(int i=0;i<wishRay.length;i++){
            if (wishRay[i]!=null)
             System.out.print(nameRay[i]+"\t"+numRay[i]+"\t"+wishRay[i] +"\n" +" ");  
        }

    }
}


