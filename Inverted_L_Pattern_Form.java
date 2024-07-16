
package inverted_l_pattern_form;

import java.util.Scanner;

public class Inverted_L_Pattern_Form 
{

    public static void main(String[] args)
    {
        System.out.println("\t~~~~~~~~~~~~>>>> Inverted L Pattern Form <<<<~~~~~~~~~~~~~~~~");
        
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
          for( int row = 0; row < rowNumber; row++ )
          {
              for( int column = 0; column < rowNumber; column++ )
              {
                  if( column == 0 || row == 0 && column > 0 )
                  {
                      System.out.print("o ");
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
