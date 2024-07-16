
package j_pattern_form;

public class J_Pattern_Form
{

    public static void main(String[] args)
    {
          System.out.println("\t--------->>> I Pattern Form <<<------------");
          
          for( int row = 0; row < 9; row++ )
          {
              for( int column = 0; column < 9; column++ )
              {
                  if( row == 0 || ( column == 4 && row != 8 ) || ( column == 1 && ( row > 5 && row < 8 ) ) || ( row == 8 && ( column > 1 && column < 4 ) ) )
                  {
                      System.out.print("?");
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
