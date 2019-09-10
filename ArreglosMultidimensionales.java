class ArreglosMultidimensionales { 
	public static void main(String[] args){
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);


		for(int i=0; i<10; i++){
			System.out.println(i+"=0");
			System.out.println(i+"=1");
			System.out.println(i+"=2"); 
		}

		for(int i=0; i<7; i++){
			for(int  j=0; j<4;j++){
				System.out.println(i+"="+j);
			}
		}


		int[][] pagos = new int[3][3];
		pagos[0][0] = 3;
		pagos[0][1] = 13;
		pagos[0][2] = 12;
		
		pagos[1][0] = 1;
		pagos[1][1] = 2;
		pagos[1][2] = 3;

		pagos[2][0] = 3;
		pagos[2][1] = 2;
		pagos[2][2] = 1;
		for(int i=0; i<pagos.length;i++){
			for(int j = 0; j<pagos[i].length; j++){
				System.out.print(pagos[i][j]+"-");
			}
			System.out.println();
		}
		/*
			3-13-12-
			1-2-3-
			3-2-1-
			
		*/

		char[][] letraG = 
			{{'x', 'o', 'x'},
			 {'o', ' ', 'x'},
			 {'x', 'o', 'x'}};
		for(int i=0; i<letraG.length; i++){
			for(int j=0; j<letraG[i].length; j++){
				System.out.print(letraG[i][j]);
			}
			System.out.println();
		}
		

		for(int i=0; i<letraG.length; i++){
			for(int j = 0; j<letraG[i].length;j++){
				if(letraG[i][j] == ' '){
					letraG[i][j] = 'R';
				}
			}
		}
	
		for(int i =0; i<letraG.length; i++){
			for(int j = 0; j<letraG[i].length; j++){
				System.out.print(letraG[i][j]);
			}
			System.out.println();
		}
	}
}
