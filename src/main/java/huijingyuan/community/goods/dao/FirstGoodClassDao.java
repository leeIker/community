package huijingyuan.community.goods.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.goods.model.FirstGoodClass;

@Mapper
public interface FirstGoodClassDao {
	@Insert("insert into first_good_class(name) values (#{name})")
	int insertFirstGoodClass(FirstGoodClass fgc);
	
	@Select("select id_first as id ,name from first_good_class")
	ArrayList<FirstGoodClass> queryAllFrist();
	
}
