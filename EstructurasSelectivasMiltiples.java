class EstructurasSelectivasMultiples { 
	public static void main(String args[]){
		int edad = 17;

		if(edad == 18){
			System.out.println("Felicidades eres mayor de edad!");
		} else if(edad == 15){
			System.out.println("Felicidades cumples 15!");
		} else {
			System.out.println("Felicidades");
			break;
			System.out.println("H");
			System.out.println("O");
		}

		switch(edad){
			case 30:
			case 18:
				System.out.println("abcdefo");
				break;
			case 15:
				System.out.println("15!");
				break;
			case 23:
			default:
				System.out.println("Error");
		}
		String texto = "A";
		switch(texto){
			case "B":
				System.out.println("Es b");
				break;
			case "A":
				System.out.println("Es A");
				break;
			default:
		}
		System.out.println("Hola");
	}
}
