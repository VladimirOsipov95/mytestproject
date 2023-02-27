package API.Swagger.Pojo;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CarsBrand {
    private String brand;
    private ArrayList<String> models;

    public CarsBrand(String brand, ArrayList<String> models) {
        this.brand = brand;
        this.models = models;
    }

    public CarsBrand() {
    }
}
