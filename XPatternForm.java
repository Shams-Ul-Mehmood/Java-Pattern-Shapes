
package x.pattern.form;

public class XPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t~~~~~~~~~~>>>> X Pattern Form <<<<~~~~~~~~~~~~~~");
        
        // X Pattern derived from Square Pattern Form.
        
        for( int row = 1; row < 10; row++ )
        {
            for( int column = 1; column < 10; column++ )
            {
                if( row == column || row + column == 10 )
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
        
        for( int row = 0; row < 6; row++ )
        {
            for( int column = 0; column < 6; column++ )
            {
                if( row == column || row + column == 6-1 )
                {
                    System.out.print("$");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        // 3rd Method.
        
        for( int row = 0; row <= 8; row++ )
        {
            for( int column = 0; column <= 8; column++ )
            {
                if( row - column == 0 || row + column == 8 )
                {
                    System.out.print("N");
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
