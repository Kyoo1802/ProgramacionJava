class Metodos {
	public static void main(String[] args){
		int a = 23;
		int b = 13;
		double areaTriangulo = calcularAreaTriangulo(a,b);
		imprimir(areaTriangulo);

		int c = 23;
		int d = 32;
		double area2 = calcularAreaTriangulo(c,d);
		imprimir(area2);

		char[][] m = {{'x','x','o'},{'o',' ',' '},{'o','o',' '}};
		imprimirMtx(m);
		System.out.println("----");
		imprimirMtx(m);
		imprimirMiNombre();
		imprimirMtx(m);
	}
	
	static void imprimirMiNombre(){
		System.out.println("Rodrigo");
	}

	static double calcularAreaTriangulo(int a, int b){
		double resultado = dividir( (double)(a*b) , (double)2 );
		return resultado;
	}

	static double dividir(double a, double b){
		return a/b;
	}
	
	static void imprimir(double area){
		System.out.println("El area es: "+ area);
	}
	
	static void imprimirMtx(char[][] m){
		for(int i=0; i<m.length;i++){
			for(int j = 0; j<m[i].length;j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
