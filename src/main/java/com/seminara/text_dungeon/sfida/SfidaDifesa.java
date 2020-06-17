package com.seminara.text_dungeon.sfida;

public class SfidaDifesa implements ISfida {

    @Override
    public int competizione(ISfida nemico) {
        return nemico.getRisultato(this);
    }

    @Override
    public int getRisultato(SfidaAttacco sfidaAttacco) {
        return 2;
    }

    @Override
    public int getRisultato(SfidaAssalto sfidaAssalto) {
        return 1;
    }

    @Override
    public int getRisultato(SfidaDifesa sfidaDifesa) {
        return 0;
    }
    
}