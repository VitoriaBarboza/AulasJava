
public class exAliquota {
	public static void main(String[] args) {

		        double salario = 3300.0;
		       
		        if(salario >= 1900 && salario <=2800) {
		        	System.out.println("Pode deduzir na declaração o valor de R$142");
		    } if(salario >=2800.01 && salario <= 3751.0) {
		    	System.out.println("Pode deduzir na declaração o valor de R$ 350" );
		}else if(salario >= 3751.01 && salario <= 4664.00) {
	    	System.out.println("Pode deduzir na declaração o valor de R$ 636" );

		}
	}
}
