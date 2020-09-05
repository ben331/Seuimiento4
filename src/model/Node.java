package model;

public class Node<K extends Comparable<K>,V> {
	
	private V value;
	private K key;
	
	private Node<K,V> head;
	private Node<K,V> left;
	private Node<K,V> right;
	
	public Node(K key, V value) {
		super();
		this.value= value;
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node<K, V> getLeft() {
		return left;
	}

	public void setLeft(Node<K, V> left) {
		this.left = left;
	}

	public Node<K, V> getRight() {
		return right;
	}

	public void setRight(Node<K, V> right) {
		this.right = right;
	}

	
	public void setHead(Node<K, V> head) {
		this.head = head;
	}

	public V getValue() {
		return value;
	}

	public Node<K, V> getHead() {
		return head;
	}
	
	public Node<K,V> getMin() {
		Node<K,V> min = this;
		while(min.getLeft()!=null) {
				min=min.getLeft();
		}
		return min;
	}
}
