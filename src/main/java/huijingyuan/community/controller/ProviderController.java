package huijingyuan.community.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import huijingyuan.community.dao.AsideDao;
import huijingyuan.community.service.ProviderService;

/**
 * 
 * @author leehe
 * 本类用来提供最基本的页面
 * 信息
 *
 */
@Controller
@RequestMapping("provider")
public class ProviderController {
	@Autowired
	ProviderService  ps;
	@RequestMapping("aside")
	public ResponseEntity asideProvider(@RequestHeader("Authorization") String token){
		if(token==null) {
			return new ResponseEntity(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		}
		ArrayList list= ps.queryAside(token);
		if(list==null) {
			return new ResponseEntity(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
		}
		return new ResponseEntity(list,HttpStatus.OK);
		
	}
}
