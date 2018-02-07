package exercice2;

public class Main {
	
	
	

	public static void main(String[] args) {
		int[] tableForTest = {20, 1, 8, 7, 9, 0, 15};
		sort(tableForTest);
		
		for(int number : tableForTest) {
			System.out.println(number);
		}
	}
	
	
	
	public static void sort(int[] table) {  
        int n = table.length;  
        int temp = 0;  
         for(int i = 0; i < n; i++){  
        	 for(int j = 1; j < (n-i); j++){  
        		 if(table[j-1] > table[j]){  
	                 temp = table[j-1];  
	                 table[j-1] = table[j];  
	                 table[j] = temp;  
                 }  
                          
             }  
        }  
    }
	
	
	
	

}
