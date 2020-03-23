package in.sourav.vis.dao;

import in.sourav.vis.model.SearchModel;
import in.sourav.vis.model.UserModel;

/**
 * Represents the DAO for search related use cases
 * */
public interface SearchDAO {
	
	UserModel searchResult(SearchModel search);
}
