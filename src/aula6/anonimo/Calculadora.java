package aula6.anonimo;

@FunctionalInterface
public interface Calculadora {

	default public double subtrair(double n1, double n2) {
		
		return n1 - n2;
	}
	
	public double somar(double n1, double n2);
}
