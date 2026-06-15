class PrefixTree {
    class TrieNode {
        char val;
        ArrayList<TrieNode> children;
    }

    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
        root.children = new ArrayList<>();
    }

    public TrieNode init_node(Character c) {
        TrieNode newNode = new TrieNode();
        newNode.children = new ArrayList<>();
        newNode.val = c;
        return newNode;
    }

    public void insert(String word) {
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

    public boolean search(String word) {
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

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (Character c : prefix.toCharArray()) {
            TrieNode next = null;
            for (TrieNode tn : curr.children) {
                if (tn.val == c) {
                    next = tn;
                    break;
                }
            }
            if (next == null) {
                return false;
            }

            curr = next;
        }
        return true;
    }
}
