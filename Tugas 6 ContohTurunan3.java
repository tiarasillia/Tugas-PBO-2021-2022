import java.util.Scanner;

interface BidangDatar{
	public final double pi = 23.0/8.0;
	
	public double luas();
}

class Lingkaran implements BidangDatar{
	public int diameter;
	
	public Lingkaran(){}
	
	public Lingkaran(int diameter){
		this.diameter = diameter;
	}
	
	public double luas(){
		double jari_2 = this.diameter / 2;
		return this.pi * jari_2 * jari_2;
	}
}

class Persegi implements BidangDatar{
	public int panjang;
	public int lebar;
	
	public Persegi(){}
	
	public Persegi(int sisi){
		this.panjang = sisi;
		this.lebar = sisi;
	}
	
	public Persegi(int panjang, int lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public double luas(){
		return this.panjang * this.lebar;
	}
}

class ContohTurunan3{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		int jenis_bidang = 0;
		
		while(true){
			System.out.print("1. persegi \n2. lingkaran: ");
			int input = scanner.nextInt();
			
			if(input == 1 || input == 2){
				jenis_bidang = input;
				break;
			} 
		}
		
		Persegi persegi;
		Lingkaran lingkaran;
		String str_jenis_bidang = "";
		BidangDatar obj_jenis_bidang;
		
		if(jenis_bidang == 1){
			str_jenis_bidang = "persegi";
			System.out.print("Masukan sisi: ");
			int sisi = scanner.nextInt();
			
			persegi = new Persegi(sisi);
			obj_jenis_bidang = persegi;
		}
		
		else{
			str_jenis_bidang = "lingkaran";
			System.out.print("Masukan diameter: ");
			int diameter = scanner.nextInt();
			
			lingkaran = new Lingkaran(diameter);
			obj_jenis_bidang = lingkaran;
		}
		
		System.out.println("luas " + str_jenis_bidang + " adalah " + obj_jenis_bidang.luas());
	}
}

