public class adityarifai
{
	public static void main(String args[])
	{
		Manusia a = new Manusia();
		Hewan b = new Hewan();
		Telepon c = new Telepon();

		System.out.println("Manusia: ");
		System.out.println("Bermain: " + a.bermain("Badminton"));
		System.out.println("Makan: " + a.makan("Sate Ayam"));
		a.tidur();
		System.out.println("Bekerja: " + a.bekerja("PNS"));
		System.out.println("Memasak: " + a.memasak("Sayur"));
		System.out.println("Mencuci: " + a.mencuci("Baju"));

		System.out.println("Hewan: ");
		System.out.println("Bermain: " + b.bermain("Kasti"));
		System.out.println("Makan: " + b.makan("Ayam Bakar"));
		b.tidur();

		System.out.println("Telepon: ");
		System.out.println("Menerima Panggilan: " + c.terima_panggilan("Menerima"));
		System.out.println("Melakukan Panggilan: " + c.melakukan_panggilan("Memanggil"));
		a.tidur();

	}

}
