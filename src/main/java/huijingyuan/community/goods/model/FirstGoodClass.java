package huijingyuan.community.goods.model;

import java.util.ArrayList;

public class FirstGoodClass {
	private int id;
	private String name;
	private ArrayList<SecondGoodClass> children;
	@Override
	public String toString() {
		return "FirstGoodClass [id=" + id + ", name=" + name + ", second=" + children + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<SecondGoodClass> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<SecondGoodClass> children) {
		this.children = children;
	}
	
}
