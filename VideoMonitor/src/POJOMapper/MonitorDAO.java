package POJOMapper;

import java.util.List;

import POJO.Monitor;

public interface MonitorDAO {
	public void Insert(Monitor a);
	public void Delete(Integer s);
	public void Update(Monitor a);
	public Monitor Select(Monitor a);
	public List<Monitor> All();
}
