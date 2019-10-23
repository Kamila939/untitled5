import java.util.Date;

public class Phone {
    private String owner;
    private String info;
    private double cost;
    public Date start;
    public Date end;
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Phone(String owner, String info,
                 double cost, Date start, Date end) {
        this.owner = owner;
        this.info = info;
        this.cost = cost;
        this.start = start;
        this.end = end;
    }
}
