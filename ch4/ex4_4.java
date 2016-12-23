class ex4_4{
	public static void main(String[] args){
		final int MAX = 100;
		int sum = 0;
		int i = 1;
		
		
		while(sum<MAX){
			sum+=i;
			System.out.printf("i: %-5d ", i);
			
			if(i>0)
				++i;
			else
				--i;
			
			i = -i;
			System.out.println("\t sum :   " +sum);
		}
		
	}
}