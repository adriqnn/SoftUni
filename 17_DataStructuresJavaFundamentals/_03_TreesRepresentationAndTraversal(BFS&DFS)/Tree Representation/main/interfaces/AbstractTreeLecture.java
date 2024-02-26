package interfaces;

import implementations.TreeLecture;

import java.util.List;

public interface AbstractTreeLecture<E> {
    List<E> orderBfs();
    List<E> orderDfs();
    void addChild(E parentKey, TreeLecture<E> child);
	void removeNode(E nodeKey);
    void swap(E firstKey, E secondKey);
}
