package huijingyuan.community.model;

public class BasePrivilegeModel {
	private int id;
	private int idFirstPrivilege;
	private String name;
	private boolean isUse;
	
	public int getIdFirstPrivilege() {
		return idFirstPrivilege;
	}
	public void setIdFirstPrivilege(int idFirstPrivilege) {
		this.idFirstPrivilege = idFirstPrivilege;
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
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	@Override
	public String toString() {
		return "BasePrivilegeModel [id=" + id + ", idFirstPrivilege=" + idFirstPrivilege + ", name=" + name + ", isUse="
				+ isUse + "]";
	}
}
