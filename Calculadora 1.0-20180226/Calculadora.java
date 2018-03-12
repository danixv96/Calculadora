
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;
    private double num2;
    private double rdo;
    private Operacion op;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
    num1=0;
    num2=0;
    op=op.SUMA      
    }
    
    public void n1(double n1)
    {
        // put your code here
    this.num1=n1;
    }
    
    public void n2(double n2)
    {
        // put your code here
    this.num2=n2;
    }

    public void opera()
    {
    
        switch(opc){
            case SUMA:
                rdo=suma(op1op2);
                break;
            case RESTA:
                rdo=op1-op2;
                break;
            case MULTIPLICA:
                rdo=op1*op2;
                break;
            case DIVIDE:
                rdo=op1/op2;
                break;
            case POTENCIA:
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
 }

    public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
            break;
        }
    }
    
    public int dameResultado()
    {
        // put your code here
        return rdo;
    }

/*    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(num1)+" Num2=" + Integer.toString(num2));
        System.out.println("Suma :" + Integer.toString(num1+num2));
        System.out.println("Resta :"+ Integer.toString(num1-num2));
        System.out.println("Multiplica :" + Integer.toString(num1*num2));
        System.out.println("Divide :"+ Integer.toString(num1/num2));
} */
    
}
