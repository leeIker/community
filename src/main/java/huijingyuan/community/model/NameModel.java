package huijingyuan.community.model;

public class NameModel {
	private boolean add_name;
	private boolean delete_name;
	private boolean name_modify;
	public boolean isAdd_name() {
		return add_name;
	}
	public void setAdd_name(boolean add_name) {
		this.add_name = add_name;
	}
	public boolean isDelete_name() {
		return delete_name;
	}
	public void setDelete_name(boolean delete_name) {
		this.delete_name = delete_name;
	}
	public boolean isName_modify() {
		return name_modify;
	}
	public void setName_modify(boolean name_modify) {
		this.name_modify = name_modify;
	}
	public NameModel(boolean add_name, boolean delete_name, boolean name_modify) {
		super();
		this.add_name = add_name;
		this.delete_name = delete_name;
		this.name_modify = name_modify;
	}
	public NameModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NameModel [add_name=" + add_name + ", delete_name=" + delete_name + ", name_modify=" + name_modify
				+ "]";
	}
	
}
