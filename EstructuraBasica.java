/**
  Esta clase explica la estructura de un programa
  de Java.
*/
public class EstructuraBasica {

  public static void main(String args[]){
        int a =  2;
        int b = 23;
        int suma = sumar(2, 23);


        // Se aplica la formula de estadistica para distribuciones.
        int sum2 = suma*3/a*b^23;

        /*
           Imprime el resultado
           despues de sumar 2 numeros
            final
        */
	System.out.println("El resultao es:" + suma);
  }

  /** Realiza la suma de 2 numeros */
  public static int sumar2(int a, int b){
	int sum = a + b;
        return sum;
  }
}
