package Day3PracticeProblems;

public class Dublicate {
	

	public static void main(String[] args) {
		int [] arr = new int [] {11, 22, 33, 44, 22, 77, 88, 88, 33};   
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        } 

	}

}
