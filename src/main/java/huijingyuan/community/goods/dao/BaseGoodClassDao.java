package huijingyuan.community.goods.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.goods.model.BaseGoodClass;

@Mapper
public interface BaseGoodClassDao {
	@Insert("insert into base_good_class (id_second,name) values(#{id_second},#{name})")
	int insertBase(BaseGoodClass bgc);
	
	@Select("select * from base_good_class where id_second =#{idsecond}")
	ArrayList<BaseGoodClass> queryBaseGoodClassByIdsecond(int idsecond);
}
