
public class Compara {
	static void comparaTempoExperiencia(Programador dev1, Programador dev2, String lp) {
		int tDev1 = 0;
		int tDev2 = 0;
		if (dev1.getLp1() != null && dev1.getLp1().getNome().equalsIgnoreCase(lp)) {
			tDev1 =  dev1.getLp1().getTempoExperiencia();
		}
		if (dev1.getLp2() != null && dev1.getLp2().getNome().equalsIgnoreCase(lp)) {
			tDev1 =  dev1.getLp2().getTempoExperiencia();
		}
		if (dev1.getLp3() != null && dev1.getLp3().getNome().equalsIgnoreCase(lp)) {
			tDev1 =  dev1.getLp3().getTempoExperiencia();
		}
		
		if (dev2.getLp1() != null && dev2.getLp1().getNome().equalsIgnoreCase(lp)) {
			tDev2 =  dev2.getLp1().getTempoExperiencia();
		}
		if (dev2.getLp2() != null && dev2.getLp2().getNome().equalsIgnoreCase(lp)) {
			tDev2 =  dev2.getLp2().getTempoExperiencia();
		}
		if (dev2.getLp3() != null && dev2.getLp3().getNome().equalsIgnoreCase(lp)) {
			tDev2 =  dev2.getLp3().getTempoExperiencia();
		}
		
		if (tDev1 == tDev2) {
			System.out.println("Ambos têm o mesmo tempo de experiência em " + lp + " : " + tDev1);
		}else {
			if (tDev1 > tDev2) {
				System.out.println(dev1.getNome() + " tem maior tempo de experiência em " + lp + " : " + tDev1);
			}else System.out.println(dev2.getNome() + " tem maior tempo de experiência em " + lp + " : " + tDev2);	
		}
		
	}
}
