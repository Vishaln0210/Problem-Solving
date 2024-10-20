/*class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] another = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        }
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for(int ch : another){
            if(!set.contains(ch)){
                return false;
            }
        }

return true; 
    }
}*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray); 
        return Arrays.equals(sarray, tarray);  
    }
}


