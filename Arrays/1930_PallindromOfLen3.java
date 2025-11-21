class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i=0; i<s.length(); i++){
            int ind = s.charAt(i)-'a';
            last[ind] = i;
        }
        int ans = 0;
        for(int i =0; i<s.length(); i++){
            int ind = last[s.charAt(i)-'a'];
            if(ind == -1)continue;
            Set<Character> len = new HashSet<>();
            int curr = i+1;
            while(curr<ind){
                len.add(s.charAt(curr));
                curr++;
            }
            last[s.charAt(i)-'a'] = -1;
            ans+=len.size();
            
        }
        return ans;
    }
}