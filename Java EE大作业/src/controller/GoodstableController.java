package controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pojo.Goodstable;
import pojo.Goodstype;
import pojo.Result;
import service.GoodstableService;

@Api(tags = "GoodstableController",description = "��Ʒ����")
@Controller
@RequestMapping("/Goods")
public class GoodstableController {
	@Autowired
	private GoodstableService goodstableService;
	
	
	@ApiOperation(value = "������Ʒ")
	@RequestMapping(value = "/addGoods",method = RequestMethod.POST)
	@ResponseBody
	public Result addGoods(@RequestBody Goodstable goods) {
		System.out.println(goods);
		int rt=goodstableService.addGoods(goods);
		return new Result(0, "", String.format("������ݣ�%d ��", rt));
	}
	
	
	@ApiOperation(value = "ɾ����Ʒ")
	@RequestMapping(value = "/removeGoods",method = RequestMethod.GET)
	@ResponseBody
	public Result removeGoods( int id) {
		int rt=goodstableService.removeGoods(id);
		return new Result(0, "", String.format("ɾ�����ݣ�%d ��", rt));
	}
	
	@ApiOperation(value = "������Ʒ")
	@RequestMapping(value = "/updateGoods",method = RequestMethod.POST)
	@ResponseBody
	public Result updateGoods(@RequestBody Goodstable goods) {
		int rt=goodstableService.updateGoods(goods);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "ģ����ѯ��Ʒ")
	@RequestMapping(value ="/selectGoods",method = RequestMethod.GET)
	@ResponseBody
	public Result selectGoods(@Param("gname") String gname){
		List<Goodstable> rt=goodstableService.selectGoods(gname);
		System.out.println(rt);
		return  new Result(0, "", rt);
	}
	@ApiOperation(value = "��ѯȫ����Ʒ")
	@RequestMapping(value = "/selectGoodstable",method = RequestMethod.GET)
	@ResponseBody
	public Result selectGoodstable(){
		List<Goodstable> infos=goodstableService.selectGoodstable();
		return new Result(0, "", infos);
	}
}
