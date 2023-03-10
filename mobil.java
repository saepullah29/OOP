
public class mobil {
		String warna = "merah";
		String merk = "mercedes";
		
		void maju() {
			System.out.println("mobil " + merk + " warna " + warna + " siap maju");
		}
		
		void mundur() {
			System.out.println("mobil " + merk + " warna " + warna + " akan mundur");
		}
		
		public static void main(String[] args) {
			mobil mobilSaya = new mobil();
			
			mobilSaya.maju();
			mobilSaya.mundur();
			
			
		}


}
