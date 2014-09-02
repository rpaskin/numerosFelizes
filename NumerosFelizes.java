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

	public int somaDosAlg(int [] numDividido){
		int soma = 0;
		for (int i = 0; i < numDividido.length ; i++){
			soma = soma + numDividido[i] * numDividido[i]; 
		}
		return soma;
	}

	public boolean eFeliz(int numInserido){
		int numDividido = DividirNum(numInserido);
		int soma = 0;
		int i = 0;

	List<Integer> ant = new ArrayList<Integer>();
		public void add(int num)
 			{
  				this.ant.add(num);
  			}
		
		while(soma != 1 ){
			soma = somaDosAlg(numDividido);
			ant.add(soma);
			numDividido = DividirNum(soma);
			i++;
			for(j = 0; j < ant.length(); j++){
				if (soma = ant[j]){
					return 0;
				}

			}
		}
		System.out.println(soma);
		return true;
	}
}