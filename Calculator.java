import java.util.scanner;
class Calculator
{
       public static void main(String [] args) { 
               int a, b, ch, cal;
               System.out.print("Enter two nos. ") ;
               Scanner r = new Scanner (System.in) ;
              a=r.nextInt() ;
              b=r.nextInt() ;
              System.out.print("select operation ") ;   
              ch=r.nextInt() ;
              if( ch==1) 
              {
                 cal=a+b;
                 System.out.print("Addition"+cal);
               }
              
             else if( ch==2) 
              {
                 cal=a-b;
                 System.out.print("Subtraction"+cal);
              }  
            else if( ch==3) 
              {
                 cal=a*b;
                 System.out.print("Multiplication"+cal);
              }
            else if( ch==4) 
              {
                 cal=a/b;
                 System.out.print("Division"+cal);
              }
            else() 
              {
                 cal=a%b;
                 System.out.print("Remainder"+cal);
              }
     }
}

