package com.cn.eric.data.structure;

public class AVLTree<T extends Comparable> {
	
	@SuppressWarnings("hiding")
	public class AVLNode<T extends Comparable>{
		public AVLNode<T> left;
		public AVLNode<T> right;
		public T data;
		public int height;
		
		public AVLNode(T t){
			this(t,null,null);
		}
		
		public AVLNode(T t, AVLNode<T> left, AVLNode<T> right){
			this.data = t;
			this.left=left;
			this.right=right;
			height=0;
		}
	}
	
	public AVLNode<T> root;
	
	private AVLNode<T> rotateL(AVLNode<T> x){
		
		AVLNode<T> w = x.left;
		x.left = w.right;
		w.right=x;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		w.height = Math.max(height(w.left), height(w.right))+1;
		
		return w;
	}
	
	private AVLNode<T> rotateR(AVLNode<T> x){
		
		AVLNode<T> w = x.right;
		x.right = w.left;
		w.left=x;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		w.height = Math.max(height(w.left), height(w.right))+1;
		
		return w;
	}
	
	private AVLNode<T> rotateLR(AVLNode<T> x){
		
		x.left = rotateR(x.left);
		return rotateL(x);
	}
	
	private AVLNode<T> rotateRL(AVLNode<T> x){
		
		x.right = rotateL(x.right);
		return rotateR(x);
	}
	
	public void insert(T data){
		if(null==data)
			throw new RuntimeException("illegle data input");
		this.root = insert(data,root);
	}

	private AVLNode<T> insert(T data, AVLNode<T> r) {
		//插入
		if(null==r){
			r = new AVLNode<T>(data);
		}
		//插入右子树
		else if(r.data.compareTo(data)<0){
			r.right=insert(data,r.right);
			//失衡
			if((height(r.right)-height(r.left))==2){
				//右右还是右左形式
				if(r.right.data.compareTo(data)!=0)
					r = rotateRL(r);
				else
					r = rotateR(r);
			}
		}
		//插入左子树	
		else if(r.data.compareTo(data)>0){
			r.left=insert(data,r.left);
			//失衡
			if((height(r.left)-height(r.right))==2){
				//左左还是左右形式
				if(r.left.data.compareTo(data)!=0)
					r = rotateLR(r);
				else
					r = rotateL(r);
			}
		}
		//更新高度
		r.height=Math.max(height(r.left), height(r.right))+1;
		return r;
	}
	
	public AVLNode<T> remove(T data){
		if(null==data)
			throw new RuntimeException("illegle data input");
		AVLNode<T> node = remove(data,root);
		return node;
	}

	private AVLTree<T>.AVLNode<T> remove(T data, AVLTree<T>.AVLNode<T> r) {
		if(r==null)
			return null;
		int result = data.compareTo(r.data);
		if(result<0){
			r.left = remove(data,r.left);
			if(height(r.right)-height(r.left)==2){
				AVLNode<T> currentNode = r.left;
				if(height(currentNode.left)>height(currentNode.right))
					r = rotateL(r);
				else
					r = rotateLR(r);
			}
		}else if(result>0){
			r.right = remove(data,r.right);
			if(height(r.left)-height(r.right)==2){
				AVLNode<T> currentNode = r.right;
				if(height(currentNode.left)>height(currentNode.right))
					r = rotateRL(r);
				else
					r = rotateR(r);
			}
		}
		else if(r.left!=null&&r.right!=null){
			r.data = findMin(r.right).data;
			r.right = remove(r.data,r.right);
		}
		else
			r = r.left==null?r.right:r.left;
		r.height = Math.max(height(r.left), height(r.right))+1;
		return r;
	}

	private AVLTree<T>.AVLNode<T> findMin(AVLTree<T>.AVLNode<T> node) {
		return node.left==null?node:findMin(node.left);
	}

	private int height(AVLTree<T>.AVLNode<T> node) {
		return node==null?-1:node.height;
	};
	
	public T findMin(){
		return findMin(root).data;
	}
	
	public T findMax(){
		return findMax(root).data;
	}

	private AVLNode<T> findMax(AVLTree<T>.AVLNode<T> node) {
		return node.right==null?node:findMax(node.right);
	}
	
	public boolean contains(T data){
		return contains(root,data);
	}

	private boolean contains(AVLTree<T>.AVLNode<T> node, T data) {
		if(node==null)
			return false;
		int i=node.data.compareTo(data);
		if(i<0)
			return contains(node.right,data);
		else if(i>0)
			return contains(node.left,data);
		else
			return true;
	}
	
	public String inOrder(){
		return inOrder(this.root);
	}
	
	public String inOrder(AVLNode<T> node){
		StringBuffer sb = new StringBuffer();
		if(node!=null){
			sb.append(inOrder(node.left));
			sb.append(node.data.toString());
			sb.append(inOrder(node.right));
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		AVLTree<Integer> tree = new AVLTree<Integer>();
		tree.insert(5);
		tree.insert(2);
		tree.insert(11);
		tree.insert(9);
		tree.insert(-9);
		tree.insert(0);
		System.out.println(tree.inOrder());
		tree.remove(1);
		System.out.println(tree.inOrder());
		tree.remove(11);
		System.out.println(tree.inOrder());
		
		System.out.println(tree.contains(5));
		System.out.println(tree.contains(1));
		
		tree.insert(3);
		System.out.println(tree.inOrder());
		System.out.println(tree.findMin());
		System.out.println(tree.findMax());
	}
}
