class Kotak{
	public int panjang;
	public int lebar;
	public int tinggi;
	
	public int volume(){
		return panjang*lebar*tinggi;
	   }
	   
	public static void main(String[]args){
		Kotak kotak=new Kotak();
		
		System.out.println("masukan nilai panjang:");
		
		
		System.out.println("masukan nilai lebar:");
		
		
		System.out.println("masukan nilai tinggi:");
		
		
	System.out.println(String.format("volume kotak:%s",kotak.volume()));
	}
}
