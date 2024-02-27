package implementations;

import interfaces.AbstractTreeLecture;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class TreeLecture<E> implements AbstractTreeLecture<E> {
    private E value;
    private TreeLecture<E> parent;
    private List<TreeLecture<E>> children;

    public TreeLecture(E value, TreeLecture<E>... trees){
        this.value = value;
        this.parent = null;
        this.children = new ArrayList<>();

        for (TreeLecture<E> tree : trees) {
            this.children.add(tree);
            tree.parent = this;
        }

        //Collections.addAll(this.children, trees);
    }

    @Override
    public List<E> orderBfs() {
        List<E> result = new ArrayList<>();

        if(this.value == null){
            return result;
        }

        Deque<TreeLecture<E>> childrenQueue = new ArrayDeque<>();
        childrenQueue.offer(this);

        while(!childrenQueue.isEmpty()){
            TreeLecture<E> current = childrenQueue.poll();
            result.add(current.value);

            for (TreeLecture<E> child : current.children) {
                childrenQueue.offer(child);
            }
        }

        return result;
    }

    @Override
    public List<E> orderDfs() {
        List<E> result = new ArrayList<>();

        this.doDFS(this, result);

        return result;
    }

    public List<E> orderStackDfs() {
        List<E> result = new ArrayList<>();
        Deque<TreeLecture<E>> stack = new ArrayDeque<>();
        stack.push(this);

        while (!stack.isEmpty()) {
            TreeLecture<E> current = stack.pop();
            result.add(current.value);

            // Push children onto the stack in the correct order for DFS
            for (TreeLecture<E> child : current.children) {
                stack.push(child);
            }
        }

        Collections.reverse(result);

        return result;
    }

    private void doDFS(TreeLecture<E> node, List<E> result) {
        for (TreeLecture<E> child : node.children) {
            this.doDFS(child, result);
        }

        result.add(node.value);
    }

    @Override
    public void addChild(E parentKey, TreeLecture<E> child) {
        TreeLecture<E> search = findBFS(parentKey);

        if(search == null){
            throw new IllegalArgumentException();
        }

        search.children.add(child);
        child.parent = search;
    }

    private TreeLecture<E> findBFS(E parentKey) {
        Deque<TreeLecture<E>> childrenQueue = new ArrayDeque<>();
        childrenQueue.offer(this);

        while(!childrenQueue.isEmpty()){
            TreeLecture<E> current = childrenQueue.poll();

            if(current.value == parentKey){
                return current;
            }

            for (TreeLecture<E> child : current.children) {
                childrenQueue.offer(child);
            }
        }

        return null;
    }

    public void addChildDFS(E parentKey, TreeLecture<E> child) {
        TreeLecture<E> search = findDFS(this, parentKey);

        if(search == null){
            throw new IllegalArgumentException();
        }

        search.children.add(child);
        child.parent = search;
    }

    private TreeLecture<E> findDFS(TreeLecture<E> current, E parentKey){
        if(current.value.equals(parentKey)){
            return current;
        }

        for (TreeLecture<E> child : current.children) {
            TreeLecture<E> found = this.findDFS(child, parentKey);

            if(found != null){
                return found;
            }
        }

        return null;
    }

    @Override
    public void removeNode(E nodeKey) {
        TreeLecture<E> toRemove = findBFS(nodeKey);

        if(toRemove == null){
            throw new IllegalArgumentException();
        }

        for (TreeLecture<E> child : toRemove.children) {
            child.parent = null;
        }

        toRemove.children.clear();

        TreeLecture<E> parent = toRemove.parent;
        if(parent != null){
            parent.children.remove(toRemove);
        }

        toRemove.value = null;
    }

    @Override
    public void swap(E firstKey, E secondKey) {
        TreeLecture<E> firstNode = findBFS(firstKey);
        TreeLecture<E> secondNode = findBFS(secondKey);

        if(firstNode == null || secondNode == null){
            throw new IllegalArgumentException();
        }

        TreeLecture<E> firstParent = firstNode.parent;
        TreeLecture<E> secondParent = secondNode.parent;

        if(firstParent == null){
            replaceRoot(secondNode);
            return;
        }else if(secondParent == null){
            replaceRoot(firstNode);
            return;
        }

        firstNode.parent = secondParent;
        secondNode.parent = firstParent;

        int firstIndex = firstParent.children.indexOf(firstNode);
        int secondIndex = secondParent.children.indexOf(secondNode);

        firstParent.children.set(firstIndex, secondNode);
        secondParent.children.set(secondIndex, firstNode);
    }

    private void replaceRoot(TreeLecture<E> node) {
        this.value = node.value;
        this.parent = null;
        this.children = node.children;
        node.parent = null;
    }
}



