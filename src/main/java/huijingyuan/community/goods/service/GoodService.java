package huijingyuan.community.goods.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.community.goods.dao.BaseGoodClassDao;
import huijingyuan.community.goods.dao.FirstGoodClassDao;
import huijingyuan.community.goods.dao.SecondGoodClassDao;
import huijingyuan.community.goods.model.BaseGoodClass;
import huijingyuan.community.goods.model.FirstGoodClass;
import huijingyuan.community.goods.model.SecondGoodClass;

@Service
public class GoodService {
	@Autowired
	private BaseGoodClassDao bgcd;
	@Autowired
	private SecondGoodClassDao sgcd;
	@Autowired
	private FirstGoodClassDao fgcd;
	
	public ArrayList<FirstGoodClass> queryGoodTree(){
		ArrayList<FirstGoodClass> list= fgcd.queryAllFrist();
		list= transforFirst(list);
		return list;
	}
	
	private ArrayList<FirstGoodClass> transforFirst(ArrayList<FirstGoodClass> list){
		for(int i=0;i<list.size();i++) {
			int idFirst= list.get(i).getId();
			ArrayList<SecondGoodClass> secondList= sgcd.querySeconByIdFirst(idFirst);
			secondList=transforSecond(secondList);
			list.get(i).setChildren(secondList);
		}
		return list;
	}
	
	private ArrayList<SecondGoodClass>  transforSecond(ArrayList<SecondGoodClass> list){
		for(int i=0;i<list.size();i++) {
			int idSecond=list.get(i).getId();
			ArrayList<BaseGoodClass> baseList= bgcd.queryBaseGoodClassByIdsecond(idSecond);
			list.get(i).setChildren(baseList);
		}
		return list;
	}
	
	
}
