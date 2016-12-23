class ex4_3{
	public static void main(String[] args){
		int sum = 0;
		int sum2 = 0;
		for(int i=0; i<=10; i++){
			sum += i;
			sum2 += sum;
			
			System.out.println("i : " +i+ " , sum : " +sum+ " , sum2 : " +sum2);
		}
	}
}