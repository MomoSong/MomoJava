class ex4_6{
	public static void main(String[] args){
		
		int flag = 0;
		for(int i=1; i<=6; i++){
			for(int j=1; j<=6; j++){
				if(6==i+j){
					System.out.printf("[%d,%d]", i, j);
					flag++;
				}
				else
					System.out.printf("%5c", ' ');
			}
			System.out.println();
		}
		
		System.out.println("총 " +flag+ "가지 경우의 수 ");
	}
}