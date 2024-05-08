public class WordTree {
    private Tree root;

    public WordTree(){
        root = new Tree('*');
    }

    public void insertWord(String word){
        Tree node = root;
        for(char c : word.toLowerCase().toCharArray()){
            int index = c - 'a';
            if(node.child[index] == null){
                node.child[index] = new Tree(c);
            }
            node = node.child[index];
        }
        node.isEndOfWord = true;
    }
    public boolean searchWord(String word){
        Tree node = root;
        for(char c : word.toLowerCase().toCharArray()){
            int index = c - 'a';
            if(node.child[index] == null){
                return false;
            }
            node = node.child[index];
        }
        return node != null && node.isEndOfWord;
    }
}
