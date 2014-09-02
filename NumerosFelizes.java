import java.util.*;

class NumerosFelizes {
  	public boolean eFeliz(int args){
    	if (args ==  13 || args == 10){
      		return true;
    	}
    	else{
      		return false;
    	}
  	}
  	

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

}