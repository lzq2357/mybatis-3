package liziq;

/**
 * @author: liziq
 * @create: 2018-09-09 12:16:17
 * @description:
 */

import liziq.entity.Blog;
import liziq.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/***/
public interface Mapper {

    List<Person> selectPerson(int id);

    List<PersonWithTag> selectPersonWithTag(@Param("id") int id);



    Comment selectComment(
            @Param("post_id") int post_id
    );



    Blog selectBlogDetails(
            @Param("id") int id
    );
}
