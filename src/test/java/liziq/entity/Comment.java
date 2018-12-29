package liziq.entity;

/**
 * @author: liziq
 * @create: 2018-12-29 15:52:35
 * @description:
 */

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/***/
@Getter
@Setter
@Alias("comment")
public class Comment {

    private int id;

    private int postId;

    private String content;
}
