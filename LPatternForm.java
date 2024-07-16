
package l.pattern.form;

import java.util.Scanner;

public class LPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t~~~~~~~~~~~~>>>> L Pattern Form <<<<~~~~~~~~~~~~~~~~");
        
        Scanner scanner = new Scanner(System.in);
        
        int rowNumber;
        
        System.out.print("Please enter the number of row = ");
        
        rowNumber = scanner.nextInt();
        
          for( int row = 0; row < rowNumber; row++ )
          {
              for( int column = 0; column < rowNumber; column++ )
              {
                  if( column == 0 || row == rowNumber - 1 && column > 0 )
                  {
                      System.out.print("+ ");
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
