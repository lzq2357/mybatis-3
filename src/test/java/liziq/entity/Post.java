package liziq.entity;

/**
 * @author: liziq
 * @create: 2018-12-29 15:52:35
 * @description:
 */

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * 文章，包含 id、内容、作者、评论
 * */
@Getter
@Setter
@Alias("post")
public class Post {

    private int id;

    private int blogId;

    private String content;

    private List<Comment> commentList;
}
