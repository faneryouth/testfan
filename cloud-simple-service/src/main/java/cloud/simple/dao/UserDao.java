package cloud.simple.dao;

import java.util.List;

import cloud.simple.model.User;


public interface UserDao {

	List<User> findAll();
}
