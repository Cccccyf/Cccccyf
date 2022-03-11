package leetcode;

import java.util.*;

//leetcode_133克隆图
public class question_133 {
    private Stack<Node> stack = new Stack<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Node,Node> lookUp = new HashMap<>();
        Node clone = new Node(node.val);
        lookUp.put(node,clone);
        stack.push(node);
        while(!stack.empty())
        {
            Node pop_node = stack.pop();
            for(Node temp:pop_node.neighbors)
            {
                if(!lookUp.containsKey(temp)){
                    lookUp.put(temp,new Node(temp.val));
                    stack.push(temp);
                }
                lookUp.get(pop_node).neighbors.add(lookUp.get(temp));
            }
        }
        return clone;
    }

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
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
}
