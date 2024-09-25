package tugasp4;

public class BangunRuangDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balok balok = new Balok(4, 5, 6);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        Kubus kubus = new Kubus(5);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        BangunRuang bangun = new BangunRuang();
        bangun.hitungVolume(); 
        bangun.hitungLuasPermukaan(); 
	}

}
