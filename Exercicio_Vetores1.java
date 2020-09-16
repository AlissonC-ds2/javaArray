
public class Exercicio_Vetores1 {
	//1. Escreva um algoritmo que leia vetorA com 7 elementos.Retorne qual é
	//o maior  e o menor valor e sua respectiva posição
	
	public static void main(String[] args) {
		int[] vetorA = {6, 1, 5, 8, 9, 12, 10};
		int maior = vetorA[0], menor = vetorA[0]; //declarar a primeira posição para futura comparação
		int pos = 0, posD = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > maior) {
				maior = vetorA[i];
				pos = i;
			} else if (vetorA[i] < menor) {
				menor = vetorA[i];
				posD = i;
			}
		}
		
		System.out.println("Maior valor: " + maior + " posição " + pos); 
		System.out.println("Menor valor: " + menor + " posição " + posD);
	}
		
}
