
package inverted.right.angle.pyramid;

public class InvertedRightAnglePyramid
{

    public static void main(String[] args)
    {
        System.out.println("\t Inverted Right Angle Pyramid ");
       for( int a = 0; a < 10; a++ )
       {
           int b = a;
           while( b < 10)
           {
               System.out.print("#");
               b++;
           }
           System.out.println("");
       }
        System.out.println("\t\t 2nd Method of Inverted Right Angle Pyramid ");
       int c = 10;
       while( c >= 0 )
       {
           int d = c;
           do
           {
               System.out.print("$");
               d--;
           }
           while( d >= 0 );
           System.out.println("");
           c--;
       }
    }
    
}
