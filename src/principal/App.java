package principal;

import data.Data;
import view.InterfazVistas;
import view.interfazGrafica;

public class App {
    public static void main(String[] args) throws Exception {
        Data datos = new Data();
        interfazGrafica interfaz = new interfazGrafica();
        interfaz.setVisible(true);

    }
}
