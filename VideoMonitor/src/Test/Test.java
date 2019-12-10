package Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import POJO.User;
//import com.mybatis.util.MyBatisUtil;
public class Test {
	public static void main(String[] args) {
		try {
			//��ȡ�����ļ�mybatis-config.xml
			InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
			//���������ļ�����SqlSessionFactory
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
			//ͨ��SqlSessionFactory����SqlSession
			SqlSession ss = ssf.openSession();
			//Ҳ���԰�sqlsession�Ļ�ȡ����һ�������࣬�Ժ����ֱ�ӵ���
//			SqlSession ss=MyBatisUtil.getSession();
		
			
			//SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
			//com.mybatis.mapper.UserMapper.selectUserByIdΪUserMapper.xml�е������ռ�+select��id
			//��ѯһ���û�
			//User mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
			//System.out.println(mu);
			
			//���һ���û�
			User addmu = new User();
			addmu.setUserName("chengheng");
			addmu.setUserPwd("12345");
			addmu.setEmpTime("1999-11-11");
			addmu.setUserDept("Manager");
			addmu.setUserMail("7654321@qq.com");
			addmu.setUserRight(1);
			addmu.setUserPhone("1234567890");
			addmu.setUserID(1);
			ss.insert("mapper.Usermapper.Insert",addmu);
			//�޸�һ���û�
			/*User updatemu = new User();
			updatemu.setUid(1);
			updatemu.setUname("����");
			updatemu.setUsex("Ů");
			ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
			//ɾ��һ���û�
			ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);
			//��ѯ�����û�
			List<User> listMu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
			for (User myUser : listMu) {
				System.out.println(myUser);
			}*/
			//�ύ��������mybatis����������������Ա���Ҫ�����ύ
			ss.commit();
			//�ر�SqlSession
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
