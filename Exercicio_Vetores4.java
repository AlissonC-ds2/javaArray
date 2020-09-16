
public class Exercicio_Vetores4 {

	public static void main(String[] args) {
		int [] vetorA = {0,1,2,4,5,6,7,8,9};
		int [] vetorB = {9,8,7,6,5,4,3,2,1};
		int [] vetorC = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			for(int j = 0; j < vetorB.length; j++) {
				if(i == j) {
					int multi = vetorA[i] * vetorB[j];
					vetorC[j] = multi;
				}
			}
		}
		
		for(int g = 0; g < vetorC.length-1; g++) {
			System.out.println(vetorC[g]);
		}
	}
}
