package com.cn.eric.data.structure;

/*
 * 索引最大堆
 * 由于data可能是比较大的数据不宜移动，所以给所有的data一个index，最终进行最大堆的排序是通过index排序的(比较数值时候还是按照d*来比较)。将Index排序成最大堆，然后通过index可以定位到原来数据的位置
 * 索引位置从1开始，排除0
 * 0	1	2	3	4	5	6	数组位置
 * 0	1	2	3	4	5	6	索引位置
 * d0	d1	d2	d3	d4	d5	d6	数据位置
 * 0	0	0	0	0	0	0	存放索引位置的初始位置
 * 
 * 经过排序最终会变成
 * 0	1	2	3	4	5	6	数组位置//固定不变
 * 0	3	6	2	4	5	1	索引位置//索引位置的改变凸显出d3是最大的
 * d0	d1	d2	d3	d4	d5	d6	数据位置//固定不变
 * 0	6	3	1	4	5	2	存放索引位置的初始位置//该位置相当于索引位置的指针，而索引位置相当原数据位置的指针-->该数组的目的是为了可以在更新某个索引数据的时候可以不用遍历而是通过数组直接O(1)来寻找更新，并更新最大堆	
 * 
 * reverse[indexes[i]]=i
 * indexes[reverse[i]]=i
 */
public class IndexMaxHeap {
	
	private int arr[];
	private int indexes[];
	private int reverse[];
	private int count;
	private int capacity;
	
	public IndexMaxHeap(int capacity){
		arr = new int[capacity+1];
		indexes = new int[capacity+1];
		reverse = new int[capacity+1];
		//初始值设置reverse为0，因为都是无效数据
		for(int i = 0;i<=capacity;i++)
			reverse[i]=0;
		this.capacity = capacity;
		count = 0;
	}
	
	public void change(int index , int newItem){
		assert contain(index);
		index+=1;
		
//		for(int i = 1;i<=capacity;i++){
//			//寻找数组实际位置，更新数据，然后shiftDown和shiftUp元素即可
//			indexes[i] = index;
//			arr[i] = newItem;
//			shiftUp(i);
//			shiftDown(i);
//		}
		//维护了reverse数组可以以O(1)的复杂度来寻找到数据而非遍历的O(n)。
		arr[index] = newItem;
		int j = reverse[index];
		shiftUp(j);
		shiftDown(j);
	}
	
	public int getItem(int index){
		assert contain(index);
		return arr[index+1];
	}
	
	private boolean contain(int index) {
		assert index+1>=1 && index + 1 <= capacity;
		return reverse[index+1] != 0;
	}

	//对外是以0开始，对内是1开始
	public void insert(int index,int num){
		assert contain(index);
		assert this.count + 1 <= this.capacity;
		assert index+1<=capacity && index + 1 >= 1;
	
		index+=1;//对内是1开始
		arr[index] = num;
		indexes[count + 1] = num;
		reverse[index] = count + 1;
		
		count++;
		shiftUp(count);
	}
	
	public int extractMax(){
		
		assert this.count>=1;
		
		int ret = arr[indexes[1]];
		swap(indexes,1,count);
		reverse[indexes[1]] = 1;
		reverse[indexes[count]] = 0;
		count--;
		
		shiftDown(1);
		return ret;
	}

	private void shiftDown(int k) {
		//左子节点k*2
		while(k*2<=count){
			int j = k*2;
			//是否有右子节点，且右大于左
			if(j+1<=count&&arr[indexes[j]]<arr[indexes[j+1]])
				j = j + 1;
			if(arr[indexes[j]]<=arr[indexes[k]])
				break;
			swap(indexes,k,j);
			reverse[indexes[k]] = k;
			reverse[indexes[j]] = j;
			k = j;
		}
	}

	private void shiftUp(int k) {
		
		while(k>1&&arr[indexes[k/2]]<arr[indexes[k]]){
			swap(indexes,k/2,k);
			reverse[indexes[k/2]]=k/2;
			reverse[indexes[k]]=k;
			k/=2;
		}
		
	}
	
	//这样会节省空间，但是有可能造成int溢出
	private void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	
}
