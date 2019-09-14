import java.util.Scanner;
class Median {
	public static void main(String[]  args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Cual es el tamano?");
		int size = in.nextInt();
		
		int[] array = new int[size];
		for(int i =0; i<size; i++){
			System.out.println("Escribe el elemento "+ (i+1));
			array[i] = in.nextInt();
		}

		if(size == 0){
			System.out.println("No existe");
		} else if (size%2 == 1){
			int medianIdx = size/2;
			System.out.println(array[medianIdx]);
		} else {
			int medianIdx1 = size/2;
			int medianIdx2 = size/2-1;
			double median = (array[medianIdx1] + array[medianIdx2])/2d;
			System.out.println(median);
		}

	}
}
