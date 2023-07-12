package controller;

import view.InterfazVistas;
import data.Data;
import model.Traje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener {
    public Controller(InterfazVistas interfazVistas, Data data) {
        this.interfaz = interfazVistas;
        this.data = data;
    }

    public void init() {
        interfaz.init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e != null) {
            JButton tmp = (JButton) e.getSource();
            if (tmp.getText().equals("Crear Traje")) {
                opc = opc.CREAR;
            }
            if (tmp.getText().equals("Actualizar Traje")) {
                opc = opc.ACTUALIZAR;
            }
            if (tmp.getText().equals("Borrar Traje")) {
                opc = opc.BORRAR;
            }
            if (tmp.getText().equals("Comprar Traje")) {
                opc = opc.COMPRAR;
            }
            if (tmp.getText().equals("Buscar Traje")) {
                opc = opc.BUSCAR;
            }
        }
        switch (opc) {
            case CREAR:
                data.addTrajes(new Traje(interfaz.insertIdTraje(), interfaz.insertNameTraje(),
                        interfaz.insertOriginTraje(), interfaz.insertMatTraje(), interfaz.insertPriceTraje()));
                break;
            case ACTUALIZAR:

        }
    }

    opcion opc;
    InterfazVistas interfaz;
    Data data;

}
