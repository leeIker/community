package huijingyuan.community.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.community.dao.BasePrivilegeDao;
import huijingyuan.community.dao.FirstPrivilegeDao;
import huijingyuan.community.dao.RolePrivilegeDao;
import huijingyuan.community.model.BasePrivilegeModel;
import huijingyuan.community.model.FirstPrivilegeModel;
import huijingyuan.community.model.RolePrivilegeModel;

@Service
public class RoleService {
	@Autowired
	private RolePrivilegeDao rd;
	@Autowired
	private FirstPrivilegeDao fd;
	@Autowired
	private BasePrivilegeDao bd;
	
	public ArrayList<RolePrivilegeModel> queryAllRole(){
		ArrayList<RolePrivilegeModel> roleList= rd.queryAllRole();
		ArrayList<RolePrivilegeModel> RoleList2=util(roleList);
		
		return RoleList2;
	}
	
	public ArrayList<RolePrivilegeModel> util(ArrayList<RolePrivilegeModel> list) {
		ArrayList<FirstPrivilegeModel> firstList = null;
		 for(int i=0;i<list.size();i++) {
			int id=  list.get(i).getId();
			 firstList= fd.queryFirstPrivilegeById(id);
			 firstList= util2(firstList);
			 list.get(i).setFirstPrivilege(firstList);
		 }
		
		return list;
	}
	
	public ArrayList<FirstPrivilegeModel> util2(ArrayList<FirstPrivilegeModel> list){
		ArrayList<BasePrivilegeModel> basePrivilegeList =null;
		for(int i=0;i<list.size();i++) {
			basePrivilegeList = bd.queryBasePrivilegeById(list.get(i).getId());
			list.get(i).setBasePrivilege(basePrivilegeList);
		}
		
		return list;
	}
	
	
}
