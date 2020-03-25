package huijingyuan.community.dao;

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
}
