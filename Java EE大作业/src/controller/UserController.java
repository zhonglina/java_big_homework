package controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pojo.Result;
import pojo.User;
import service.UserService;

@Api(tags = "UserController",description = "�û�����")
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "��ѯȫ���û�")
	@RequestMapping(value = "/selectAllUser",method = RequestMethod.POST)
	@ResponseBody
	public Result selectAllUser(){
		List<User> infos=userService.selectAllUser();
		return new Result(0, "", infos);
	}
	
	@ApiOperation(value = "�û�ע��")
	@RequestMapping(value = "/userregister",method = RequestMethod.POST)
	@ResponseBody
	public Result Userregister(@RequestBody User user) {
		int rt = userService.Userregister(user);
		return new Result(0, "", String.format("������ݣ�%d ��", rt));
		
	} 
	@ApiOperation(value = "�̼�ע��")
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	@ResponseBody
	public Result register(@RequestBody User user) {
		int rt = userService.Merchantregister(user);
		return new Result(0, "", String.format("������ݣ�%d ��", rt));
		
	} 
	@ApiOperation(value = "��¼")
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public Result Login(@RequestBody User user, HttpSession session, BindingResult errors) {

		if (errors.hasErrors()) {
			session.invalidate();// ���֮ǰ�ĵ�¼��Ϣ
			return new Result(0, "ȱ�ٲ���", "��¼ʧ��111");
		}
		try {
			user = userService.login(user);
		}
		catch(NullPointerException e) {
			session.invalidate();// ���֮ǰ�ĵ�¼��Ϣ
			return new Result(0, "ȱ�ٲ���", "��¼ʧ��");
		} 
		catch (Exception e) {
			session.invalidate();// ���֮ǰ�ĵ�¼��Ϣ
			return new Result(0, e.getMessage(), "��¼ʧ��");
		}
		session.setAttribute("user", user);
		return new Result(0, "", "��¼�ɹ�");
	}
	@ApiOperation(value = "�޸�����")
	@RequestMapping(value = "/updateUserPassword",method = RequestMethod.POST)
	@ResponseBody
	public Result updateUserPassword(@RequestBody User user) {
		int rt = userService.updateUserPassword(user);
		return new Result(0, "", String.format("�������ݣ�%d ��", rt));
	}
	@ApiOperation(value = "ɾ���û�")
	@RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
	@ResponseBody
	public Result deleteUser(@RequestBody String account) {
		int rt=userService.deleteUser(account);
		return new Result(0, "", String.format("ɾ�����ݣ�%d ��", rt));
	}
	
	
}