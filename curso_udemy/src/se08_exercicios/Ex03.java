package se08_exercicios;
/*
 * Aluno
 */
public class Ex03 {

	public String nome;
	public double prova1, prova2, prova3;
	
	
	public double provaFinal() {
		return prova1 + prova2 + prova3;
	}
	
    public double pontosQueFaltam() {
		if(provaFinal() < 60.0) {
			return 60.0 - provaFinal();
			
		}else {
			return 0.0;
		}
	}
}
