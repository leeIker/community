package huijingyuan.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.dao.NameDao;
import huijingyuan.community.dao.RoleDao;
import huijingyuan.community.model.NameModel;
import huijingyuan.community.model.RoleModel;

@Controller
public class RoleController {
	@Autowired
	private RoleDao rd;
	@Autowired
	private NameDao nd;
	@ResponseBody
	@RequestMapping("addRole")
	public int addRole(RoleModel roleModel) {
		System.out.println(roleModel);
		int i= rd.insertRole(roleModel);
		return i;
	}
	@ResponseBody
	@RequestMapping("addName")
	public int addName(NameModel nameModel) {
		System.out.println(nameModel);
		int i= nd.insertName(nameModel);
		return i;
	}
	
}
