package huijingyuan.community.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.model.FirstPrivilegeModel;
@Mapper
public interface FirstPrivilegeDao {
	@Select("select id_first_privilege as id,name from first_privilege where id_role = #{id}")
	ArrayList<FirstPrivilegeModel> queryFirstPrivilegeById(int id);
}
