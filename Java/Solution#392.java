class Solution {
    public boolean isSubsequence(String s, String t) {
         if(s==null || t==null) return false;
         if(s.length()==0)return true;
         if(t.length()==0){
             return false;
         }
        if(s.length()>t.length())return false;
        if(s.length()==t.length())return s.equals(t);
        
        int si = 0;
        
        for(int i=0; i<t.length(); i++){
            if(s.charAt(si) == t.charAt(i)){
                si++;
                if(si == s.length()) return true;
            }
        }
        
        return false;
       
}
}
