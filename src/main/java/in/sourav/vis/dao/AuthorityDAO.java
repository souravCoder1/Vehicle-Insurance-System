package in.sourav.vis.dao;

import java.util.List;

import in.sourav.vis.model.Authorities;

/**
 * Represents the DAO for the Authorities related use case
 * */
public interface AuthorityDAO {
	
	List<Authorities> list();
}
