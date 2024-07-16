
package pyramidcal.pattern.form;

import java.util.Scanner;

public class PyramidcalPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t--------->>> Pyramidical Pattern Form <<<-------------");
        
        // We get Pyramid Pattern with help of Right Angle Triangle Pattern Form.
        
        for( int a = 1; a <= 7; a++ )
        {
            for( int b = 7; b >= a; b-- )
            {
                System.out.print(" ");
            }
            for( int c = 1; c <= a; c++ )
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        
       
        // 2nd Method.
         
         for( int hh = 1; hh <= 9; hh++ )
         {
             for( int ii = 9; ii >= hh; ii-- )
             {
                 System.out.print(" ");
             }
             for( int jj = hh; jj >= 1; jj-- )
             {
                 System.out.print("~ ");
             }
             System.out.println("");
         }
        
        // 3rd Method.
       
        for( int d = 1; d <= 9; d++ )
        {
            for( int e = 9; e >= 1; e-- )
            {
                if( e > d )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" +");
                }
            }
             
            System.out.println("");     
        }
        
        // 4th Method.
        
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber , spaceHolder;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
        spaceHolder = rowNumber;
        
        char symbol;
        
        System.out.print("Please enter the symbol = ");
        
        symbol = scanner.next().charAt(0);
        
        for( int row = 1; row <= rowNumber; row++ )
        {
            for( int space = 1; space <= spaceHolder; space++ )
            {
                System.out.print(" ");
            }
            
            spaceHolder--;
            
            for( int element = 1; element <= row; element++ )
            {
                System.out.print( symbol+" " );
            }
            System.out.println("");
        }
        
        // 5th Method. 
        
        Scanner hacker = new Scanner(System.in);
        
        int rowNumber1 , spaceHolder1;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber1 = hacker.nextInt();
        
        spaceHolder1 = rowNumber1;
        
        for( int row = 1; row <= rowNumber1; row++ )
        {
            for( int space = 1; space <= spaceHolder1; space++ )
            {
                System.out.print(" ");
            }
            
            spaceHolder1--;
            
            for( int element = 1; element <= row; element++ )
            {
                System.out.print( row+" " );
            }
            System.out.println("");
        }
        
        // 6th Method.
        
        Scanner cyberForce = new Scanner(System.in);
        
        int rowNumber2 , spaceHolder2;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber2 = cyberForce.nextInt();
        
        spaceHolder2 = rowNumber2;
        
        for( int row = 1; row <= rowNumber2; row++ )
        {
            for( int space = 1; space <= spaceHolder2; space++ )
            {
                System.out.print(" ");
            }
            
            spaceHolder2--;
            
            for( int element = 1; element <= row; element++ )
            {
                System.out.print( element+" " );
            }
            System.out.println("");
        }
        
        // 7th Method.
        
        Scanner programmer = new Scanner(System.in);
        
        int rowNumber3 , spaceHolder3 , value = 0;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber3 = programmer.nextInt();
        
        spaceHolder3 = rowNumber3;
        
        for( int row = 1; row <= rowNumber3; row++ )
        {
            for( int space = 1; space <= spaceHolder3; space++ )
            {
                System.out.print(" ");
            }
            
            spaceHolder3--;
            
            for( int element = 1; element <= row; element++ )
            {
                System.out.print( value+" " );
                
                value++;
            }
            System.out.println("");
        }
    }
    
}
