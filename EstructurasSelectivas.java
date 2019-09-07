class EstructurasSelectivas {
    public static void main(String[] args){
    	int edad = 19;
	
	boolean eresMenorDeEdad = edad < 18;
	boolean teGustaPizza = true;

	int cont = 0;
	if(eresMenorDeEdad || cont++ == 0){
		System.out.println("Eres menor de edad.");
	} else if (edad > 40 || cont == 1) {
		System.out.println("Eres un adulto mayor");
	} else if (edad > 30 && teGustaPizza) {
		System.out.println("Eres un adulto medio mayor");
	} else {
		System.out.println("Eres mayor de edad.");
	}
	System.out.println("Tu edad es: "+edad);
	
    }
}
