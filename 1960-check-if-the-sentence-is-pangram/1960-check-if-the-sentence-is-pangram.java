class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> letters = new HashSet<>();
        for (char ch : sentence.toCharArray()) {   
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch); 
            }
        }
        return letters.size() == 26; 
    }
}