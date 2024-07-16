
package v.pattern.form;

public class VPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t--------------->>> V Pattern Form <<<-----------------");
        
        // V Pattern derived from Inverted Pyramidical Pattern Form.
        
        
        for( int row = 8; row >= 1; row-- )
        {
            for( int columnSpace = row; columnSpace <= 8; columnSpace++ )
            {
                System.out.print(" ");
            }
            
            for( int column = 1; column < row * 2; column++ )
            {
                if( column > 1 && column < ( row * 2 ) - 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("+");
                }
            }
            System.out.println("");
        }
        
        // 2nd Method.
        
        for( int row = 8; row >= 1; row-- )
        {
            for( int columnSpace = 8; columnSpace >= row; columnSpace-- )
            {
                System.out.print(" ");
            }
            
            for( int column = 1; column < row * 2; column++ )
            {
                if( column > 1 && column < ( row * 2 ) - 1 )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
        
        // 3rd Method.
        
        for( int row = 0; row < 5; row++ )
        {
            for( int column = 0; column < 9; column++ )
            {
                if( row - column == 0 || row + column == 8 )
                {
                    System.out.print("S");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        // 4th Method.
        
        int initialRow = 0 , lastColumn = 6;
        
        for( int row = 0; row < 4; row++ )        // 4 is complusary.
        {
            for( int column = 0; column < 7; column++ )
            {
                if( row - column == 0 )
                {
                    System.out.print("N ");
                }
                else if( row == initialRow && column == lastColumn )
                {
                      System.out.print("S");
                      
                      initialRow++;   // initialRow = initialRow + 1;
                      
                      lastColumn--;   // lastColumn = lastColumn - 1;
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
