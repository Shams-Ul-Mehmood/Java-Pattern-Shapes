
package pelar.pattern.form;

public class PelarPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t~~~~~~~~~~~~~>>> Pelar Pattern Form <<<~~~~~~~~~~~~~~~~~~");
        
        // We get Pelar Pattern with the help of Pyramidical Pattern Form.
        
        for( int kk = 1; kk <= 10; kk++ )
         {
             for( int ll = 1; ll <= 10; ll++ )
             {
                 System.out.print(" ");
             }
             for( int mm = kk; mm <= kk; mm++ )
             {
                 System.out.print("# ");
             }
             System.out.println("");
         }
    }
    
}
