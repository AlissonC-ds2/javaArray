
public class Exercicio_Vetores6 {

	public static void main(String[] args) {
		int [] vetorA = {3,5,6,7,6,7,11,22,15,7,1,2,1,2,8};
		int [] vetorB = new int[15];
		int tamanho = vetorB.length; // cria uma variavel tamanho para ir diminuindo(deletando) os elementos
									 // repetidos que vão ficando na esquerda do vetor
		
		for (int i = 0; i < tamanho; i++) {
			vetorB[i] = vetorA[i];
		}
		
		for(int j = 0; j < tamanho; j++) {
			//procura por numeros iguais
			// g = j + 1 (g será sempre o proximo index depois do j)
			for(int g = j + 1; g < tamanho;) {
				if(vetorB[j] == vetorB[g]) {
					for(int k = j; k < tamanho-1;k++) {
						vetorB[k] = vetorB[k+1]; //leva os numeros não repetidos para a esquerda
					}
					tamanho -= 1; //diminui o tamanho do vetor e também apaga o numero repetido
				} else {
					g++; //caso não tiver tiver repetição incrementar até achar um numero repetido no vetor
				}
			}
		}
		
		for(int i = 0; i < tamanho; i++) {
			System.out.print(" " +vetorB[i]);
		}
	}	
	
}
