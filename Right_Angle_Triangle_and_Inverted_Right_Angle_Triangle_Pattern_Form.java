
package right_angle_triangle_and_inverted_right_angle_triangle_pattern_form;

public class Right_Angle_Triangle_and_Inverted_Right_Angle_Triangle_Pattern_Form 
{

    public static void main(String[] args)
    {
        System.out.println("------->>> Combination Of Right Angle Triangle and Inverted Right Angle Triangle <<<--------");
        
        for( int row = 1; row <= 8; row++ )
        {
            int column = 8;
            while( column >= row )  // This loop use for spaces. 
            {
                System.out.print(" ");
                column--;
            }
            int col = 1; 
            do
            {
                System.out.print("*");
                col++;
            }
            while( col <= row );
            
            System.out.println("");
        }
        
        int row1 = 1;
        while( row1 <= 8 )
        {
            for( int column1 = 1; column1 <= row1; column1++ ) // This loop use for spaces. 
            {
                System.out.print(" ");
            }
            
            for( int colu = 8; colu >= row1; colu-- )
            {
                System.out.print("*");
            }
            
            System.out.println("");
            
            row1++;
        }
        
        // 2nd Method.
        
        for( int m = 1; m <= 5; m++ )
         {
             for( int n = 5; n >= m; n-- )
             {
                 System.out.print(" ");
             }
             for( int o = 1; o <= m; o++ )
             {
                 System.out.print("|");
             }
             System.out.println("");
         }
         for( int p = 1; p <= 5; p++ )
         {
             for( int q = 1; q <= p; q++ )
             {
                 System.out.print(" ");
             }
             for( int r = p; r <= 5; r++ )
             {
                 System.out.print("|");
             }
             System.out.println("");
         }
          
         // 3rd Method.
         
         for( int y = 1; y <= 7; y++ )
         {
             for( int z = 7; z >= y; z-- )
             {
                 System.out.print(" ");
             }
             for( int aa = y; aa >= 1; aa-- )
             {
                 System.out.print(":");
             }
             System.out.println("");
         }
         for( int bb = 7; bb >= 1; bb-- )
         {
             for( int cc = bb; cc <= 7; cc++ )
             {
                 System.out.print(" ");
             }
             for( int dd = 1; dd <= bb; dd++ )
             {
                 System.out.print(":");
             }
             System.out.println("");
         }
         
    }
    
}
