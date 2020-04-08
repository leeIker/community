package huijingyuan.community.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	@Select("select * from user where name like #{content}  limit #{page},#{pageSize}")
	public ArrayList<UserDto> queryUserByPage(String content,int page,int pageSize);
	@Select("select * from user where id = #{id}")
	public UserDto queryUserById(int id);
	@Update("update user set name= #{name},password= #{password} where id = #{id}")
	public int updataUser(UserDto userDto);
	@Delete("delete from user where id =#{id}")
	public int deleteUserById(int id);
}
