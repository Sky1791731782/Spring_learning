package Spring_learning.day02.demo5;

public class School {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "School{ " +
                "name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
