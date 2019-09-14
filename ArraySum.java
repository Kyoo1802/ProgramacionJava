class ArraySum { 
	public static void main(String[] args){
		int[] a = {3, 5, 9};
		int[] b = {9, 20, 1:};
		int[] c = sum2Vectors(a, b);

		print(c);
	}
	static int[] sum2Vectors(int[] a, int b[]){
		int[] c = new int[a.length]; // -> { 0, 0, 0}
		int d; // No va a valer 0
		if(a.length == b.length){
			for(int i = 0; i< a.length; i++){
				c[i] = a[i] + b[i];
			}
		}
		return c;
	}

	static void print(int[] array){
		for(int i = 0; i<array.length;i++){
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
}
