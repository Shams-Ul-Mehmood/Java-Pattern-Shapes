
package k_pattern_form;

public class K_Pattern_Form 
{

    public static void main(String[] args)
    {
          System.out.println("\t--------->>> K Pattern Form <<<------------");
          
          for( int row = 0; row < 10; row++ )
          {
              for( int column = 0; column < 7; column++ )
              {
                  if( column == 0 || ( row == 5 && ( column >= 0 && column <= 2 ) ) || ( row == 4 && column == 2 ) || ( column == 3 && ( row == 3 || row == 6 ) ) ||
                        ( column == 4 && ( row == 2 || row == 7 ) ) || ( column == 5 && ( row == 1 || row == 8 ) ) || ( column == 6 && ( row == 0 || row == 9 ) ) ) 
                  {
                      System.out.print("K");
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
