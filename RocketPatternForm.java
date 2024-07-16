
package rocket.pattern.form;

public class RocketPatternForm 
{

    public static void main(String[] args) 
    {
        System.out.println("\t---------->>> Rocket Pattern Form <<<--------------");
        
        // We get Rocket Pattern with help of Pyramidical Pattern Form. 
        
        for( int d = 1; d <= 10; d++ )
        {
            for( int e = 4; e >= 1; e-- )
            {
                if( e > d )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" .");
                }
            }
             System.out.println("");               
        }
      
        
        
    }
    
}
