package POJOMapper;

import java.util.List;

import POJO.Picture;

public interface PictureDAO {
	public void Insert(Picture a);
	public void Delete(Integer s);
	public void Update(Picture a);
	public Picture Select(Picture a);
	public List<Picture> All();
}
