package com.cn.eric.data.structure;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class BST<K extends Comparable, V> {

	private Node root = null;
	private int count = 0;

	public BST() {
		root = null;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(K k, V v) {
		root = insert(root, k, v);
	}

	// 插入K,V到以root爲根節點的子樹中
	private Node insert(Node root, K k, V v) {
		if (root == null) {
			count++;
			root = new Node(k, v);
		} else if (k.compareTo(root.k) > 0)
			root.right = insert(root.right, k, v);
		else if (k.compareTo(root.k) < 0)
			root.left = insert(root.left, k, v);
		else {
			root.v = v;
		}
		return root;
	}

	public V search(K k) {
		return search(root, k);
	}

	// 查找以root为根节点的k对应的value值
	private V search(Node root, K k) {
		if (root == null)
			return null;
		if (root.k.compareTo(k) < 0)
			return search(root.right, k);
		else if (root.k.compareTo(k) > 0)
			return search(root.left, k);
		else
			return (V) root.v;
	}

	public boolean contains(K k) {
		return contains(root, k);
	}

	private boolean contains(Node root, K k) {
		if (root == null)
			return false;
		if (root.k.compareTo(k) < 0)
			return contains(root.right, k);
		else if (root.k.compareTo(k) > 0)
			return contains(root.left, k);
		else
			return true;
	}

	/*
	 * 前中后序遍历: Node ./.\. Node Node 三个点分别代表前中后序，只有在执行相应的序列的时候其中一个才起作用，其他的不起作用
	 */

	// 前序遍历
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.v);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// 中序遍历
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.v);
			inOrder(root.right);
		}
	}

	// 后序遍历
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.v);
		}
	}

	// 层序遍历-->广度优先
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.v);
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	// 删除最大节点
	public void deleteMax() {
		if (root != null)
			root = deleteMax(root);
	}

	// 删除最小节点
	public void deleteMin() {
		root = deleteMin(root);
	}

	// 刪除該節點下的最大值節點，返回當前root節點被處理後的結果
	private Node deleteMax(Node root) {
		if (root.right != null) {
			root.right = deleteMax(root.right);
			return root;
		}
		if (root.left == null) {
			return null;
		} else {
			return root.left;
		}
	}

	// 刪除該節點下的最小值節點,返回當前root節點被處理後的結果
	private Node deleteMin(Node root) {
		if (root.left != null) {
			root.left = deleteMax(root.left);
			return root;
		}
		if (root.right == null) {
			return null;
		} else {
			return root.right;
		}
	}

	public void remove(K k) {
		remove(root, k);
	}

	// 刪除以Node爲根子樹的k節點，返回Node處理後的根節點
	private Node remove(Node node, K k) {
		if (node == null)
			return null;
		if (k.compareTo(node.k) < 0) {
			node.left = remove(node.left, k);
			return node;
		}
		if (k.compareTo(node.k) > 0) {
			node.right = remove(node.right, k);
			return node;
		}
		// 左子樹爲空
		if (node.left == null) {
			count--;
			return node.right;
		}
		// 右子樹爲空
		else if (node.right == null) {
			count--;
			return node.left;
		} else {
			// 左右子樹均有值，尋找左子樹的最大值替代target節點，然後刪除target節點,或者找到右子樹最小值來替代target節點
			Node left = findMax(node.left);

			deleteMax(node.left);
			left.right = node.right;
			left.left = node.left;

			return left;
		}
	}

	private Node findMax(Node left) {
		if (left == null)
			return null;
		if (left.right != null)
			return findMax(left.right);
		return left;
	}

	private Node findMin(Node right) {
		if (right == null)
			return null;
		if (right.left != null)
			return findMin(right.left);
		return right;
	}

	@SuppressWarnings("unchecked")
	public V floor(K k) {
		if (contains(k))
			return search(k);
		// 如果最小值都大于k，那么则没有floor值
		if (root == null || findMin(root).k.compareTo(k) > 0)
			return null;
		return floor(root, k);
	}

	@SuppressWarnings("unchecked")
	private V floor(Node node, K k) {
		while (node != null) {
			if(k.compareTo(node.k)>0){
				if(node.right==null||k.compareTo(findMin(node.right).k)<0)
					return (V) node.v;
				node = node.right;
			}else{
				if(node.left==null||k.compareTo(findMax(node.left).k)>0)
					return (V)findMax(node.left).v;
				node = node.left;
			}
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public V ceil(K k) {
		if (contains(k))
			return search(k);
		// 如果最大值都小于k，那么则没有ceil值
		if (root == null || findMax(root).k.compareTo(k) < 0)
			return null;
		return ceil(root,k);
	}

	@SuppressWarnings("unchecked")
	private V ceil(Node node, K k) {
		while(node!=null){
			if(k.compareTo(node.k)<0){
				if(node.left==null||k.compareTo(findMax(node.left).k)>0)
					return (V) node.v;
				node = node.left;
			}else{
				if(node.right==null||k.compareTo(findMin(node.right).k)<0)
					return (V)findMin(node.right).v;
				node = node.right;
			}
		}
		return null;
	}

	private class Node<K extends Comparable, V> {
		K k;
		V v;
		Node left;
		Node right;

		public Node() {
			k = null;
			v = null;
			left = null;
			right = null;
		}

		public Node(K k, V v) {
			this.k = k;
			this.v = v;
			this.left = null;
			this.right = null;
		}
	}

}
