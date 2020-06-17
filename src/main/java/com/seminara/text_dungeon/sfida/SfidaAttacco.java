package com.seminara.text_dungeon.sfida;

public class SfidaAttacco implements ISfida {

    @Override
    public int competizione(ISfida nemico) {
        return nemico.getRisultato(this);
    }

    @Override
    public int getRisultato(SfidaAttacco sfidaAttacco) {
        return 0;
    }

    @Override
    public int getRisultato(SfidaAssalto sfidaAssalto) {
        return 2;
    }

    @Override
    public int getRisultato(SfidaDifesa sfidaDifesa) {
        return 1;
    }
    
}