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
			//读取配置文件mybatis-config.xml
			InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
			//根据配置文件构建SqlSessionFactory
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
			//通过SqlSessionFactory创建SqlSession
			SqlSession ss = ssf.openSession();
			//也可以把sqlsession的获取做成一个工具类，以后可以直接调用
//			SqlSession ss=MyBatisUtil.getSession();
		
			
			//SqlSession执行映射文件中定义的SQL，并返回映射结果
			//com.mybatis.mapper.UserMapper.selectUserById为UserMapper.xml中的命名空间+select的id
			//查询一个用户
			//User mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
			//System.out.println(mu);
			
			//添加一个用户
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
			//修改一个用户
			/*User updatemu = new User();
			updatemu.setUid(1);
			updatemu.setUname("张三");
			updatemu.setUsex("女");
			ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
			//删除一个用户
			ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);
			//查询所有用户
			List<User> listMu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
			for (User myUser : listMu) {
				System.out.println(myUser);
			}*/
			//提交事务，由于mybatis采用了事务管理，所以必须要进行提交
			ss.commit();
			//关闭SqlSession
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
