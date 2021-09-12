package service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import dao.UserDao;
import pojo.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public User login(User user) throws Exception {
		System.out.println(user);
		if(user.getAccount().trim().isEmpty()|| user.getPassword().trim().isEmpty()) {
			throw new Exception("参数错误");
		}
		User u = userDao.selectUserByInfo(user);
		if(u==null) {
			throw new Exception("用户不存在或密码不匹配");
		}
		return u;
//		return userDao.selectUserByInfo(user);
	}
	public int Userregister(User user) {
		return userDao.Userregister(user);
	}
	public int Merchantregister(User user) {
		return userDao.Merchantregister(user);
	}
	public int updateUserPassword(User user) {
		return userDao.updateUserPassword(user);
	}
	public int deleteUser(String account) {
		return userDao.deleteUser(account);
	}
	public List<User> selectAllUser(){
		return userDao.selectAllUser();
	}
}