package API.Swagger.Pojo;

import lombok.Getter;

@Getter
public class VersionApp {
    public String apiVersion;

    public VersionApp(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public VersionApp() {
    }
}
