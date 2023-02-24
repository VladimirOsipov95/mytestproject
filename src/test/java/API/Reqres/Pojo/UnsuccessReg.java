package API.Reqres.Pojo;

import lombok.Getter;

@Getter
public class UnsuccessReg {
    private String error;

    public UnsuccessReg(String error) {
        this.error = error;
    }
    public UnsuccessReg () {
        super();
    }
}
