package huijingyuan.community.dto;

import java.util.ArrayList;

public class UserData {
	
	ArrayList<UserDto> userDto;
	int totalCount;
	int tatalPage;
	int currentPage;
	int pageSize;
	String searchContent;
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
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
	@Override
	public String toString() {
		return "UserData [userDto=" + userDto + ", totalCount=" + totalCount + ", tatalPage=" + tatalPage
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize + ", searchContent=" + searchContent + "]";
	}
}
