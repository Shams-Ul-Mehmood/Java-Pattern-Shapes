
package shape_pattern._form;

import java.util.Scanner;

public class Shape_Pattern_Form 
{

    public static void main(String[] args)
    {
          System.out.println("\t------------>>>> Shape Pattern Form <<<<----------------");
          
        for( int row = 0; row < 5; row++ )
        {
            for( int column = 0; column < 10; column++ )
            {
                if( column == 0 || column == 9 || row == 4 || ( row == 3 && ( column != 4 && column != 5 ) ) ||
                    ( row == 2 && ( column != 3 && column != 4 && column != 5 && column != 6 ) ) || 
                        ( row == 1 && ( column != 2 && column != 3 && column != 4 && column != 5 && column != 6 && column != 7 ) ) )
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        // 2nd Method.
        
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber , spaces;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
        spaces = ( rowNumber * 2 ) - 2;
        
        for( int row1 = 1; row1 <= rowNumber; row1++ )
        {
            // Left Part.
            
            for( int column1 = 1; column1 <= row1; column1++ )
            {
                  System.out.print("#");
            }
            
            // Spaces or Middle Part.
            
            for( int column2 = 1; column2 <= spaces; column2++ )
            {
                System.out.print(" ");
            }
            
            // Right Part.
            
            for( int column3 = 1; column3 <= row1; column3++ )
            {
                 System.out.print("#");
            }
           
            spaces = spaces - 2;
            
            System.out.println("");
        }
       
    }
    
}
