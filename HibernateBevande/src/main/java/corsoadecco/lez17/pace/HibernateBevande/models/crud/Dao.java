package corsoadecco.lez17.pace.HibernateBevande.models.crud;

import java.util.List;

public interface Dao<T> {
	
	
	void insert(T t);
	
	T findById(int id);
	
	List<T> findAll();
	
	boolean delete(int id);
	
	boolean delete(T t);
	
	boolean update(T t);

	
}
