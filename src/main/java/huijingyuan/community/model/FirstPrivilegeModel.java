package huijingyuan.community.model;

import java.util.ArrayList;

public class FirstPrivilegeModel {
	private int id;
	private int id_role;
	private String name;
	private ArrayList<BasePrivilegeModel> basePrivilege;
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
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
	public ArrayList<BasePrivilegeModel> getBasePrivilege() {
		return basePrivilege;
	}
	public void setBasePrivilege(ArrayList<BasePrivilegeModel> basePrivilege) {
		this.basePrivilege = basePrivilege;
	}
	@Override
	public String toString() {
		return "FirstPrivilegeModel [id=" + id + ", id_role=" + id_role + ", name=" + name + ", basePrivilege="
				+ basePrivilege + "]";
	}
}
