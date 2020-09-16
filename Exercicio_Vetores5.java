
public class Exercicio_Vetores5 {

	public static void main(String[] args) {
		int [] vetorA = {7, 12, 15, 20, 8, 6, 2, 17, 16, 9,};
		int [] vetorB = {3, 5, 4, 1, 10, 13, 19, 11, 18, 14};
		int [] vetorC = new int[20];
		int menorNumero;
		
		System.out.print("\nVetorA:");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
			vetorC[i] = vetorA[i];
		}
		System.out.print("\nVetorB:");
		for(int j = 0; j < vetorB.length; j++) {
			System.out.print(" " + vetorB[j]);
			vetorC[j + 10] = vetorB[j];
		}
		
		System.out.print("\nVetorC:");
		for(int k = 0; k < vetorC.length-1; k++) {
			for(int i = 0; i < vetorC.length-1;i++) {
				if(vetorC[i] > vetorC[i+1]) {
					menorNumero = vetorC[i + 1];
					vetorC[i+1] = vetorC[i];
					vetorC[i] = menorNumero;
				}
			}
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(" " + vetorC[i]);
		}
	}

}
