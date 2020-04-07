package huijingyuan.community.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.community.dao.UserDao;
import huijingyuan.community.dto.UserData;
import huijingyuan.community.dto.UserDto;
@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public UserDto addInfo(UserDto userDto,String userToken) {
		UserDto userDtoTwo=new UserDto();
		userDtoTwo.setName(userDto.getName());
		userDtoTwo.setPassword(userDto.getPassword());
		userDtoTwo.setCreateTime(System.currentTimeMillis());
		userDtoTwo.setUserToken(userToken);
		int i= userDao.insertUser(userDtoTwo);
		if(i==1) {
			return userDtoTwo;
		}
		return null;
	}
	
	public ArrayList<UserDto> queryAllUser(String token) {
		UserDto user= userDao.queryUserByToken(token);
		if(user==null) {
			return null;
		}
		ArrayList<UserDto> list=userDao.queryAllUser();
		
		return list;
		
		
	}
	
	public UserData queryAll( String content,int currentPage,int pageSize) {
		UserData userData=new UserData();
		String contentT="%"+content+"%";
		ArrayList<UserDto> users= userDao.queryUserByPage(contentT,(currentPage-1)*pageSize, pageSize);
		int totalCount=userDao.queryCount();
		userData.setUserDto(users);
		userData.setTotalCount(totalCount);
		userData.setPageSize(pageSize);
		userData.setCurrentPage(currentPage);
		if(totalCount%pageSize==0) {
			userData.setTatalPage(totalCount/pageSize);
		}else {
			userData.setTatalPage(totalCount/pageSize+1);
		}
		System.out.println(userData);
		return userData;
	}
	
	
}
