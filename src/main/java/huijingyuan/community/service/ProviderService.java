package huijingyuan.community.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.community.dao.AsideDao;
import huijingyuan.community.dao.UserDao;
import huijingyuan.community.dto.UserDto;

@Service
public class ProviderService {
	@Autowired
	UserDao ud;
	
	@Autowired
	AsideDao ad;
	public ArrayList queryAside(String token) {
		UserDto user= ud.queryUserByToken(token);
		if(user==null) {
			return null;
		}
		ArrayList list=ad.queryAside();
		return list;
	}
}
