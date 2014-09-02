import java.util.*;

class NumerosFelizes {
 	public int[] DividirNum(int args){
 	  	int numInserido = args;
  		int comprimentoNumInserido = String.valueOf(numInserido).length();
  		int numDividido[] = new int[comprimentoNumInserido];
		for(int i = comprimentoNumInserido - 1; i >= 0; i--){
    		numDividido[i] = numInserido % 10;
    		numInserido = numInserido / 10;
		}
		return numDividido;
	}


	public boolean eFeliz(int numInserido){
		int[] numDividido = DividirNum(numInserido);
			int soma = 0;
		while(soma != 1 && soma != numInserido){
			soma = 0;
			for (int i = 0; i < numDividido.length ; i++){
				soma = soma + numDividido[i] * numDividido[i]; 
			}
			numDividido = DividirNum(soma);

		}
		System.out.println(soma);
		return true;
	}
}