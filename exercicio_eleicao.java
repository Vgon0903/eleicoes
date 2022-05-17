import java.util.Scanner;

public class exercicio_eleicao {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		System.out.printf("Vote: (13)PT   (12)PDT  (22)PL  (45)PSDB  (5)voto nulo  (6)voto em branco (7)Sair");
		
		int qtdPt=0,qtdPdt=0,qtdPl=0,qtdPsdb=0,qtdnulo=0,qtdbranco=0;
		int escolha=0;
		
		while(escolha != 7) {
			escolha = ler.nextInt();
			switch(escolha)
			{
			case 13: 
				System.out.printf("Voce votou no PT, voto finalizado");
				qtdPt++;
				break;
			case 12: 
				System.out.printf("Voce votou no PDT, voto finalizado");
				qtdPdt++;
				break;	
			case 22: 
				System.out.printf("Voce votou no PL, voto finalizado");
				qtdPl++;
				break;
			case 45: 
				System.out.printf("Voce votou no PSDB, voto finalizado");
				qtdPsdb++;
				break;	
			case 5: 
				System.out.printf("Voce votou nulo, voto finalizado");
				qtdnulo++;
				break;
			case 6: 
				System.out.printf("Voce votou em branco, voto finalizado");
				qtdbranco++;
				break;
			case 7:
				System.out.printf("Voce saiu, voto finalizado");
				break;
			default:
				System.out.printf("ERRO!! VOTO INVALIDO");
				break;		
			}	
		}
		System.out.printf("A quantidade de votos foi:");
		System.out.printf("\n PT:%d",qtdPt);
		System.out.printf("\n PDT:%d",qtdPdt);
		System.out.printf("\n PL:%d",qtdPl);
		System.out.printf("\n PSDB:%d \n",qtdPsdb);
		System.out.printf("\n Voto nulo:%d",qtdnulo);
		System.out.printf("\nVoto em branco:%d",qtdbranco);
	}

}
