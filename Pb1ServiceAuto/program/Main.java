package Pb1ServiceAuto.program;

import Pb1ServiceAuto.clase.IMasina;
import Pb1ServiceAuto.clase.Masina;
import Pb1ServiceAuto.clase.Sticker;
import Pb1ServiceAuto.clase.StickerManager;

public class Main {
    public static void main(String[] args) {
        StickerManager manager = new StickerManager();

        IMasina masina1 = new Masina("Dacia Logan", 2020);
        IMasina masina2 = new Masina("Volkswagen Golf", 2022);
        IMasina masina3 = new Masina("Dacia Logan", 2020);

        //Obtinem stickere pentru masini
        Sticker sticker1 = manager.getSticker(masina1);
        System.out.println(sticker1);

        Sticker sticker2 = manager.getSticker(masina2);
        System.out.println(sticker2);

        //Acest sticker ar trebui sa vina din cache
        Sticker sticker3 = manager.getSticker(masina3);
        System.out.println(sticker3);
    }
}
