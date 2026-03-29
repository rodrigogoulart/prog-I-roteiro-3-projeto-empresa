public class App {
	
	public static void main(String[] args) {
		Programador adri = new Programador("dev001","Adriana Reis", 1979);
		Linguagem preferencia1 = new Linguagem ("C", 23);
		adri.setLp1(preferencia1);
		Linguagem preferencia2 = new Linguagem ("Java", 16);
		adri.setLp2(preferencia2);
		Linguagem preferencia3 = new Linguagem ("Pearl", 20);	
		adri.setLp3(preferencia3);
		
		Programador amanda = new Programador("dev002","Amanda Reis", 2010);
		Linguagem pp = new Linguagem ("C", 1);
		amanda.setLp1(pp);

		Compara.comparaTempoExperiencia(adri, amanda, "C");
		Compara.comparaTempoExperiencia(adri, amanda, "Java");

		Programador ana = new Programador("dev003","Ana Reis", 2000);
		ana.setLp1(preferencia2);
		ana.setLp2(preferencia1);
		ana.setLp3(preferencia3);
	}

}
