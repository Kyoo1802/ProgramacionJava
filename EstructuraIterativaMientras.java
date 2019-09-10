class EstructuraIterativaMientras {
	public static void main(String args[]){
		int a = 23;
		int cont = 0;
		for(;a<=101;){
			a+=3;
			cont++;
		}
		System.out.println(cont);

		a=23;
		cont=0;
		while(a<=101){
			a+=3;
			cont++;
		}
		System.out.println(cont);
	}
}
