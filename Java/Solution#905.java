class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;
        
        
        while(i<j){
            if(A[i]%2==0 && A[j]%2==0){
                i++;
            }else if(A[i]%2!=0 && A[j]%2==0){
                swap(A,i,j);
            }else if(A[i]%2==0 && A[j]%2!=0){
                i++;
                j--;
            }else{
                j--;
            }
        } 

        return A;
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
