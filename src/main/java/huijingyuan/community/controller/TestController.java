package huijingyuan.community.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.dao.RolePrivilegeDao;
import huijingyuan.community.model.RolePrivilegeModel;
import huijingyuan.community.service.RoleService;

@Controller
public class TestController {
	@Autowired
	private RoleService rs;
	@Autowired
	private RolePrivilegeDao rpd;
	
	@ResponseBody
	@RequestMapping("queryAllRolePrivilege")
	public ArrayList<RolePrivilegeModel> queryAllRole(){
		ArrayList<RolePrivilegeModel> list= rs.queryAllRole();
		return list;
	}
	@ResponseBody
	@RequestMapping("insertRole/{name}")
	public int InsertRole(@PathVariable("name") String name) {
		int i= rpd.addRole(name);
		return i;
	}
	
}
