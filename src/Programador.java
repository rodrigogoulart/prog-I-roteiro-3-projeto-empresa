
public class Programador extends Funcionario{
	//private String linguagemPreferida; //torna-se um objeto
	private Linguagem lp1;
	private Linguagem lp2;
	private Linguagem lp3;
	
	public Programador(String matricula, String nome, int dataNascimento) {
		super(matricula, nome, dataNascimento);
	}

	public Linguagem getLp1() {
		return lp1;
	}

	public void setLp1(Linguagem lp1) {
		this.lp1 = lp1;
	}

	public Linguagem getLp2() {
		return lp2;
	}

	public void setLp2(Linguagem lp2) {
		this.lp2 = lp2;
	}

	public Linguagem getLp3() {
		return lp3;
	}

	public void setLp3(Linguagem lp3) {
		this.lp3 = lp3;
	}

	public void exibeRanking() {
		if (lp1 != null)
			System.out.println("1o " + lp1.getNome());
		if (lp2 != null)
			System.out.println("2o " + lp2.getNome());
		if (lp3 != null)
			System.out.println("3o " + lp3.getNome());
	}
	
}
