package huijingyuan.community.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import huijingyuan.community.model.RoleModel;

@Mapper
public interface RoleDao {
	@Insert("insert into role (name,pri_for_oder,pri_for_user)values(#{name},#{pri_for_oder},#{pri_for_user})")
	public int insertRole(RoleModel roleModel);
}
