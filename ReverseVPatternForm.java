
package reverse.v.pattern.form;

public class ReverseVPatternForm
{

    public static void main(String[] args) 
    {
        System.out.println("\t--------------->>> Reverse V Pattern Form <<<-----------------");
        
        // Reverse V Pattern derived from Pyramidical Pattern Form.
        
        
        for( int row = 1; row <= 8; row++ )
        {
            for( int columnSpace = 8; columnSpace >= row; columnSpace-- )
            {
                System.out.print(" ");
            }
            
            for( int column = 1; column < row * 2; column++ )
            {
                if( column > 1  && column < ( row * 2 ) - 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        // 2nd Method.
        
        for( int row = 1; row <= 8; row++ )
        {
            for( int columnSpace = row; columnSpace <= 8; columnSpace++ )
            {
                System.out.print(" ");
            }
            
            for( int column = 1; column < row * 2; column++ )
            {
                if( column > 1  && column < ( row * 2 ) - 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("9");
                }
            }
            System.out.println("");
        }
    }
    
}
