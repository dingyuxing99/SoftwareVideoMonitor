package POJOMapper;

import java.util.List;

import POJO.AlarmRecord;

public interface AlarmRecordDAO {
	public void Insert(AlarmRecord a);
	public void Delete(Integer s);
	public void Update(AlarmRecord a);
	public AlarmRecord Select(AlarmRecord a);
	public List<AlarmRecord> All();
}
