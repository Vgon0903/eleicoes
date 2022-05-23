import java.util.Scanner;

public class exercicio_eleicao {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		System.out.printf("Vote: (13)PT   (12)PDT  (22)PL  (45)PSDB  (5)voto nulo  (6)voto em branco (7)Sair"); //exibe mensagem
		
		int qtdPt=0,qtdPdt=0,qtdPl=0,qtdPsdb=0,qtdnulo=0,qtdbranco=0; //cria variaveis para armazenar algum dado
		int escolha=0; //cria variavel para armazenar dado
		
		while(escolha != 7) //condicao de executar enquanto escolha for diferente de 7 
		{
			escolha = ler.nextInt(); //ler e armazenar informacao variavel escolha de acordo com seu voto
			switch(escolha) //condica para cada uma das escolhas feitas
			{
			case 13: //se escolher 13 ira imprimir seguinte mensagem 
				System.out.printf("Voce votou no PT, voto finalizado");
				qtdPt++; //conta quantidade de vezes que essa opcao foi escolhida
				break; //para laco de repeticao
			case 12: //se escolher 12 ira imprimir seguinte mensagem
				System.out.printf("Voce votou no PDT, voto finalizado");
				qtdPdt++; //conta quantidade de vezes que essa opcao foi escolhida
				break;	//para laco de repeticao
			case 22: //se escolher 22 ira imprimir seguinte mensagem
				System.out.printf("Voce votou no PL, voto finalizado");
				qtdPl++; //conta quantidade de vezes que essa opcao foi escolhida
				break; //para laco de repeticao
			case 45: //se escolher 45 ira imprimir seguinte mensagem
				System.out.printf("Voce votou no PSDB, voto finalizado");
				qtdPsdb++; //conta quantidade de vezes que essa opcao foi escolhida
				break;	//para laco de repeticao
			case 5: //se escolher 5 ira imprimir seguinte mensagem
				System.out.printf("Voce votou nulo, voto finalizado");
				qtdnulo++; //conta quantidade de vezes que essa opcao foi escolhida
				break; //para laco de repeticao
			case 6: //se escolher 6 ira imprimir seguinte mensagem
				System.out.printf("Voce votou em branco, voto finalizado");
				qtdbranco++; //conta quantidade de vezes que essa opcao foi escolhida
				break; //para laco de repeticao
			case 7: //se escolhher 7 ira imprimir seguinte mensagem
				System.out.printf("Voce saiu, voto finalizado");
				break; //para laco de repeticao
			default: //se escolhher nenhuma das opcoes ira imprimir seguinte mensagem
				System.out.printf("ERRO!! VOTO INVALIDO");
				break;	//para laco de repeticao	
			}	
		}
		System.out.printf("A quantidade de votos foi:"); //exibe mensagem
		System.out.printf("\n PT:%d",qtdPt); //exibe quantidade de votos PT
		System.out.printf("\n PDT:%d",qtdPdt); //exibe quantidade de votos PDT
		System.out.printf("\n PL:%d",qtdPl); //exibe quantidade de votos PL
		System.out.printf("\n PSDB:%d \n",qtdPsdb); //exibe quantidade de votos PSDB
		System.out.printf("\n Voto nulo:%d",qtdnulo); //exibe quantidade de votos nulos
		System.out.printf("\nVoto em branco:%d",qtdbranco); //exibe quantidade de votos em branco
	}

}
