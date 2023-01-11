package Day3PracticeProblems;

public class ArrayElementFrequency {

	public static void main(String[] args) {
		//Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(" array element -   " + arr[i] + "    the number of times frequncy --" + fr[i]);  
        }  
        
      
		
		
		
		
		
//		Array arr=new Array();
//		int[] arr2= new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
//		int [] FrequencyArray=new int [arr2.length];
//		int visited =-1;
//		for (int i=0;i<=arr2.length;i++) {
//			int count =1;
//			for (int j=i+1 ;j<arr2.length;j++) {
//				if (arr2[1]==arr2[j]) {
//					count++;
//					FrequencyArray[j]=visited;
//					
//				}
//				
//			}
//			if (FrequencyArray[i]!=visited) {
//				FrequencyArray[i]=count;
//				
//			}
//			for (int k=0;k<FrequencyArray.length;k++) {
//				if (FrequencyArray[i]!=visited) {
//					System.out.println("array eliment is  -"+arr2[i]+"    the frequncy is "+FrequencyArray[i]);
//				}
//				
//				
//				
//				
//				
//			}
//			
//		}
////		for (int i:arr2) {
////			System.out.println(i);
////		}
		

	}

}
