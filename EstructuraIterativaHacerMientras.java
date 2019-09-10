class EstructuraIterativaHacerMientras {
	public static void main(String[] args){
		int x = 0;
		int factorial = 1;
		int cont = 0;	
		if(x == 0) {
			System.out.println(1);
		} else{
			for(;factorial <= x;){
				factorial *= ++cont;
			}
			System.out.println(cont);
		}
		
		x = 0;
		factorial =1;
		cont=0;
		while(factorial<=x){
			factorial *= ++cont;
		}
		System.out.println(cont);


		x=0;
		factorial =1;
		cont =0;
		do{
			factorial *= ++cont;
		}while(factorial <= x);
		System.out.println(cont);
		
	}
}
