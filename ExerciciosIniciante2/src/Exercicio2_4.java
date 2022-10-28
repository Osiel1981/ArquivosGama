import java.util.Scanner;

public class Exercicio2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entre com horário inicial do Jogo");
		int horaInicial = sc.nextInt();
		System.out.printf("Entre com horário final do Jogo");
		int horaFinal = sc.nextInt();
		int duracaoJogo;
		if (horaInicial >= horaFinal){
			duracaoJogo = horaInicial - (horaFinal+24);
		}
		else {
			duracaoJogo = horaInicial - horaFinal;
		}
		System.out.printf("O JOGO DUROU "+ Math.abs(duracaoJogo) +" HORAS");
	}

}
