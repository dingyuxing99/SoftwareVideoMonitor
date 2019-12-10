package POJOMapper;

import java.util.List;
import POJO.User;

public interface UserDAO {
	public void Insert(User a);
	public void Delete(Integer i);
	public void Update(User a);
	public User Select(User a);
	public List<User> All();
}
