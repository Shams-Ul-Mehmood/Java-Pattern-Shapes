
package inverted.t.pattern.form;

import java.util.Scanner;

public class InvertedTPatternForm
{

    public static void main(String[] args)
    {
        System.out.println("\t---------------->>>> Inverted T Pattern Form <<<<--------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
        for( int row = 0; row <= rowNumber; row++ )
        {
            for( int column = 0; column <= rowNumber; column++ )
            {
                if( row == rowNumber || column == rowNumber )
                {
                    System.out.print("| ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
