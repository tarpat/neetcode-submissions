class WordDictionary {
    class TrieNode {
        char val;
        ArrayList<TrieNode> children;
    }

    TrieNode root;

    TrieNode init_node(Character c) {
        TrieNode newNode = new TrieNode();
        newNode.children = new ArrayList<>();
        newNode.val = c;
        return newNode;
    }

    public WordDictionary() {
        root = new TrieNode();
        root.children = new ArrayList<>();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for (Character c : word.toCharArray()) {
            TrieNode next = null;
            for (TrieNode tn : curr.children) {
                if (tn.val == c) {
                    next = tn;
                    break;
                }
            }
            if (next == null) {
                TrieNode newNode = init_node(c);
                curr.children.add(newNode);
                next = newNode;
            }

            curr = next;
        }
        for (TrieNode tn : curr.children) {
            if (tn.val == '\0') {
                return;
            }
        }
        curr.children.add(init_node('\0'));
    }

    public boolean find(String word, TrieNode curr) {
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            TrieNode next = null;
            for (TrieNode tn : curr.children) {
                if (tn.val == c) {
                    next = tn;
                    break;
                } else if (c == '.') {
                    boolean exists = find(word.substring(i+1), tn);
                    if (exists) {
                        return true;
                    }
                    next = null;
                }
            }
            if (next == null) {
                return false;
            }

            curr = next;
        }
        for (TrieNode tn : curr.children) {
            if (tn.val == '\0') {
                return true;
            }
        }
        return false;
    }

    public boolean search(String word) {
        return find(word, root);
    }
}
