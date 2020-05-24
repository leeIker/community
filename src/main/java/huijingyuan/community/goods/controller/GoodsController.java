package huijingyuan.community.goods.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.community.goods.dao.GoodDao;
import huijingyuan.community.goods.model.GoodModel;
@Controller
public class GoodsController {
	@Autowired
	private GoodDao gd;
	@ResponseBody
	@RequestMapping("insertGood")
	public int insertGood(@RequestBody GoodModel gm) {
		int i= gd.insertGood(gm);
		return i;
	}
	@ResponseBody
	@RequestMapping("queryAllGoods")
	public ArrayList<GoodModel> queryAllGoods(){
		return gd.queryGoods();
	}
	
}
