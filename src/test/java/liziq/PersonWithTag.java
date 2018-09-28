package liziq;


import lombok.Data;

import java.util.List;

@Data
public class PersonWithTag {

    private int id;
    private String name;
	private List<Tag> tagList;



}