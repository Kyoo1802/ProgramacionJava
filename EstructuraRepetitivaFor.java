class EstructuraRepetitivaFor {
	public static void main(String args[]){
		int abc =321;
		// Error de compilacion
		// int abc =332;
		System.out.println("Mi nombre es Rodrigo"+abc);

		// Syntax
		// for(inicializacion; condicion; incremento ){ }

		for(int i=1; i<=3; i++ ){
			// int abc = 312;
			System.out.println("Mi nombre es Pooky");
		}
		for(int i=1; i<=3; ++i){
			System.out.println("Mi nombre es Pooky2");
		}
		for(int i = 1; i<=3;i++){
			System.out.println(i);
		}
		int j=231;
		for(int i =1; i<=3; i++){
			System.out.println(i+"-"+j);
		}

		for(int i=1; i<= 3; i++){
			int z = 331;
			System.out.println(i+"-"+z);
		}
		// Error de compilacion
		// System.out.println(z);
	
		for(int i=1; i<=3;i++){
			j=331;
			System.out.println(i+"-"+j);
		}
		System.out.println(j);
		int z =23;
		for(int i=1; i<=3;i++){
			// Error de compilacion
			// int z =3;
			System.out.println(i);
		}
		// Error de compilacion
		// System.out.println(i);

		// No crear variable
		int k = 0;
		int suma=0;
		for(k =1; k<5; k+=2){
			suma+=k;
			System.out.println(k);
		}
		System.out.println(k);
		System.out.println(suma);

		// For de intervalo [10, 32]
		for(int i=10; i<=32; i++){}
		// For de intervalo abierto [2, 30)
		for(int i=2; i<30; i++){}

		// For con incrementos de 3
		for(int i = 3; i<30; i+=3){}

		// For inverso abierto [10, 0)
		for(int i = 10; i>0; i--) {}

		// For inverso cerrado [10, 0]
		for(int i = 10; i>=0; i--) {}
		
		// For inverso decrementos de 2
		for(int i = 10; i >= 0; i-=2) {}

		// For con multiples variables
		for(int i = 2, j=30; i+j < 100-j; i++, j--) {}

		
	}
}
