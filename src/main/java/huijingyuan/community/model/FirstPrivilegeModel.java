package huijingyuan.community.model;

import java.util.ArrayList;

public class FirstPrivilegeModel {
	private int id;
	private String name;
	private ArrayList<BasePrivilegeModel> basePrivilege;
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
	public ArrayList<BasePrivilegeModel> getBasePrivilege() {
		return basePrivilege;
	}
	public void setBasePrivilege(ArrayList<BasePrivilegeModel> basePrivilege) {
		this.basePrivilege = basePrivilege;
	}
}
