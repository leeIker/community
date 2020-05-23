package huijingyuan.community.goods.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.goods.dao.BaseGoodClassDao;
import huijingyuan.community.goods.dao.FirstGoodClassDao;
import huijingyuan.community.goods.dao.SecondGoodClassDao;
import huijingyuan.community.goods.model.BaseGoodClass;
import huijingyuan.community.goods.model.FirstGoodClass;
import huijingyuan.community.goods.model.SecondGoodClass;
import huijingyuan.community.goods.service.GoodService;

@Controller
public class GoodController {
	
	@Autowired
	private FirstGoodClassDao fgcd;
	
	@Autowired
	private SecondGoodClassDao sgcd;
	
	@Autowired
	private BaseGoodClassDao bgcd;
	
	@Autowired
	private GoodService gs;
	
	@ResponseBody
	@RequestMapping("insertFirst")
	public int InsertFirstGoodClass(FirstGoodClass fgc) {
		int i = fgcd.insertFirstGoodClass(fgc);
		return i;
	}
	
	@ResponseBody
	@RequestMapping("queryAllFirst")
	public ArrayList<FirstGoodClass> queryAllFirst(){
		ArrayList<FirstGoodClass> list= fgcd.queryAllFrist();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("insertSecond")
	public int insertSecondGoodClass(SecondGoodClass sgc) {
		int i = sgcd.insertSecond(sgc);
		return i;
	}
	@ResponseBody
	@RequestMapping("querySecondByIdfirst")
	public ArrayList<SecondGoodClass> querySecondByIdfirst(@RequestParam("id") int id){
		ArrayList<SecondGoodClass> list=sgcd.querySeconByIdFirst(id);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("insertBase")
	public int insertBase(BaseGoodClass bgc) {
		int i= bgcd.insertBase(bgc);
		return i;
	}
	
	@ResponseBody
	@RequestMapping("queryBaseByIdsecond")
	public ArrayList<BaseGoodClass> queryBaseByIdsecond(@RequestParam("id") int id_second){
		ArrayList<BaseGoodClass> list=bgcd.queryBaseGoodClassByIdsecond(id_second);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("queryGoodClassTree")
	public ArrayList<FirstGoodClass> queryGoodTree(){
		ArrayList<FirstGoodClass> list= gs.queryGoodTree();
		return list;
	}
}
