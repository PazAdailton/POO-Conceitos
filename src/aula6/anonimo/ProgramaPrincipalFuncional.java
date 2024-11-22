package aula6.anonimo;



public class ProgramaPrincipalFuncional {

	public static void main(String[] args) {
		
		Calculadora calc1 = new CalculadoraCientifica();
		double s1 = calc1.somar(10, 20);

		System.out.println(s1);
		
		
		//Instancia anonima
		
		Calculadora calc2 = new Calculadora() {
			
			@Override
			public double somar(double n1, double n2) {
				
				
				return n1 + n2;
			}
		};
		
		double s2 = calc2.somar(50, 40);
		System.out.println(s2);
	
		
		//Instancia por meio Lambda
		Calculadora calc3 = (n1, n2)->{return n1+n2;};
		
		double s3 = calc3.somar(5, 5);
		
		System.out.println(s3);
		
		
		
	}
}
