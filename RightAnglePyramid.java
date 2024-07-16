
package right.angle.pyramid;

public class RightAnglePyramid 
{

    public static void main(String[] args)
    {
        System.out.println("\t Right Angle Pyramid ");
        for( int a = 0; a < 10; a++ )
        {
            int b = a;
            while( b > 0)
            {
                System.out.print("*");
                b--;
            }
            System.out.println("");
        }
        System.out.println("\t\t 2nd Methd of Right Angle Pyramid ");
      
        int c = 9;
        while( c > 0 )
        {
            int d = c;
            do
            {
                System.out.print("+");
                d++;
            }
            while( d < 10 );
            System.out.println("");
            c--;
        } 
        
    }
    
}
