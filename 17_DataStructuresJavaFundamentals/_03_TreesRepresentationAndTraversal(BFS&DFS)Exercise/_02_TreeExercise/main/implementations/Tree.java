package implementations;

import interfaces.AbstractTree;

import java.util.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Tree<E> implements AbstractTree<E> {
    private E key;
    private Tree<E> parent;
    private List<Tree<E>> children;

    public Tree(E key/*, Tree<E>... children*/){
        this.key = key;
        this.children = new ArrayList<>();

//        this.children.addAll(Arrays.asList(children));
//        for (Tree<E> child : children) {
//            child.setParent(this);
//        }

    }

    public Tree(){
        this.children = new ArrayList<>();
    }

    @Override
    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(Tree<E> child) {
        this.children.add(child);
    }

    @Override
    public Tree<E> getParent() {
        return this.parent;
    }

    @Override
    public E getKey() {
        return this.key;
    }

    @Override
    public String getAsString() {
        StringBuilder builder = new StringBuilder();

        traverseTreeWithRecursion(builder, 0, this);

        return builder.toString().trim();
    }

    public String traverseWithBFS(){
        StringBuilder builder = new StringBuilder();

        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.offer(this);

        int ident = 0;

        while(!queue.isEmpty()){
            Tree<E> tree = queue.poll();

            builder.append(getPadding(ident)).append(tree.getKey()).append(System.lineSeparator());

            for (Tree<E> child : tree.children) {
                queue.offer(child);
            }
        }

        return builder.toString();
    }

    private void traverseTreeWithRecursion(StringBuilder builder, int indent, Tree<E> tree) {
        builder.append(this.getPadding(indent)).append(tree.getKey()).append(System.lineSeparator());

        for (Tree<E> child : tree.children) {
            traverseTreeWithRecursion(builder, indent + 2, child);
        }
    }

    private String getPadding(int size){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            builder.append(" ");
        }

        return builder.toString();
    }

    public List<Tree<E>> traverseWithBFSForGetLeafKeys(){
        List<Tree<E>> allNodes = new ArrayList<>();

        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.offer(this);

        while(!queue.isEmpty()){
            Tree<E> tree = queue.poll();
            allNodes.add(tree);

            for (Tree<E> child : tree.children) {
                queue.offer(child);
            }
        }

        return allNodes;
    }

    @Override
    public List<E> getLeafKeys() {
        return traverseWithBFSForGetLeafKeys().stream().filter(tree -> tree.children.size() == 0)
                .map(Tree::getKey).collect(Collectors.toList());
    }

    private void traverseTreeWithRecursionForGetMiddleKeys(List<Tree<E>> trees, Tree<E> tree) {
        trees.add(tree);

        for (Tree<E> child : tree.children) {
            traverseTreeWithRecursionForGetMiddleKeys(trees, child);
        }
    }

    @Override
    public List<E> getMiddleKeys() {
        ArrayList<Tree<E>> allNodes = new ArrayList<>();
        traverseTreeWithRecursionForGetMiddleKeys(allNodes, this);
        return allNodes.stream().filter(tree -> tree.parent != null && tree.children.size() > 0)
                .map(Tree::getKey).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Tree<E> getDeepestLeftmostNode() {
        List<Tree<E>> trees = this.traverseWithBFSForGetLeafKeys();

        int maxPath = 0;
        Tree<E> treeMax = null;

        for (Tree<E> tree : trees) {
            if(tree.isLeaf()){
                int currentPath = getStepsFromLeafToRoot(tree);
                if(currentPath > maxPath){
                    System.out.println(currentPath);
                    maxPath = currentPath;
                    treeMax = tree;
                }
            }
        }

        return treeMax;
    }

    private int getStepsFromLeafToRoot(Tree<E> tree) {
        int counter = 0;
        Tree<E> current = tree;

        while(current.parent != null){
            counter++;
            current = current.parent;
        }

        return counter;
    }

    private boolean isLeaf() {
        return this.parent != null && this.children.size() == 0;
    }

    public Tree<E> getDeepestLeftmostNodeBFS() {
        List<Tree<E>> trees = this.traverseWithBFSForGetLeafKeys();

        int maxPath = 0;
        Tree<E> treeMax = null;

        for (Tree<E> tree : trees) {
            if(tree.isLeaf()){
                int currentPath = getStepsFromLeafToRoot(tree);
                if(currentPath > maxPath){
                    System.out.println(currentPath);
                    maxPath = currentPath;
                    treeMax = tree;
                }
            }
        }

        return treeMax;
    }

    public Tree<E> getDeepestLeftmostNodeDFS() {
        List<Tree<E>> treeMax = new ArrayList<>();
        int[] maxPath = new int[1];
        int max = 0;

        treeMax.add(new Tree<E>());

        findDeepestNodeDFS(treeMax, max, maxPath, this);

        return treeMax.get(0);
    }

    private void findDeepestNodeDFS(List<Tree<E>> treeMax, int max, int[] maxPath, Tree<E> tree) {
        if(max > maxPath[0]){
            maxPath[0] = max;
            treeMax.set(0, tree);
        }

        for (Tree<E> child : tree.children) {
            findDeepestNodeDFS(treeMax, max + 1, maxPath, child);
        }

    }

    @Override
    public List<E> getLongestPath() {
        List<E> longestPath = new ArrayList<>();
        List<E> currentPath = new ArrayList<>();

        findLongestPath(this, currentPath, longestPath);

        return longestPath;
    }

    public List<E> getLongestPathTwo(){
        Queue<Tree<E>> leafs = new ArrayDeque<>();
        traverseWithBFSForGetLeafKeys().stream().filter(tree -> tree.children.size() == 0).collect(Collectors.toCollection(ArrayDeque::new)).forEach(leafs::offer);

        List<E> longestPath = new ArrayList<>();
        Tree<E> biggestTree = null;
        int pathsMax = 0;

        while(!leafs.isEmpty()){
            Tree<E> leaf = leafs.poll();
            Tree<E> current = leaf;
            int paths = 0;

            while(current.parent != null){
                paths++;
                current = current.parent;
            }

            if(paths > pathsMax){
                pathsMax = paths;
                biggestTree = leaf;
            }
        }

        while(biggestTree != null){
            longestPath.add(biggestTree.key);
            biggestTree = biggestTree.parent;
        }

        Collections.reverse(longestPath);

        return longestPath;
    }

    private void findLongestPath(Tree<E> node, List<E> currentPath, List<E> longestPath) {
        if (node == null) {
            return;
        }

        currentPath.add(node.key);

        if (currentPath.size() > longestPath.size()) {
            longestPath.clear();
            longestPath.addAll(currentPath);
        }

        for (Tree<E> child : node.children) {
            findLongestPath(child, currentPath, longestPath);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    @Override
    public List<List<E>> pathsWithGivenSum(int sum) {
        Queue<Tree<E>> leafs = new ArrayDeque<>();
        traverseWithBFSForGetLeafKeys().stream().filter(tree -> tree.children.size() == 0).collect(Collectors.toCollection(ArrayDeque::new)).forEach(leafs::offer);

        List<List<E>> sums = new ArrayList<>();

        while(!leafs.isEmpty()){
            Tree<E> current = leafs.poll();
            int sumOfMembers = 0;
            List<E> currentListOfE = new ArrayList<>();

            while(current != null){
                sumOfMembers += (int) current.key;
                currentListOfE.add(current.key);
                current = current.parent;
            }

            if(sumOfMembers == sum){
                Collections.reverse(currentListOfE);
                sums.add(currentListOfE);
            }
        }

        return sums;
    }

    public String traverseWithBFSs(){
        StringBuilder builder = new StringBuilder();

        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.offer(this);

        int ident = 0;

        while(!queue.isEmpty()){
            Tree<E> tree = queue.poll();

            builder.append(getPadding(ident)).append(tree.getKey()).append(System.lineSeparator());

            for (Tree<E> child : tree.children) {
                queue.offer(child);
            }
        }

        return builder.toString();
    }

    public List<Tree<E>> subTreesWithGivenSumBFSandDFSCombination(int sum) {
        Queue<Tree<E>> allNodes = new ArrayDeque<>();
        this.traverseWithBFSForGetLeafKeys().forEach(allNodes::offer);

        List<Tree<E>> result = new ArrayList<>();

        while(!allNodes.isEmpty()){
            Tree<E> currentNode = allNodes.poll();
            int sumCurrentNode = calculateSubTreeSum(currentNode);

            if (sumCurrentNode == sum) {
                result.add(currentNode);
            }
        }

        return result;
    }

    @Override
    public List<Tree<E>> subTreesWithGivenSum(int sum) {
        Queue<Tree<E>> allNodes = new ArrayDeque<>();
        this.traverseWithBFSForGetLeafKeys().forEach(allNodes::offer);

        List<Tree<E>> result = new ArrayList<>();

        while(!allNodes.isEmpty()){
            Tree<E> currentNode = allNodes.poll();
            int sumCurrentNode = calculateCurrentSubTreeSumBFS(currentNode);

            if(sumCurrentNode == sum){
                result.add(currentNode);
            }
        }

        return result;
    }

    private int calculateCurrentSubTreeSumBFS(Tree<E> currentNode){
        Deque<Tree<E>> queue = new ArrayDeque<>();
        queue.add(currentNode);

        int sumCurrentNode = 0;

        while(!queue.isEmpty()){
            Tree<E> tree = queue.poll();

            sumCurrentNode += (int) tree.key;

            for (Tree<E> child : tree.children) {
                queue.offer(child);
            }
        }

        return sumCurrentNode;
    }

    public List<Tree<E>> subTreesWithGivenSumDFSRecursion(int sum) {
        List<Tree<E>> result = new ArrayList<>();
        findSubTrees(this, sum, result);

        return result;
    }

    private void findSubTrees(Tree<E> node, int sum, List<Tree<E>> result) {
        if (node == null) {
            return;
        }

        int subtreeSum = calculateSubTreeSum(node);

        if (subtreeSum == sum) {
            result.add(node);
        }

        for (Tree<E> child : node.children) {
            findSubTrees(child, sum, result);
        }
    }

    private int calculateSubTreeSum(Tree<E> node) {
        int sum = 0;

        for (Tree<E> child : node.children) {
            sum += calculateSubTreeSum(child);
        }

        return sum + ((Number) node.key).intValue(); // Assuming keys are numeric
    }

    public List<Tree<E>> subTreesWithGivenSumMySolution(int sum) {
        List<Tree<E>> result = new ArrayList<>();
        findSubTreesMySolution(this, sum, result);

        return result;
    }

    private void findSubTreesMySolution(Tree<E> tree, int sum, List<Tree<E>> result) {
        int subtreeSum = calculateSubTreeSumMySolution(tree);

        if(subtreeSum ==  sum){
            result.add(tree);
        }

        for (Tree<E> child : tree.children) {
            findSubTreesMySolution(child, sum, result);
        }
    }

    private int calculateSubTreeSumMySolution(Tree<E> node) {
        int sum = 0;
        for (Tree<E> child : node.children) {
            sum += calculateSubTreeSumMySolution(child);
        }
        return sum + ((Number) node.key).intValue(); // Assuming keys are numeric
    }
}