public class Tree {
    char data;
    boolean isEndOfWord;
    Tree[] child;

    public Tree(char data){
        this.data = data;
        this.isEndOfWord = false;
        this.child = new Tree[26];
    }
}
