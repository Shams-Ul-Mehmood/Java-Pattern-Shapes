
package inverted.triangle.pattern.form;

public class InvertedTrianglePatternForm 
{

    public static void main(String[] args) 
    {
           System.out.println("\t\t~~~~~~~~~~>>>> Dessending Pattern Form <<<<~~~~~~~~~~~~~");
           
           for( int row = 1; row <= 10; row++ )
           {
               int column = row;
               while( column <= 10 )
               {
                   System.out.print("*");
                   column++;
               }
               System.out.println("");
           }
           
           // 2nd Method.
           
           int row1 = 1;
           while( row1 <= 7 )
           {
               int column1 = 7;
               do
               {
                   System.out.print("+");
                   column1--;
               }
               while( column1 >= row1 );
               
               System.out.println("");
               
               row1++;
           }
           
           // 3rd Method.
           
           for( int row2 = 8; row2 >= 1; row2-- )
           {
               for( int column2 = 1; column2 <= row2; column2++ )
               {
                   System.out.print(".");
               }
               System.out.println("");
           }
           
           // 4th Method.
           
        for( int a = 1; a <= 6; a++ )
        {
            for( int b = 6; b >= a; b-- )
            {
                 if( a <= 5 && b <= a - 1 )
                 {
                     System.out.print(" ");
                 }
                 else
                 {
                     System.out.print("a ");
                 }
            }
            System.out.println("");
        }
        
        // 5th Method.
        
        for( int row = 1; row <= 10; row++ )
        {
            for( int column = 1; column <= 10 - row; column++ )
            {
                System.out.print("@ ");
            }
            System.out.println("");
        }
           
          System.out.println("\t----------->> Desending Pattern In Numbers <<----------------");
           
           for( int row3 = 1; row3 <= 6; row3++ )
           {
               for( int column3 = row3; column3 <= 6; column3++ )
               {
                   System.out.print(" "+row3 * column3 );
               }
               System.out.println("");
           }
           
           // 2nd Method.
           
          int row4 = 1;
          while( row4 <= 9 )
          {
              int column4 = 9;
              while( column4 >= row4 )
              {
                  
                  System.out.print(" "+row4 * column4 );
                  
                  column4--;
              
              }
                
              System.out.println("");
              
              row4++;
          }
          
          // 3rd Method.
          
          int row5 = 10;
          do
          {
              int column5 = 1;
              do
              {
                  System.out.print(" "+row5 * column5);
                  
                  column5++;
              }
              while( column5 <= row5 );
              
              System.out.println("");
              
              row5--;
              
          }
          while( row5 >= 1 );
                
         // 4th Method.
          
        for( int row = 1; row <= 10; row++ )
        {
            for( int column = 1; column <= 10 - row; column++ )
            {
                System.out.print(column+" ");
            }
            System.out.println("");
        }
        
        for( int row = 1; row <= 10; row++ )
        {
            for( int column = 10; column > 10-row; column-- )
            {
                System.out.print(column+" ");
            }
            System.out.println("");
        }
        
       

    }
    
}
