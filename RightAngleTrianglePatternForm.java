
package right.angle.triangle.pattern.form;

public class RightAngleTrianglePatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("~~~~~~~~>>>> Right Angle Triangle <<<<~~~~~~~~~~");
        
          for( int row = 1; row <= 6; row++ )
          {
              for( int column = 6; column >= row; column-- )  // This loop use for spaces.
              {
                  System.out.print(" ");
              }
              for( int col = 1; col <= row; col++ ) 
              {
                  System.out.print("*");
              }
            
              System.out.println("");
          }          
    }
    
}
