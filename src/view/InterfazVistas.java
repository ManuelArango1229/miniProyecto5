package view;

public interface InterfazVistas {
    public int insertIdTraje(int id);
    public String insertNameTraje(String name);
    public String insertMatTraje(String material);
    public double insertPriceTraje(double price);
    public int updateIdTraje(int id);
    public String updateNameTraje(String name);
    public String updateMatTraje(String material);
    public double updatePriceTraje(double price);
    public int deleteTraje(int id);
    public String searchTraje(String name);
    public void printTrajes();
    public int buyTrajes(int id);

}
