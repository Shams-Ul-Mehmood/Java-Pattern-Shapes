
package inverted.right.angle.triangle.pattern.form;

public class InvertedRightAngleTrianglePatternForm 
{

    public static void main(String[] args)
    {
        System.out.println("```````````````>>>> Inverted Right Angle Triangle <<<<````````````````");
        
         for( int row = 1; row <= 10; row++ )
         {
             int column = 1;
             while( column <= row )  // This loop use for space.
             {
                 System.out.print(" ");
                 column++;
             }
             
             int col = 10;
             do
             {
                 System.out.print("*");
                 col--;
             }
             while( col >= row );
             
             System.out.println("");
         }
    }
    
}
