import java.util.Scanner;

/*
 * Scrivere un app che legga una sequenza di stringhe e visualizzi:
 * la stringa lessicograficamente minima
 * la stringa lessicograficamente massima
 * la stringa più corta
 * la stringa più lunga
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String alphaMin = null;
		String alphaMax = null;
		String lengthMin = null;
		String lengthMax = null;
		System.out.print("Inserire una stringa ");
		String s = input.nextLine();
		while(!s.equals("")) {
			if(alphaMin == null || s.compareTo(alphaMin) < 0) {
				alphaMin = s;
			}
			if(alphaMax == null || s.compareTo(alphaMax) > 0) {
				alphaMax = s;
			}
			if(lengthMin == null || s.length() < lengthMin.length()) {
				lengthMin = s;
			}
			if(lengthMax == null || s.length() > lengthMax.length()) {
				lengthMax = s;
			}
			System.out.print("Inserire una stringa ");
			s = input.nextLine();
		}
		if(alphaMin == null) {
			System.out.println("Non sono state inserite stringhe");
		} else {
			System.out.println("la stringa lessicograficamente minima è " + alphaMin);
			System.out.println("la stringa lessicograficamente più grande è " + alphaMax);
			System.out.println("la stringa più corta è " + lengthMin);
			System.out.println("la stringa più lunga è " + lengthMax);
		}
	}
}
