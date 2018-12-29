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
@Alias("author")
public class Author {

    private int id;

    private String userName;

    private String password;

    private String email;
}
