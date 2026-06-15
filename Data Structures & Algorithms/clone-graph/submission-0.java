/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> oldToNew = new HashMap<>();
        return generateNodes(oldToNew, node);
    }

    public Node generateNodes(Map<Node, Node> map, Node curr) {
        if (map.containsKey(curr)) {
            return map.get(curr);
        }
        ArrayList<Node> nodes = new ArrayList<>();
        Node newNode = new Node(curr.val, nodes);
        map.put(curr, newNode);
        for (Node n : curr.neighbors) {
            nodes.add(generateNodes(map, n));
        }
        return newNode;
    }

}