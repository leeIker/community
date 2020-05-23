package huijingyuan.community.goods.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.goods.model.SecondGoodClass;

@Mapper
public interface SecondGoodClassDao {
	@Insert("insert into second_good_class (id_first,name) values(#{id_first},#{name})")
	int insertSecond(SecondGoodClass sgc);
	@Select("select id_second as id,name from second_good_class where id_first = #{id}")
	ArrayList<SecondGoodClass> querySeconByIdFirst(int id);
}
