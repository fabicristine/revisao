package ucdb.br.util;

public class Calculadora {

	public int somar(int num1, int num2) {
		return num1 + num2;
	}

	public int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public int dividir(int num1, int num2) {
		return num1/num2;
	}

	public int calcular(int num1, int num2, int operacao) {
		
		if(operacao==1){
			return somar(num1,num2);
		}else if(operacao==2){
			return subtrair(num1,num2);
		}else if(operacao==3){
			return multiplicar(num1,num2);
		}else{
			return dividir(num1,num2);
		}
	}

}
