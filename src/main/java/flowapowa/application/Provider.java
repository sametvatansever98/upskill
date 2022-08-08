package flowapowa.application;

public interface Provider {

    public void add(String product, Double unitaryPrice);

    public double getPrice(String product);
}
