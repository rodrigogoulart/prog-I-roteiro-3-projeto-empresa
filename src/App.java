/*
3. Complemente a solução 2, para que seja possível comparar 
programadores em relação ao tempo de experiência em uma 
determinada linguagem. Isso deve ser modelado e implementado 
em uma nova classe.*/
public class App {
	
	public static void main(String[] args) {
		Programador adri = new Programador("dev001","Adriana Reis", 1979);
		Linguagem p = new Linguagem ("C", 23);
		adri.setLp1(p);
		Linguagem s = new Linguagem ("Java", 16);
		adri.setLp2(s);
		Linguagem t = new Linguagem ("Pearl", 20);	
		adri.setLp3(t);
		
		Programador amanda = new Programador("dev002","Amanda Reis", 2010);
		Linguagem pp = new Linguagem ("C", 1);
		amanda.setLp1(pp);

		Compara.comparaTempoExperiencia(adri, amanda, "C");
		Compara.comparaTempoExperiencia(adri, amanda, "Java");
	}

}
