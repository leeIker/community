package huijingyuan.community.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.dao.BasePrivilegeDao;
import huijingyuan.community.dao.FirstPrivilegeDao;
import huijingyuan.community.dao.RolePrivilegeDao;
import huijingyuan.community.model.BasePrivilegeModel;
import huijingyuan.community.model.FirstPrivilegeModel;
import huijingyuan.community.model.RolePrivilegeModel;
import huijingyuan.community.service.RoleService;

@Controller
public class TestController {
	@Autowired
	private RoleService rs;
	@Autowired
	private RolePrivilegeDao rpd;
	
	@Autowired
	private FirstPrivilegeDao fpd;
	
	@Autowired
	private BasePrivilegeDao bpd;
	
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
	
	@ResponseBody
	@RequestMapping("insertFirstPrivilege")
	public int insertFirstPrivilege(@RequestBody FirstPrivilegeModel fpm) {
		System.out.println(fpm);
		int i= fpd.addFirstPrivilege(fpm);
		return i;
	}
	
	@ResponseBody
	@RequestMapping("deleteRole/{id}")
	public int deleteRole(@PathVariable("id") int id_role) {
		int i=rpd.deleteRole(id_role);
		return i;
	}
	@ResponseBody
	@RequestMapping("addBasePrivilege")
	public int addBasePrivilege(@RequestBody BasePrivilegeModel bpm) {
		System.out.println(bpm);
		int i= bpd.addBasePrivilege(bpm);
		return i;
	}
}
