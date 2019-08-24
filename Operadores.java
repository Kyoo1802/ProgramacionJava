class Operadores {
	public static void main(String args[]){
		// Operadores aritmeticos
		int a = 2;
		int b = 3;
		int c = 231;
		
		int resultado = a+b-a*c/2%100;
		System.out.println(resultado);

		// Operadores unitarios
		a=20;
		b=3;
		int xd = a++-b;
		System.out.println(xd); // 17
		System.out.println(a); // 21

                b = a+++c;
		int d = b---c;
		int e = --b/2;

		// Operadores de asignacion
		a += 2;
		a += 3;
		b /= 5;
		b *= a+3; // => b = b * (a + 3)
		c *= c + a;

		// Operadores relacionales
		a = 3;
		b = 33;
		boolean isEqual =  a == b; // False
		boolean isDifferent = a != b; // True
		boolean isGreater = a > b; // False
		boolean isLower = a < b; //  True
		boolean isGreaterOrEqual = a >= b;  // False
		boolean isLowerOrEqual = a <= b;  // True


		// Operadores logicos
		boolean hayPizza = true;
		boolean hayHamburguesas = true;
		boolean respuesta = hayPizza || hayHamburguesas;  // true
		boolean respuesta2 = hayPizza && hayHamburguesas; // false
		boolean respuesta3 = hayPizza ^ hayHamburguesas; // false
	        boolean respuesta4 = !hayHamburguesas; // true

		a = 1;
		b = 2;
                c = 3;
		hayPizza = false;
		boolean respuesta5 = true;

		// Operador bit
		int binario_1 = 4; // ->                        0 0 0 0 0 1 0 0
		int binario_2 = 7; // ->                        0 0 0 0 0 1 1 1
                int binario_and = binario_1 & binario_2; // ->  0 0 0 0 0 1 0 0
		int binario_or = binario_1 | binario_2; //  ->  0 0 0 0 0 1 1 1
		int binario_xor = binario_1 ^ binario_2; // ->  0 0 0 0 0 0 1 1
		int binario_left = binario_1 << 2;     //   ->  0 0 0 1 0 0 0 0
    		int binario_right = binario_1 >> 2;    //   ->  0 0 0 0 0 0 0 1
		int binario_right_2 = binario_1 >>> 2; //   ->  1 1 0 0 0 0 0 1
		

		boolean examen = false;



		int x = 23;
		int y = 12;

		if(x<0){
			x *=-1;
		}

		if(x>=100 || y>=100){
			int area = x*y/2;
			System.out.println(area);
			if(y == 230){
				System.out.println("otro");
			}
		} else {
			int area = x*y;
			System.out.println(area);
		}	


		if(x>23){
			System.out.println("Hola");
		}else if ( x ==29){
			System.out.println("Adios");
		}else if ( x ==30 ){
			System.out.println("ABC");
		}else {
			System.out.println("Default");
		}

		System.out.println("Fin!");
        }
}
