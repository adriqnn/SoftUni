import java.util.function.Consumer;

public class RedBlackTree<T extends Comparable<T>> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node<T> root;

    public RedBlackTree() {
    }

    private RedBlackTree(Node<T> node) {
        this.preOrderCopy(node);
    }

    private void preOrderCopy(Node<T> node) {
        if (node == null) {
            return;
        }

        this.insert(node.value);
        this.preOrderCopy(node.left);
        this.preOrderCopy(node.right);
    }

    public int getNodesCount() {
        return this.getNodesCount(this.root);
    }

    private int getNodesCount(Node<T> node) {
        if (node == null) {
            return 0;
        }

        return node.count;
    }

    // TODO:
    //  Insert using iteration over the nodes
    //  You can make a recursive one it is up to you
    //  The difference is that the recursive call should
    //  return Node
    public void insert(T value) {
        this.root = this.insert(this.root, value);
        this.root.color = BLACK;
    }

    private Node<T> insert(Node<T> node, T value) {
        if(node == null){
            return new Node<>(value);
        }

        if(node.value.compareTo(value) > 0){
            node.left = this.insert(node.left, value);
        }else if(node.value.compareTo(value) < 0){
            node.right = this.insert(node.right, value);
        }else {
            // Duplicate keys are not allowed in this example
            throw new IllegalArgumentException("Duplicate key: " + value);
        }

        // fix balance
        if(!isRed(node.left) && isRed(node.right)){
            node = rotateLeft(node);
        }

        if(isRed(node.left) && isRed(node.left.left)){
            node = rotateRight(node);
        }

        if(isRed(node.left) && isRed(node.right)){
            node = flipColors(node);
        }

        node.count = getNodesCount(node.left) + getNodesCount(node.right) + 1;
        
        return node;
    }

    private Node<T> flipColors(Node<T> node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;

        return node;
    }

    private Node<T> rotateRight(Node<T> node) {
        Node<T> result = node.left;
        node.left = result.right;
        result.right = node;

        result.color = BLACK;
        node.color = RED;

        node.count = getNodesCount(node.left) + getNodesCount(node.right) + 1;

        return result;
    }

    private Node<T> rotateLeft(Node<T> node) {
        Node<T> result = node.right;
        node.right = result.left;
        result.left = node;

        result.color = BLACK;
        node.color = RED;

        node.count = getNodesCount(node.left) + getNodesCount(node.right) + 1;

        return result;
    }

    private boolean isRed(Node<T> node) {
        return node != null && node.isRed();
    }

    public boolean contains(T value) {
        return this.findElement(value) != null;
    }

    public RedBlackTree<T> search(T item) {
        return new RedBlackTree<>(this.findElement(item));
    }

    private Node<T> findElement(T item) {
        Node<T> current = this.root;

        while (current != null) {
            if (item.compareTo(current.value) < 0) {
                current = current.left;
            } else if (item.compareTo(current.value) > 0) {
                current = current.right;
            } else {
                break;
            }
        }

        return current;
    }

    public void eachInOrder(Consumer<T> consumer) {
        this.eachInOrder(this.root, consumer);
    }

    private void eachInOrder(Node<T> node, Consumer<T> consumer) {
        if (node == null) {
            return;
        }

        this.eachInOrder(node.left, consumer);
        consumer.accept(node.value);
        this.eachInOrder(node.right, consumer);
    }

    public static class Node<T extends Comparable<T>> {
        private T value;
        private Node<T> left;
        private Node<T> right;
        private boolean color;
        private int count;

        public Node(T value) {
            this.value = value;
            this.color = RED;
            this.count = 1;
        }

        public boolean isRed(){
            return this.color == RED;
        }
    }
}

