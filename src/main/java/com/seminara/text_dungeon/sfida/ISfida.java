package com.seminara.text_dungeon.sfida;

public interface ISfida {
    public int competizione(ISfida nemico);
    public int getRisultato(SfidaAttacco sfidaAttacco);
    public int getRisultato(SfidaAssalto sfidaAssalto);
    public int getRisultato(SfidaDifesa sfidaDifesa);
}