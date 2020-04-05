package huijingyuan.community.dto;

import java.util.ArrayList;

public class UserData {
	
	ArrayList<UserDto> userDto;
	int totalCount;
	int tatalPage;
	int currentPage;
	int pageSize;
	public ArrayList<UserDto> getUserDto() {
		return userDto;
	}
	public void setUserDto(ArrayList<UserDto> userDto) {
		this.userDto = userDto;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTatalPage() {
		return tatalPage;
	}
	public void setTatalPage(int tatalPage) {
		this.tatalPage = tatalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
