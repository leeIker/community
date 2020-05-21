package huijingyuan.community.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import huijingyuan.community.model.NameModel;

@Mapper
public interface NameDao {
	@Insert("insert into pri_for_name (add_name,delete_name,name_modify) values(#{add_name},#{delete_name},#{name_modify})")
	public int insertName(NameModel nameModel);

}
