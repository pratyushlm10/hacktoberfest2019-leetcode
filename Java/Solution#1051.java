class Solution {
    public int heightChecker(int[] arr) {
        int[] rarr = arr.clone();
        sort(arr,0,arr.length-1);
        int c = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != rarr[i]){
                c++;
            }
        }
        
        return c++;
        
    }
    
    static void sort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int pi = part(arr, lo, hi);
        sort(arr, lo, pi-1);
        sort(arr, pi+1, hi);
    }
    
    static int part(int[] arr, int lo, int hi){
        int pv = arr[hi];
          int i=lo; int j=lo;
        
        while(i<=hi){
            if(arr[i]<=pv){
                swap(arr, i, j);
                i++;
                j++;
            }else if(arr[i]>pv){
                i++;
            }
        }
        
        return j-1;
    }
    
    static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
