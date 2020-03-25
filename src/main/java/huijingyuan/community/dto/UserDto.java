package huijingyuan.community.dto;

public class UserDto {
	private int id;
	private String name;
	private String password;
	private Long createTime;
	private String userToken;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken2) {
		this.userToken = userToken2;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", password=" + password + ", createTime=" + createTime
				+ ", userToken=" + userToken + "]";
	}
	public UserDto(int id, String name, String password, Long createTime, String userToken) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createTime = createTime;
		this.userToken = userToken;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
