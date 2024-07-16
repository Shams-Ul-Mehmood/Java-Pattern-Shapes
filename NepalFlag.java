
 
package nepal.flag;

public class NepalFlag 
{

    public static void main(String[] args) 
    {
        System.out.println("\t\tNepal National Flag");
        for( int a = 10; a >= 0; a-- )
        {
            int b = a;
            while( b <= 10 )
            {
                System.out.print(".");
                b++;
            }
            System.out.println("");
        }
        int c = 10;
        while( c >= 0 )
        {
            int d = c;
            do
            {
                System.out.print(".");
                d++;
            }
            while( d <= 13 );
            System.out.println("");
            c--;
        }
    }
    
}
