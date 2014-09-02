import java.util.*;

class NumerosFelizes {
  	public boolean eFeliz(int args, int safe){
		if (safe > 1000){
  			return false;
  		}
  		int[] resultadosPrevios = new int [100];
		
		int soma = somaTudo(aoQuadrado(separaNumero(args)));

		if(soma == 1){
			return true;	
		}
		for(int i = 0; i < resultadosPrevios.length; i++){
			
			resultadosPrevios[i] = soma;
			soma = somaTudo(aoQuadrado(separaNumero(soma)));
			if(soma == resultadosPrevios[i]){
				
				return false;
			}
		}
		safe++;
		return eFeliz(soma,safe);
	}
	// if (safe > 1000){
  	// 		return false;
  	// 	}

  	// 	int soma = somaTudo(aoQuadrado(separaNumero(args)));
  	// 	if (soma == 1){
  	// 		return true;
  	// 	}
  	// 	safe++;
  	// 	return eFeliz(soma, safe);
  	// }*/
  	

  	public ArrayList<Integer> separaNumero(int args){
  		int[] test={args};
  		ArrayList<Integer> test2 = new ArrayList<Integer>();

  		
		for(int i = test.length -1; i >= 0; i--){
    		int temp = test[i];
    		while(temp>0){
        		test2.add(0, temp%10);  //place low order digit in array
        		temp = temp /10;        //remove low order digit from temp;
    		}
		}
		return test2;
  	}

  	public ArrayList<Integer> aoQuadrado(ArrayList<Integer> args){
  		
  		ArrayList<Integer> resultado = new ArrayList<Integer>();

  		//ronnie não deixou colar
  		for(int i = 0; i < args.size(); i++){
  			resultado.add(args.get(i)*args.get(i));
  		}
  		return resultado;

  	}

  	public int somaTudo(ArrayList<Integer> args){


  		ArrayList<Integer> resultado = new ArrayList<Integer>();
  		int somatorio = 0;
  		//ronnie não deixou colar
  		for(int i = 0; i < args.size(); i++){
  			somatorio = somatorio + args.get(i);
  		}
  		return somatorio;
  	}

}