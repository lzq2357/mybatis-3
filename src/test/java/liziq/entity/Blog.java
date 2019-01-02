package liziq.entity;

/**
 * @author: liziq
 * @create: 2018-12-29 15:53:34
 * @description:
 */

import lombok.*;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 博客，包含 id、标题、作者、文章
 *
 */
@Getter
@Setter
@Alias("blog")
@NoArgsConstructor
@ToString
public class Blog {

    /** 这里必须 是Integer，不能是int，否则会 报错
     * 因为 jdbc 的int型转过来时 java 的Integer，然后用来找 构造函数*/
    public Blog(Integer id){
        this.id = id;
    }

    private int id;

    private String title;

    private Author author;

    private List<Post> postList;


}
