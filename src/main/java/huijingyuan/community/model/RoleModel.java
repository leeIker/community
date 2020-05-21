package huijingyuan.community.model;

public class RoleModel {
	private String name;
	private Boolean pri_for_oder;
	private Boolean pri_for_user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPri_for_oder() {
		return pri_for_oder;
	}
	public void setPri_for_oder(Boolean pri_for_oder) {
		this.pri_for_oder = pri_for_oder;
	}
	public Boolean getPri_for_name() {
		return pri_for_user;
	}
	public void setPri_for_name(Boolean pri_for_name) {
		this.pri_for_user = pri_for_name;
	}
	public RoleModel(String name, Boolean pri_for_oder, Boolean pri_for_name) {
		super();
		this.name = name;
		this.pri_for_oder = pri_for_oder;
		this.pri_for_user = pri_for_name;
	}
	public RoleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoleModel [name=" + name + ", pri_for_oder=" + pri_for_oder + ", pri_for_name=" + pri_for_user + "]";
	}
	
}
