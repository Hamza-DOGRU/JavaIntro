package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.18;
		double dolarBugun=8.18;
		int vade=36;
		boolean dustumu=true;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("A�a�� ok");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Yukar� ok");
		}else {
			System.out.println("E�ittir");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="�ift�i Kredisi";
		
		String[] krediler= {kredi1,kredi2,kredi3,kredi4};
		for (String kredi : krediler) {
			System.out.println(kredi);
			
		}
		for (int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		}
}
