package ─▒nheritanceDemo;

import ─▒nheritanceDemo.business.AskerKrediManager;
import ─▒nheritanceDemo.business.KrediUI;
import ─▒nheritanceDemo.business.OgretmenKrediManager;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());
		krediUI.krediHesapla(new OgretmenKrediManager());
	}

}
