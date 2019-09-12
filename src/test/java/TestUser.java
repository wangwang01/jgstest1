import cn.kgc.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TestUser {
    /*@Test
    public void testCount(){
        InputStream inputStream =TestUser.class.getClassLoader().getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        Object selectOne=sqlSession.selectOne("cn.kgc.mybatis.mapper.UserMapper.getUserCount");
        System.out.println(selectOne);
        sqlSession.close();
    }*/
    @Test
    public void testCount(){
        InputStream inputStream =TestUser.class.getClassLoader().getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        Object selectOne=sqlSession.selectOne("cn.kgc.mybatis.mapper.ProviderMapper.getProviderCount");
        System.out.println(selectOne);
        sqlSession.close();
    }
    SqlSession sqlSession = null;

    @Before
    public void before(){
        InputStream inputStream = TestUser.class.getClassLoader().getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test01(){
        Object selectOne = sqlSession.selectOne("cn.kgc.mybatis.mapper.UserMapper.getUserCount");
        System.out.println(selectOne);
    }
    @Test
    public void test02(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserCount());
    }
    @Test
    public void test03(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserList().size());
    }

    @After
    public void after(){
        sqlSession.close();
    }
}
