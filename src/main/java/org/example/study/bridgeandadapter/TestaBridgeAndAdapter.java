package org.example.study.bridgeandadapter;

public class TestaBridgeAndAdapter {

    public static void main(String[] args) throws Exception {

        Mapa mapa = new MapLink();
        System.out.println(mapa.devolveMapa("Rua abc"));

        RelogioDoSistema relogio = new RelogioDoSistema();
        System.out.println(relogio.hoje());

    }

}
