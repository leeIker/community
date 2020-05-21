package huijingyuan.community.dao;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.model.BasePrivilegeModel;
@Mapper
public interface BasePrivilegeDao {
	@Select("select id_base_privilege as id,name,isUse from base_privilege where id_first_privilege = #{id}")
	ArrayList<BasePrivilegeModel> queryBasePrivilegeById(int id);
}
