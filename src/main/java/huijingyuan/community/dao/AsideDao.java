package huijingyuan.community.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AsideDao {
	@Select("select name from aside_user")
	public ArrayList<String> queryAside();
	
}
