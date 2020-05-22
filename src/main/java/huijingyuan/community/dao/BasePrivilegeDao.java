package huijingyuan.community.dao;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.model.BasePrivilegeModel;
@Mapper
public interface BasePrivilegeDao {
	@Select("select id_base_privilege as id,name,isUse from base_privilege where id_first_privilege = #{id}")
	ArrayList<BasePrivilegeModel> queryBasePrivilegeById(int id);
	
	@Insert("insert into base_privilege(id_first_privilege , name , idUse) values (#{idFirstPrivilege},#{name},#{idUse})")
	int addBasePrivilege(BasePrivilegeModel bpm);
}
