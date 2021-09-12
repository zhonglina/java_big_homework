package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pojo.Goodstype;
import pojo.Result;
import service.GoodstypeService;
@Api(tags = "GoodstypeController",description = "��Ʒ���͹���")
@Controller
@RequestMapping("/goodstype")
public class GoodstypeController {
	@Autowired
	private GoodstypeService goodstypeService;
	
	@ApiOperation(value = "������Ʒ����")
	@RequestMapping(value = "/addGoodstype",method = RequestMethod.POST)
	@ResponseBody
	public Result addGoodstype(@RequestBody Goodstype goodstype) {
		int rt=goodstypeService.addGoodstype(goodstype);
		return new Result(0, "", String.format("������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "ɾ����Ʒ����")
	@RequestMapping(value = "/deleteGoodstype",method = RequestMethod.GET)
	@ResponseBody
	public Result deleteGoodstype(@RequestBody int id) {
		int rt=goodstypeService.deleteGoodstype(id);
		return new Result(0, "", String.format("ɾ�����ݣ�%d ��", rt));
	}
	@ApiOperation(value = "������Ʒ����")
	@RequestMapping(value = "/updateGoodstype",method = RequestMethod.POST)
	@ResponseBody
	public Result updateGoodstype(@RequestBody Goodstype goodstype) {
		int rt=goodstypeService.updateGoodstype(goodstype);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "��ѯ��Ʒ����")
	@RequestMapping(value = "/selectGoodstype",method = RequestMethod.GET)
	@ResponseBody
	public Result selectGoodstype(){
		List<Goodstype> infos=goodstypeService.selectGoodstype();
		return new Result(0, "", infos);
	}
}
