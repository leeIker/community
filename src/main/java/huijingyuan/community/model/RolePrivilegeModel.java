package huijingyuan.community.model;

import java.util.ArrayList;

import huijingyuan.community.model.FirstPrivilegeModel;

public class RolePrivilegeModel {
	private  int id;
	private String name;
	private ArrayList<FirstPrivilegeModel> firstPrivilege;
	
	public ArrayList<FirstPrivilegeModel> getFirstPrivilege() {
		return firstPrivilege;
	}
	public void setFirstPrivilege(ArrayList<FirstPrivilegeModel> firstPrivilege) {
		this.firstPrivilege = firstPrivilege;
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
}
