class Solution {
    public boolean isPalindrome(String s) {
        String ne = s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.print(ne);
        int i =0;
        int j =ne.length()-1;
        while(i<j){
            if(ne.charAt(i)!=ne.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
