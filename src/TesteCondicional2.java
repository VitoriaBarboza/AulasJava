
public class TesteCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 1;
		
//ou "||" umas das condicoes precisa ser verdadeira pra passar
//e &&" as duas precisam ser verdadeiras
//boolean true ou false
		
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");

		} else {
			
			System.out.println("Infelizmente voce não pode entrar");
			
			}
		}
	}


