
public class ImprimirSoma_De_1_Ate_1000 {
	public static void main(String [] args){
			int valor2 = 0;
			int soma;
			
			for(int valor1 = 1; valor1 <= 1000; valor1++){
				valor2 = valor2 + valor1;
				soma = valor1 + valor2;
				
				System.out.println("Numero: " + soma);
				
			}
	}

}
