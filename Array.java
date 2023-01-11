package Day3PracticeProblems;

class Array {
	static int [] arr1={11,22,33,44,55,66,77,87,98,100};

	public static void main(String[] args) {
		
		
		for (int i=0; i <(arr1.length);i++ ) {
			System.out.println(arr1[i]);
			
		}
		System.out.println("****************");
		
		
		for (int j :arr1) {
			System.out.println(j);
		}
		

	}

}
