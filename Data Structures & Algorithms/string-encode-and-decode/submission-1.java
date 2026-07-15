class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans=new StringBuilder();
        for(String s :strs)
        {
              ans.append(s.length()+"#"+s);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#') j++;

            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+len+1);
            ans.add(word);
            i=j+len+1;
        }
        return ans;
    }
}
