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
import pojo.Orderbase;
import pojo.Result;
import service.OrderbaseService;

@Api(tags = "OrderbaseController",description = "��������")
@Controller
@RequestMapping("/orderbase")
public class OrderbaseController {
	@Autowired
	private OrderbaseService  orderbaseService;
	
	@ApiOperation(value = "��������")
	@RequestMapping(value = "/addOrderbase",method = RequestMethod.POST)
	@ResponseBody
	public Result addOrderbase(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.addOrderbase(orderbase);
		return new Result(0, "", String.format("������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "���¶���״̬���û����")
	@RequestMapping(value = "/havepay",method = RequestMethod.POST)
	@ResponseBody
	public Result havepay(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.havepay(orderbase);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "���¶���״̬��ȷ���ջ���")
	@RequestMapping(value = "/haverecive",method = RequestMethod.POST)
	@ResponseBody
	public Result haverecive(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.havereceive(orderbase);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "���¶���״̬��ȡ��������")
	@RequestMapping(value = "/cancelOrder",method = RequestMethod.POST)
	@ResponseBody
	public Result cancelOrder(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.cancelOrder(orderbase);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "�鿴����")
	@RequestMapping(value = "/selectOrderbase",method = RequestMethod.POST)
	@ResponseBody
	public Result selectOrderbase(){
		List<Orderbase> infos=orderbaseService.selectOrderbase();
		return new Result(0, "", infos);
	}
}
