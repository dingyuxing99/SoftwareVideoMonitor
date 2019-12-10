package POJOMapper;

import java.util.List;
import POJO.Video;

public interface VideoDAO {
	public void Insert(Video a);
	public void Delete(Integer s);
	public void Update(Video a);
	public Video Select(Video a);
	public List<Video> All();
}
