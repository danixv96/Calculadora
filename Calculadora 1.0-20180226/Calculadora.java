
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private static Scanner;

    /**
     * Constructor for objects of class Calculadora
     */
    public static int suma(int op1,intop2)
    {
        // initialise instance variables
        return op1+op2;
        
    }
    
    public static int multiplicacion(int op1,into op2)
    {
        // put your code here
        return op1*op2;
        
    }
    
    public void op2(int n2)
    {
        // put your code here
        this.op2=n2;
    }
public static void main(string[] args)
{
    int op1=0;
    int op2=0;
    int rdo=0;
    char opc=S;
    
    reader = new Scanner (System.in);
    
    op1 = lee("primer numero: ");
    op2 = lee("segundo numero: ");
    
        switch(opc){
            case S:
                rdo=suma(op1op2);
                break;
            case 2:
                rdo=op1-op2;
                break;
            case 3:
                rdo=op1*op2;
                break;
            case 4:
                rdo=op1/op2;
                break;
            case 5:
            if (op2 > 1){
            for( int c=1 ;  c < op2 ;  c ++){
                if( c == 1){
                    rdo=op1*op1;
                  
                }
                else 
                    rdo=rdo*op1;
            }
        }
            else 
                    rdo=op1;
   }
}

    public void ponOperacion(String opera){
        switch(opera){
        
        case "S":
            op=op.suma;
            break;
        case "2":
            op=op.RESTA;
            break;
        case "3":
            op=op.MULTIPLICA;
            break;
        case "4":
            op=op.DIVIDE;
            break;
        case "5":
            op=op.POTENCIA;
            break;
        }
    }
    
    public int dameResultado()
    {
        // put your code here
        return rdo;
    }
    
}
