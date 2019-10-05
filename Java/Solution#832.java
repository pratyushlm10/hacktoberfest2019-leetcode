class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length;
        
        for(int[] arr: A){
            for(int i=0; i<(len+1)/2; i++){
                swap(arr, i, arr.length-1-i);
            }
        }
        
        return A;
    }
    
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = 1-arr[j];
        arr[j] = 1-temp;
    }
}
