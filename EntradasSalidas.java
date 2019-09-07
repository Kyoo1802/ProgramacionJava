import java.util.Scanner;
class EntradasSalidas {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Escribe una linea:");
		String txt = in.nextLine();
		System.out.println("Ingresa un entero:");
		int intA = in.nextInt();
		System.out.println("Ingresa un entero largo:");
		long longB = in.nextLong();
		double doubleC = in.nextDouble();
		boolean booleanD = in.nextBoolean();
		String word = in.next();
		String finalTxt = in.nextLine();

		System.out.println("Mi texto es: "+txt);
		System.out.println("Mi numero Entero es:" +intA);
		System.out.println(longB);
		System.out.println(doubleC);
		System.out.println(booleanD);
		System.out.println(word);
		System.out.println(finalTxt);
	}
}
