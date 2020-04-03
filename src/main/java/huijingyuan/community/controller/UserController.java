package huijingyuan.community.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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
	@RequestMapping("login")
	public ResponseEntity login(@RequestBody UserDto userDto) {
		UserDto userDtoTwo =userDao.queryUser(userDto);
		if(userDtoTwo!=null) {
			ResponseEntity rn= new ResponseEntity(userDtoTwo,HttpStatus.OK);
			System.out.println(userDtoTwo);
			return  rn;
		}
		ResponseEntity rn= new ResponseEntity(HttpStatus.NO_CONTENT);
		return rn;
	}
	@RequestMapping("queryAll")
	public ResponseEntity queryAllUser(@RequestHeader("Authorization") String token){
		if(token==null) {
			return new ResponseEntity(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		}
		
		ArrayList<UserDto> list=userService.queryAllUser(token);
		ResponseEntity rn= new ResponseEntity(list,HttpStatus.OK);
		return rn;
	}
}
