
package parallelogram.pattern.form;

public class ParallelogramPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t---------->>>> Parallelogram Pattern Form <<<<-----------------");
        
        // We get Parallelogram Pattern with the help of Pyramidical Pattern Form.
        
        for( int row = 1; row <= 6; row++ )
        {
            for( int column = row; column <= 7; column++ )
            {
                System.out.print(" ");
            }
            for( int colu_1 = 1; colu_1 <= 7; colu_1++ )
            {
                System.out.print(" +");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for( int row1 = 1; row1 <= 6; row1++ )
        {
            for( int column1 = 1; column1 <= row1; column1++ )
            {
                System.out.print(" ");
            }
            for( int colu_11 = 1; colu_11 <= 7; colu_11++ )
            {
                System.out.print(" +");
            }
            System.out.println("");
        }
    }
    
}
