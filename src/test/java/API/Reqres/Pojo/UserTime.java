package API.Reqres.Pojo;

import lombok.Getter;

@Getter
public class UserTime {
    private String name;
    private String job;

    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserTime() {

    }
}
