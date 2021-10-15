package org.example.study.bridgeandadapter;

import java.time.LocalDate;

public class RelogioDoSistema implements Relogio {

    @Override
    public LocalDate hoje() {
        return LocalDate.now();
    }

}
