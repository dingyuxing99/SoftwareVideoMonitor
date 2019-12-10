package POJOMapper;

import java.util.List;

import POJO.Poi;

public interface PoiDAO {
	public void Insert(Poi a);
	public void Delete(Integer s);
	public void Update(Poi a);
	public Poi Select(Poi a);
	public List<Poi> All();
}
