import java.util.Scanner;
public class inserirSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite sua senha");
		
		int senha = sc.nextInt();
		int contador = 0;
		
		while(senha != 1214) {
			System.out.println("senha inválida!\ndigite novamente:");
			senha = sc.nextInt();
			
			if(contador >3) {
				contador = contador ++;
				System.out.println("senha bloqueada!\nvoce digitou acima de 3 vezes");
				
				
			}
		}
		System.out.println("acesso permitido");
		
		sc.close();

	}

}
