package API.Reqres.Pojo;

import lombok.Getter;

@Getter
public class SuccessReg {
    private Integer id;
    private String token;

    public SuccessReg(int id, String token) {
        this.id = id;
        this.token = token;
    }
    public SuccessReg() {
        super();
    }
}
