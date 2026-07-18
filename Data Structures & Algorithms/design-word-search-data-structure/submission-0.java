class WordDictionary {
    HashSet<String> set;
    public WordDictionary() {
        set=new HashSet<>();
    }

    public void addWord(String word) {
        set.add(word);
    }

    public boolean search(String word) {

       for(String w:set)
       {
         if(w.length()!=word.length()) continue;
         int i=0;

         while(i<w.length())
         {
            if(w.charAt(i)==word.charAt(i) || word.charAt(i)=='.') i++;
            else break;
         }
         if(i==word.length()) return true;
       }
       return false;
    }
}
