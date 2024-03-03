package core;

import model.Message;
import shared.DataTransferSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MessagingSystem implements DataTransferSystem {
    private Node<Message> root;

    public MessagingSystem() {
    }

    public MessagingSystem(Message message){
        this.root = new Node<>(message);
    }

    @Override
    public void add(Message message) {
        if(this.contains(message)){
            throw new IllegalArgumentException();
        }

        if(this.root == null){
            this.root = new Node<>(message);
        }else{
            insertInto(this.root, message);
        }
    }

    private void insertInto(Node<Message> node, Message message){
        if(isGreater(message, node)){
            if(node.getRight() == null){
                node.rightChild = new Node<>(message);
            }else{
                insertInto(node.getRight(), message);
            }
        }else if(isLess(message, node)){
            if(node.getLeft() == null){
                node.leftChild = new Node<>(message);
            }else{
                insertInto(node.getLeft(), message);
            }
        }

        node.count++;
    }

    private boolean isEqual(Message message, Node<Message> node) {
        return message.getWeight() == node.getValue().getWeight();
    }

    private boolean isLess(Message message, Node<Message> node) {
        return message.getWeight() < node.getValue().getWeight();
    }

    private boolean isGreater(Message message, Node<Message> node) {
        return message.getWeight() > node.getValue().getWeight();
    }

    @Override
    public Message getByWeight(int weight) {
        Message message = containsNode(this.root, weight);

        if(message == null){
            throw new IllegalArgumentException();
        }

        return containsNode(this.root, weight);
    }

    private Message containsNode(Node<Message> node, int weight) {
        if(node == null){
            return null;
        }

        if(isEqualValue(weight, node)){
            return node.getValue();
        }else if(isGreaterValue(weight, node)){
            return containsNode(node.getRight(), weight);
        }

        return containsNode(node.getLeft(), weight);
    }

    private boolean isGreaterValue(int weight, Node<Message> node) {
        return weight - node.getValue().getWeight() > 0;
    }

    private boolean isEqualValue(int weight, Node<Message> node) {
        return weight - node.getValue().getWeight() == 0;
    }

    @Override
    public Message getLightest() {
        ensureNonEmpty();

        if(this.root.getLeft() == null){
            return this.root.getValue();
        }

        Node<Message> current = this.root;
        while(current.getLeft().getLeft() != null){
            current = current.getLeft();
        }

        return current.getLeft().getValue();
    }

    private void ensureNonEmpty() {
        if(this.root == null){
            throw new IllegalStateException();
        }
    }

    @Override
    public Message getHeaviest() {
        ensureNonEmpty();

        if(this.root.getRight() == null){
            return this.root.getValue();
        }

        Node<Message> current = this.root;
        while(current.getRight().getRight() != null){
            current = current.getRight();
        }

        return current.getRight().getValue();
    }

    @Override
    public Message deleteLightest() {
        ensureNonEmpty();

        if(this.root.getLeft() == null){
            Message value = this.root.getValue();
            this.root = this.root.getRight();
            return value;
        }

        Node<Message> current = this.root;
        while(current.getLeft().getLeft() != null){
            current.count--;
            current = current.getLeft();
        }

        current.count--;
        Message value = current.getLeft().getValue();
        current.leftChild = current.getLeft().getRight();

        return value;
    }

    @Override
    public Message deleteHeaviest() {
        ensureNonEmpty();

        if(this.root.getRight() == null){
            Message value = this.root.getValue();
            this.root = this.root.getLeft();
            return value;
        }

        Node<Message> current = this.root;
        while(current.getRight().getRight() != null){
            current.count--;
            current = current.getRight();
        }

        current.count--;
        Message value = current.getRight().getValue();
        current.rightChild = current.getRight().getLeft();

        return value;
    }

    @Override
    public Boolean contains(Message message) {
        return this.containsMessage(this.root, message);
    }

    private Boolean containsMessage(Node<Message> node, Message message){
        if(node == null){
            return false;
        }

        if(isEqual(message, node)){
            return true;
        }else if(isGreater(message, node)){
            return containsMessage(node.getRight(), message);
        }

        return containsMessage(node.getLeft(), message);
    }

    @Override
    public List<Message> getOrderedByWeight() {
        List<Message> result = new ArrayList<>();
        List<Message> messages = messagesPreOrder(this.root, result);

        return messages.stream().sorted(Comparator.comparing(Message::getWeight)).collect(Collectors.toList());
    }

    @Override
    public List<Message> getPostOrder() {
        List<Message> result = new ArrayList<>();

        return messagesPostOrder(this.root, result);
    }

    private List<Message> messagesPostOrder(Node<Message> root, List<Message> result) {
        if(root == null){
            return result;
        }

        messagesPostOrder(root.getLeft(), result);
        messagesPostOrder(root.getRight(), result);
        result.add(root.getValue());

        return result;
    }

    @Override
    public List<Message> getPreOrder() {
        List<Message> result = new ArrayList<>();

        return messagesPreOrder(this.root, result);
    }

    private List<Message> messagesPreOrder(Node<Message> root, List<Message> result) {
        if(root == null){
            return result;
        }

        result.add(root.getValue());
        messagesPreOrder(root.getLeft(), result);
        messagesPreOrder(root.getRight(), result);

        return result;
    }

    @Override
    public List<Message> getInOrder() {
        List<Message> result = new ArrayList<>();

        return messagesInOrder(this.root, result);
    }

    private List<Message> messagesInOrder(Node<Message> root, List<Message> result) {
        if(root == null){
            return result;
        }

        messagesInOrder(root.getLeft(), result);
        result.add(root.getValue());
        messagesInOrder(root.getRight(), result);

        return result;
    }

    @Override
    public int size() {
        return this.root == null ? 0 : this.root.count;
    }

    public static class Node<E> {
        private E value;
        private Node<E> leftChild;
        private Node<E> rightChild;
        private int count;

        public Node(Node<E> other){
            this.value = other.value;
            this.count = other.count;

            if(other.getLeft() != null){
                this.leftChild = new Node<>(other.getLeft());
            }

            if(other.getRight() != null){
                this.rightChild = new Node<>(other.getRight());
            }
        }

        public Node(E value) {
            this.value = value;
            this.count = 1;
        }

        public Node<E> getLeft() {
            return this.leftChild;
        }

        public Node<E> getRight() {
            return this.rightChild;
        }

        public E getValue() {
            return this.value;
        }

        public int getCount(){
            return this.count;
        }

    }
}


