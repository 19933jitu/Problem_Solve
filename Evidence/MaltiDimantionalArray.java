class MaltiDimantionalArray{
	public static void main(String [] args){
		
		int [][] array = new int [3][5];
		
			array [0][0]=12;
			array [0][1]=1;
			array [0][2]=4;
			array [0][3]=6;
			array [0][4]=7;
			
			array [1][0]=2;
			array [1][1]=4;
			array [1][2]=57;
			array [1][3]=8;
			array [1][4]=6;
			
			array [2][0]=8;
			array [2][1]=2;
			array [2][2]=45;
			array [2][3]=3;
			array [2][4]=6;
			
			for(int row=0 ;row<3; row++){
				for(int col=0 ;col<5; col++){
					
					System.out.print("\t"+array [row][col]);
					
				}
				
				System.out.println("\n");
			}
		
	}
	
	
}