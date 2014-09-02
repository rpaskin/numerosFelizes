import java.util.*;

class NumerosFelizes {
 	public int[] DividirNum(int args){
  		int i;
  		int numInserido = args;
  		int comprimentoNumInserido = String.valueOf(numInserido).length();
  		int numDividido[] = new int[comprimentoNumInserido];
		for(i = comprimentoNumInserido - 1; i >= 0; i--){
    		numDividido[i] = numInserido % 10;
    		numInserido = numInserido / 10;
		}
		return numDividido;
	}
}