//import model.Message;
//        import shared.DataTransferSystem;
//
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.Comparator;
//        import java.util.List;
//        import java.util.stream.Collectors;
//
//public class MessagingSystem implements DataTransferSystem {
//    private List<Message> messages;
//
//    //
//    public MessagingSystem() {
//        this.messages = new ArrayList<>();
//    }
//
//    @Override
//    public void add(Message message) {
//        if(messages.contains(message)){
//            throw new IllegalArgumentException();
//        }
//
//        messages.add(message);
//    }
//
//    @Override
//    public Message getByWeight(int weight) {
//        Message message = messages.stream().filter(e -> e.getWeight() == weight).findFirst().orElse(null);
//
//        if(message == null){
//            throw new IllegalArgumentException();
//        }
//
//        return message;
//    }
//
//    @Override
//    public Message getLightest() {
//        Message message = messages.stream().min(Comparator.comparing(Message::getWeight)).orElse(null);
//
//        if(message == null){
//            throw new IllegalStateException();
//        }
//
//        return message;
//    }
//
//    @Override
//    public Message getHeaviest() {
//        Message message = messages.stream().max(Comparator.comparing(Message::getWeight)).orElse(null);
//
//        if(message == null){
//            throw new IllegalStateException();
//        }
//
//        return message;
//    }
//
//    @Override
//    public Message deleteLightest() {
//        Message message = messages.stream().min(Comparator.comparing(Message::getWeight)).orElse(null);
//
//        if(message == null){
//            throw new IllegalStateException();
//        }
//
//        messages.remove(message);
//        return message;
//    }
//
//    @Override
//    public Message deleteHeaviest() {
//        Message message = messages.stream().max(Comparator.comparing(Message::getWeight)).orElse(null);
//
//        if(message == null){
//            throw new IllegalStateException();
//        }
//
//        messages.remove(message);
//        return message;
//    }
//
//    @Override
//    public Boolean contains(Message message) {
//        return messages.contains(message);
//    }
//
//    @Override
//    public List<Message> getOrderedByWeight() {
//        return messages.stream().sorted(Comparator.comparing(Message::getWeight)).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<Message> getPostOrder() {
//        List<Message> order = new ArrayList<>();
//        preorderTraversal(messages, 0, order);
//
//        List<Message> collect = messages.stream().sorted(Comparator.comparingInt(Message::getWeight)).collect(Collectors.toList());
//        return collect;
//    }
//
//    @Override
//    public List<Message> getPreOrder() {
//        List<Message> order = new ArrayList<>();
//        postorderTraversal(messages, 0, order);
//
//        List<Message> collect = messages.stream().sorted(Comparator.comparingInt(Message::getWeight)).collect(Collectors.toList());
//        return collect;
//    }
//
//    @Override
//    public List<Message> getInOrder() {
//        List<Message> order = new ArrayList<>();
//        inorderTraversal(messages, 0, order);
//
//        List<Message> collect = messages.stream().sorted(Comparator.comparingInt(Message::getWeight)).collect(Collectors.toList());
//        return collect;
//    }
//
//    @Override
//    public int size() {
//        return messages.size();
//    }
//
//    public static void inorderTraversal(List<Message> list, int index, List<Message> order) {
//        if (index >= list.size()) {
//            return;
//        }
//
//        inorderTraversal(list, 2 * index + 1, order); // Left child
//        order.add(list.get(index));
//        inorderTraversal(list, 2 * index + 2, order); // Right child
//    }
//
//    public static void postorderTraversal(List<Message> list, int index, List<Message> order) {
//        if (index >= list.size()) {
//            return;
//        }
//
//        postorderTraversal(list, 2 * index + 1, order); // Left child
//        postorderTraversal(list, 2 * index + 2, order); // Right child
//        order.add(list.get(index));
//    }
//
//    public static void preorderTraversal(List<Message> list, int index, List<Message> order) {
//        if (index >= list.size()) {
//            return;
//        }
//
//        order.add(list.get(index));
//        preorderTraversal(list, 2 * index + 1, order); // Left child
//        preorderTraversal(list, 2 * index + 2, order); // Right child
//    }
//}
