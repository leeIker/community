package huijingyuan.community.goods.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.community.goods.model.GoodModel;

@Mapper
public interface GoodDao {
	@Insert("insert into goods (id_base,name,price,des,weight) values(#{id_base},#{name},#{price},#{des},#{weight})")
	int insertGood(GoodModel gm);
	
	@Select("select * from goods")
	ArrayList<GoodModel> queryGoods();
}
