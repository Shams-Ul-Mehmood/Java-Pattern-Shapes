
package pyramidical.and.inverted.pyramidical.pattern.form;

public class PyramidicalAndInvertedPyramidicalPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t----->>> Combination Of Pyramidical And Inverted Pyramidical Pattern Form <<<-----");
        
        for( int kk = 1; kk <= 10; kk++ )
         {
             for( int ll = 1; ll <= kk; ll++ )
             {
                 System.out.print(" ");
             }
             for( int mm = 10; mm >= kk; mm-- )
             {
                 System.out.print("N ");
             }
             System.out.println("");
         }
        
        for( int kk = 10; kk >= 1; kk-- )
         {
             for( int ll = 1; ll <= kk; ll++ )
             {
                 System.out.print(" ");
             }
             for( int mm = kk; mm <= 10; mm++ )
             {
                 System.out.print("N ");
             }
             System.out.println("");
         }
        
         System.out.println("2nd Logic");
        
        // 2nd Method.
        
        for( int row = 1; row <= 9; row++ )
        {
            for( int columnSpace = 1; columnSpace <= 9; columnSpace++ )
            {
                if( columnSpace < row )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
        
        for( int row = 1; row <= 9; row++ )
        {
            for( int columnSpace = 10; columnSpace >= 1; columnSpace-- )
            {
                if( columnSpace > row )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
