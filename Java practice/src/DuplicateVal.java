
public class DuplicateVal {

	public static void main(String[] args) {
		int [] arr = {2, 5, 45, 1, 2, 45, 6, 34, 5, 2, 3, 1};   
        
        System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  


	}

}
