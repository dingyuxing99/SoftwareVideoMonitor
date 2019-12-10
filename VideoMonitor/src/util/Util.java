package util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Util {
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		InputStream config = Resources.getResourceAsStream("util/mybatis-config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
		return ssf;
	}
	
	public static SqlSession getSession() throws IOException {
		return Util.getSqlSessionFactory().openSession();
	}
}
