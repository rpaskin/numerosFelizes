import java.util.*;

class NumerosFelizes {
 	public int[] DividirNum(int args){
  		int i;
  		int numInserido = args;
		String[] numDividido = numInserido.split(""); 
  		int comprimentoNumInserido = String.valueOf(numInserido).length();
  		System.out.println(comprimentoNumInserido);
  		int numDividido[] = new int[comprimentoNumInserido];
		for(i = 0; i < comprimentoNumInserido; i++){
    		numDividido[i] = numInserido % 10;
    		System.out.print(numDividido[i] + " ");
    		numInserido = numInserido / 10;
		}
		return numDividido;
	}
}