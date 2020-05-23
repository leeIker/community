package huijingyuan.community.goods.model;

import java.util.ArrayList;

public class SecondGoodClass {
	private int id;
	private int id_first;
	private String name;
	private ArrayList<BaseGoodClass> children;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_first() {
		return id_first;
	}
	public void setId_first(int id_first) {
		this.id_first = id_first;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<BaseGoodClass> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<BaseGoodClass> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "SecondeGoodClass [id=" + id + ", id_first=" + id_first + ", name=" + name + ", base=" + children + "]";
	}
}
