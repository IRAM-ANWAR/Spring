package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	List<String> list;
	Set<String> set;
	Map<String, String> map;

	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection(List<String> list, Set<String> set, Map<String, String> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<String> getList() {
		return this.list;
	}

	public Map<String, String> getMap() {
		return this.map;
	}

	public Set<String> getSet() {
		return this.set;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Collection [list=" + this.list + ", set=" + this.set + ", map=" + this.map + "]";
	}

}
