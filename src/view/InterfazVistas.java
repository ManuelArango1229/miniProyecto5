package view;

public interface InterfazVistas {
    public void init();

    public int insertIdTraje();

    public String insertNameTraje();

    public String insertOriginTraje();

    public String insertMatTraje();

    public double insertPriceTraje();

    public int updateIdTraje(int id);

    public String updateNameTraje(String name);

    public String updateMatTraje(String material);

    public double updatePriceTraje(double price);

    public int deleteTraje(int id);

    public String searchTraje(String name);

    public void printTrajes();

    public int buyTrajes(int id);

}
