package huijingyuan.community.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.dto.UserDto;

@Mapper
public interface UserDao {
	@Insert("insert into user (name,password,createTime,usertoken)values(#{name},#{password},#{createTime},#{userToken})")
	public int insertUser(UserDto  userDto);
	@Select("select * from user where name=#{name} and password=#{password}")
	public UserDto queryUser(UserDto userDto);
	@Select("select * from user")
	public ArrayList<UserDto> queryAllUser();
	@Select("select * from user where usertoken =#{token}")
	public UserDto queryUserByToken(String token);
	@Select("select count(1) from user")
	public int queryCount();
	@Select("select * from user limit #{page},#{pageSize}")
	public ArrayList<UserDto> queryUserByPage(int page,int pageSize);
}
