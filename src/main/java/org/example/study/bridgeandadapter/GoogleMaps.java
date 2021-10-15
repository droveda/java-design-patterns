package org.example.study.bridgeandadapter;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {
        try {
            String googleMaps = "http://maps.google.br/maps?q=rua+vergeuira";
            URL url = new URL(googleMaps);
            InputStream openStream = url.openStream();

            return "mapa";
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
