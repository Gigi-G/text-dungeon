package com.seminara.text_dungeon.sfida;

public class SfidaAssalto implements ISfida {

    @Override
    public int competizione(ISfida nemico) {
        return nemico.getRisultato(this);
    }

    @Override
    public int getRisultato(SfidaAttacco sfidaAttacco) {
        return 1;
    }

    @Override
    public int getRisultato(SfidaAssalto sfidaAssalto) {
        return 0;
    }

    @Override
    public int getRisultato(SfidaDifesa sfidaDifesa) {
        return 2;
    }
    
}