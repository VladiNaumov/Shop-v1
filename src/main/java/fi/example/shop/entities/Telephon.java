package fi.example.shop.entities;

public class Telephon {

    private long id;
    private String model;
    private int price;

    public Telephon() {
    }



    public Telephon(long id, String model, int price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
