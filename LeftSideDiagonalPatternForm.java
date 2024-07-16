
package left.side.diagonal.pattern.form;

public class LeftSideDiagonalPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t+++++++++++++++>>>> Left Side Diagonal Pattern Form <<<<++++++++++++++++++++++++");
        
        // We get Left Side Diagonal Pattern with help of Pyramidical Pattern Form.
        
        for( int kk = 1; kk <= 10; kk++ )
         {
             for( int ll = 1; ll <= kk; ll++ )
             {
                 System.out.print(" ");
             }
             for( int mm = kk; mm <= kk; mm++ )
             {
                 System.out.print("& ");
             }
             System.out.println("");
         }
        
        // 2nd Method.
        
        // We get Left Side Diagonal Pattern with help of Triangle Pattern Form.
        
        for( int row = 1; row <= 8; row++ )
        {
            for( int column = 1; column <= row; column++ )
            {
                if( row >= 2 && column > row - 1 )
                {
                    System.out.print("? ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        //3rd Method.
        
        // We get Left Side Diagonal Pattern with help of Triangle Pattern Form.
        
        for( int row = 1; row <= 8; row++ )
        {
            for( int column = 1; column <= row; column++ )
            {
                if( row >= 2 && column <= row - 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }
        
        // 4th Method.
        
        for( int row = 1; row <= 7; row++ )
        {
            for( int columnSpace = 1; columnSpace <= row; columnSpace++ )
            {
                System.out.print(" ");
            }
            for( int column = row; column <= 7; column++ )
            {
                if( row <= 6 && column >= row + 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("> ");
                }
            }
            System.out.println("");
        }
        
        // 5th Method.
        
        for( int row = 0; row <= 8; row++ )
        {
            for( int column = 0; column <= 8; column++ )
            {
                if( row == column )
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
