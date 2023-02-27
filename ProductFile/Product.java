package ProductFile;

import java.io.Serializable;

public class Product implements Serializable {
    private String idproduct;
    private String name;
    private String sticker;
    private String prince;
    private String describe;

    public Product() {

    }

    public Product(String idproduct, String name, String sticker, String prince, String describe) {
        this.idproduct = idproduct;
        this.name = name;
        this.sticker = sticker;
        this.prince = prince;
        this.describe = describe;
    }

    public String getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(String idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idproduct=" + idproduct +
                ", name='" + name + '\'' +
                ", sticker='" + sticker + '\'' +
                ", prince=" + prince +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String toStringFile() {
        return idproduct + "," + name + "," + sticker + "," + prince + "," + describe;
    }

}
