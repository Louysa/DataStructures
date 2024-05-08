public class Test {
    public static void main(String[] args) {
        WordTree wordTree = new WordTree();
        // Adding words to the word tree
        String[] words = {"java", "python", "javascript", "ruby", "csharp"};
        for (String word : words) {
            wordTree.insertWord(word);
        }

        // Searching for words in the word tree
        System.out.println(wordTree.searchWord("ruby")); // Output: true
        System.out.println(wordTree.searchWord("cpp"));  // Output: false
    }
}
