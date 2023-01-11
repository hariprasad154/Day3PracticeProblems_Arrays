package Day3PracticeProblems;

public class SmalestInArray {

	public static void main(String[] args) {
		
        int [] arr = new int [] {11,22,33,44,55,66,77,87,98,100};  
         
        int min = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);

	}

}
