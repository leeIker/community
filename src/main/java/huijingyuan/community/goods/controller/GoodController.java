package huijingyuan.community.goods.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	@RequestMapping("insertFirst/{name}")
	public int InsertFirstGoodClass(@PathVariable("name") String name) {
		int i = fgcd.insertFirstGoodClass(name);
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
	public int insertSecondGoodClass(@RequestBody SecondGoodClass sgc) {
		int i = sgcd.insertSecond(sgc);
		return i;
	}
	@ResponseBody
	@RequestMapping("querySecondByIdfirst{id}")
	public ArrayList<SecondGoodClass> querySecondByIdfirst(@PathVariable("id") int id){
		ArrayList<SecondGoodClass> list=sgcd.querySeconByIdFirst(id);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("insertBase")
	public int insertBase(@RequestBody BaseGoodClass bgc) {
		int i= bgcd.insertBase(bgc);
		return i;
	}
	
	@ResponseBody
	@RequestMapping("queryBaseByIdsecond{id}")
	public ArrayList<BaseGoodClass> queryBaseByIdsecond(@PathVariable("id") int id_second){
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
