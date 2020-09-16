
public class Exercicio_Vetores3 {

	public static void main(String[] args) {
		int [] vetorA = {7,6,8,20,16,5,1,3,12,11};
		int menor;
		
		//como o lenght é 10 (0-9), usei o lenght-1 para pegar o ultimo index também
		for(int i = 0; i < vetorA.length-1; i++) {
			//mais um for para verificar o proximo número na lista, e troca-lo de posição
			for(int j = 0; j < vetorA.length-1; j++) {
				// if 7 > 6
				if(vetorA[j] > vetorA[j + 1]) {
					//se o proximo item da lista for menor, coloca ele em uma variavel
					menor = vetorA[j+1];
					//coloca o "9" no lugar do "4"(na primeira iteração)
					vetorA[j + 1] = vetorA[j];
					//armazena o menor numero no "primeiro" index
					vetorA[j] = menor;
				}
			}
		}
		
		for(int k = 0; k < vetorA.length; k++) {
			System.out.println(vetorA[k]);
		}
	}
		
}


