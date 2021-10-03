class Solution {
    public String sortString(String s) {
        int[] alphabet = new int[26];
        for(char ch: s.toCharArray()){
            alphabet[ch - 'a'] +=1;

        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++){
                if(alphabet[i] > 0) {
                    sb.append((char) (i + 'a'));
                    alphabet[i] -=1;
                }
            }
            for(int i = 25; i >= 0 ; i--){
                if (alphabet[i] > 0) {
                sb.append((char) (i + 'a'));
                    alphabet[i] -=1;
                }
            }


            }
        return sb.toString();
    }
}
