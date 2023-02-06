package com.jw.JavaCounter.models;

public class Counter {
	Integer count;
	
	public Counter() {}
	
	public Counter(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public void incrementCount(Integer count) {
		this.count += 1;
	}
}


