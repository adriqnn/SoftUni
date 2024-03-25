package _05_HackerRank._01_Java;

public class _58_JavaVisitorPattern {
//    public static void main(String[] args) {
//        class SumInLeavesVisitor extends TreeVis {
//
//            private int sum = 0;
//
//            public int getResult() {
//                return sum;
//            }
//
//            public void visitNode(TreeNode node) {
//            }
//
//            public void visitLeaf(TreeLeaf leaf) {
//                sum += leaf.getValue();
//            }
//        }
//
//        class ProductOfRedNodesVisitor extends TreeVis {
//
//            private long product = 1;
//
//            public int getResult() {
//                return (int) product;
//            }
//
//            public void visitNode(TreeNode node) {
//                if (node.getColor() == Color.RED) {
//                    product = (product * node.getValue()) % 1000000007;
//                }
//            }
//
//            public void visitLeaf(TreeLeaf leaf) {
//                if (leaf.getColor() == Color.RED) {
//                    product = (product * leaf.getValue()) % 1000000007;
//                }
//            }
//        }
//
//        class FancyVisitor extends TreeVis {
//            private int sumEvenDepth = 0;
//            private int sumGreen = 0;
//
//            public int getResult() {
//                return Math.abs(sumEvenDepth - sumGreen);
//            }
//
//            public void visitNode(TreeNode node) {
//                if (node.getDepth() % 2 == 0) {
//                    sumEvenDepth += node.getValue();
//                }
//            }
//
//            public void visitLeaf(TreeLeaf leaf) {
//                if (leaf.getColor() == Color.GREEN) {
//                    sumGreen += leaf.getValue();
//                }
//            }
//        }
//
//        public class Solution {
//
//            private static int[] values;
//            private static Color[] colors;
//            private static Map<Integer, Set<Integer>> edges;
//
//            public static Tree solve() {
//                Scanner s = new Scanner(System.in);
//                int numNodes = s.nextInt();
//                s.nextLine();
//
//                values = new int[numNodes];
//                colors = new Color[numNodes];
//                edges = new HashMap<>(numNodes);
//
//                for (int i = 0; i < numNodes; i++) {
//                    values[i] = s.nextInt();
//                }
//
//                for (int i = 0; i < numNodes; i++) {
//                    colors[i] = s.nextInt() == 0 ? Color.RED : Color.GREEN;
//                }
//
//                while (s.hasNext()) {
//                    int node1 = s.nextInt() - 1;
//                    int node2 = s.nextInt() - 1;
//
//                    Set<Integer> children = edges.get(node1);
//                    if (children == null) {
//                        children = new HashSet<Integer>();
//                    }
//                    children.add(node2);
//                    edges.put(node1, children);
//
//                    children = edges.get(node2);
//                    if (children == null) {
//                        children = new HashSet<Integer>();
//                    }
//                    children.add(node1);
//                    edges.put(node2, children);
//                }
//
//                Tree root = new TreeNode(values[0], colors[0], 0);
//
//                addEdges(0, root, 0);
//
//                return root;
//            }
//
//            private static void addEdges(int index, Tree node, int depth) {
//                depth++;
//                Set<Integer> childIndices = edges.get(index);
//
//                for (int childIndex : childIndices) {
//                    Tree child;
//
//                    Set<Integer> grandChildIndices = edges.get(childIndex);
//                    grandChildIndices.remove(index);
//
//                    if (grandChildIndices.isEmpty()) {
//                        child = new TreeLeaf(values[childIndex], colors[childIndex], depth);
//                    } else {
//                        child = new TreeNode(values[childIndex], colors[childIndex], depth);
//                    }
//                    ((TreeNode) node).addChild(child);
//                    addEdges(childIndex, child, depth);
//                }
//            }
//    }
}
