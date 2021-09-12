package dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.User;

@Repository("userDao")
@Mapper
public interface UserDao {
	public User selectUserByInfo(User user);
	public List<User> selectAllUser();
	public int Userregister(User user);
	public int Merchantregister(User user);
	public int updateUserPassword(User user);
	public int deleteUser(String account);
}
