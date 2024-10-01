package progstructure;

import java.util.Scanner;

public class Nometurma 
{
	
	public static void main(String[] args) 
		{
		
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite a quantidade de alunos: ");
			int quant_Alunos = leitor.nextInt();
			leitor.nextLine();
			String nomes[] = new String[quant_Alunos];
		
			for (int i = 0; i < quant_Alunos; i++) 
			{
				System.out.print("Digite o nome do colega: ");
				nomes[i] = leitor.nextLine();
			}
			
			System.out.println("Nome dos alunos: ");
			for (int i = 0; i < quant_Alunos; i++) 
			{
				System.out.println(nomes[i]);
			}
		}
}