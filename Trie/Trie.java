class Node {
    Node[] links;
    boolean end;
    
    public Node() {
        links = new Node[26];
        end = false;
    }
    
    public boolean containsKey(char c) {
        return (links[c - 'a'] != null);
    }
    
    public Node get(char c) {
        return links[c - 'a'];
    }
    
    public void put(char c, Node node) {
        links[c - 'a'] = node;
    }
    
    public void setEnd() {
        end = true;
    }
    
    public boolean isEnd() {
        return end;
    }
}

class Trie {
    
    Node root;

    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!curr.containsKey(c)) {
                curr.put(c, new Node());
            }
            curr = curr.get(c);
        }
        curr.setEnd();
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!curr.containsKey(c)) return false;
            curr = curr.get(c);
        }
        return curr.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(!curr.containsKey(c)) return false;
            curr = curr.get(c);
        }
        return true;
    }
}
