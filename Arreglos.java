class Arreglos {
	public static void main(String[] args){
		String rodrigoNombre = "Rodrigo";
		System.out.println(rodrigoNombre +" = "+ rodrigoNombre.length());


		int[] enteros = {23,3,4,1,2,3};
		String[] nombres = {"gaby", "irma", "bernardo"};
	
		int[] enteros2 = new int[]{23,1,2,31};
		String[] nombres2 = new String[]{"gaby", "irma", "bernardo"};

		String[] nombreFamilia = new String[5];
		//nombreFamilia = "Texto";
		nombreFamilia[0] = "Rodrigo";
		nombreFamilia[1] = "Rosa";
		nombreFamilia[2] = "Emily";
		nombreFamilia[3] = "Matias";
		nombreFamilia[4] = "Morita";
	
		for(int i = 0; i<nombreFamilia.length; i++){
			System.out.println(nombreFamilia[i]+" = "+ nombreFamilia[i].length());
		}
		
		for(int i = 0; i<nombreFamilia.length; i++){
			nombreFamilia[i] = nombreFamilia[i]+".";
			System.out.println("Nuevo nombre: "+nombreFamilia[i]);
		}

		int[] edades = {30, 28,5,0,4,32,1,2,3,4223,12,3,31,23};
		double suma = 0;
		for(int i=0; i<edades.length; i++){
			suma += edades[i];
		}
		double promedio = suma/edades.length;
		System.out.println(promedio);
		
		
	}
}
