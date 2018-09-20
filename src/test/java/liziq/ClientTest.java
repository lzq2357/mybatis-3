package liziq;

/**
 * @author: liziq
 * @create: 2018-09-09 12:25:32
 * @description:
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/***/
public class ClientTest {

    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("resources/liziq/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        final Mapper mapper = session.getMapper(Mapper.class);
        final List<Person> people = mapper.selectPerson(1);

        //
        String statement = "liziq.Mapper.selectPerson";
        Person person = session.selectOne(statement, 1);
        System.out.println(person.getName());
    }
}
