package com.cn.eric.data.structure;

import java.util.List;

public interface Gragh {

	List<Integer> getPath(int source,int target);
	
	List<Integer> getPathWithDepth(int source,int target);
	
	void showPath(int source,int target);
	
	void showPathWithDepth(int source,int target);
	
}
