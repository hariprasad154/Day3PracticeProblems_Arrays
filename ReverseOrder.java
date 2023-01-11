package Day3PracticeProblems;

public class ReverseOrder {

	public static void main(String[] args) {
		 //Initialize array  
        int [] arr = new int [] {23,323,1, 323, 32, 44, 55};  
           
        
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
