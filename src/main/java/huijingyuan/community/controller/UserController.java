package huijingyuan.community.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.dao.UserDao;
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
	public UserDto register(UserDto userDto) {
		String userToken=UUID.randomUUID().toString();
		UserDto userDtoTwo=userService.addInfo(userDto, userToken);
		if(userDtoTwo!=null) {
			return userDtoTwo;
		}
		return null;
	}
	@ResponseBody
	@RequestMapping("login")
	public UserDto login(UserDto userDto) {
		UserDto userDtoTwo =userDao.queryUser(userDto);
		if(userDtoTwo!=null) {
			System.out.println(userDtoTwo);
			return userDtoTwo;
		}
		return null;
	}
	@RequestMapping("queryAll")
	@ResponseBody
	public ArrayList<UserDto> queryAllUser(){
		ArrayList<UserDto> list=userDao.qeruyAllUser();
		return list;
	}
}
