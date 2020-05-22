package huijingyuan.community.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.model.RolePrivilegeModel;

@Mapper
public interface RolePrivilegeDao {
	@Select("select id_role as id ,name from role_privilege")
	ArrayList<RolePrivilegeModel> queryAllRole();
	
	@Insert("insert into role_privilege (name)values(#{name})")
	int addRole(String name);
	@Delete("delete  from role_privilege where id_role = #{id}")
	int deleteRole(int id);
}


