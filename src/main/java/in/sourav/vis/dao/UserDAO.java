package in.sourav.vis.dao;

import java.util.List;

import in.sourav.vis.model.UserModel;

/**
 * Represents the DAO for user related use cases
 * */
public interface UserDAO {
	
	boolean save(UserModel user);
	
	List<UserModel> list();
	
	UserModel get(int id);
	
	boolean delete(int id);
	
	UserModel findUserByName(String name);
	
	boolean changePassword(String newPassword, UserModel user);
}
