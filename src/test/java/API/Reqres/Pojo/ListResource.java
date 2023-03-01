package API.Reqres.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ListResource {
    private Integer id;
    private String name;
    private Integer year;
    private String color;
    private String pantone_value;
}
