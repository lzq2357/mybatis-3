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

    public Blog(Integer id){
        this.id = id;
    }

    private int id;

    private String title;

    private Author author;

    private List<Post> postList;


}
