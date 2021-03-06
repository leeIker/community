package huijingyuan.community.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.dao.UserDao;
import huijingyuan.community.dto.UserData;
import huijingyuan.community.dto.UserDto;
import huijingyuan.community.service.UserService;
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	UserDao userDao;
	@ResponseBody
	@RequestMapping("register")
	public UserDto register(@RequestBody UserDto userDto) {
		String userToken=UUID.randomUUID().toString();
		UserDto userDtoTwo=userService.addInfo(userDto, userToken);
		if(userDtoTwo!=null) {
			return userDtoTwo;
		}
		return null;
	}
	@RequestMapping("login")
	public ResponseEntity login(@RequestBody UserDto userDto) {
		UserDto userDtoTwo =userDao.queryUser(userDto);
		if(userDtoTwo!=null) {
			ResponseEntity rn= new ResponseEntity(userDtoTwo,HttpStatus.OK);
			return  rn;
		}
		ResponseEntity rn= new ResponseEntity(HttpStatus.NO_CONTENT);
		return rn;
	}
	@RequestMapping("queryAll")
	public ResponseEntity queryAllUser(@RequestHeader HttpHeaders header){
			List<String> connection= header.get("Authorization");
		    String token=connection.get(0);
		    if(token==null) {
		    	return new ResponseEntity(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		    }
		    ArrayList<UserDto> users=userService.queryAllUser(token);
			return new ResponseEntity(users,HttpStatus.OK);
		
	}
	@RequestMapping("queryUserByPage")
	public ResponseEntity queryUserByPage(@RequestBody UserData userData) {
		UserData userDataTwo= userService.queryAll(userData.getSearchContent(),userData.getCurrentPage(),userData.getPageSize());
		return new ResponseEntity(userDataTwo,HttpStatus.OK);
	}
	
	@RequestMapping("queryUserById/{id}")
	public ResponseEntity queryYserBySearch(@PathVariable(value="id") int id) {
		UserDto userDto= userDao.queryUserById(id);
		return new ResponseEntity(userDto,HttpStatus.OK);
	}
	@RequestMapping("updateUser")
	public ResponseEntity updateUser(@RequestBody UserDto userDto) {
		int i= userDao.updataUser(userDto);	
		if(i>0) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
	@RequestMapping("deleteUserById/{id}")
	public ResponseEntity deleteUserById(@PathVariable(value="id") int id) {
		int i= userDao.deleteUserById(id);
		if(i>0) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	
	
}
