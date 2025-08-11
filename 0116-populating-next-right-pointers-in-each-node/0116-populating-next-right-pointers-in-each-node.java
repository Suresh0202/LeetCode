class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int len = qu.size();
            Node prev = null;

            for (int i = 0; i < len; i++) {
                Node curr = qu.poll();

                if (prev != null) {
                    prev.next = curr; 
                }
                prev = curr;

                if (curr.left != null) qu.add(curr.left);
                if (curr.right != null) qu.add(curr.right);
            }
           
        }

        return root; 
    }
}
