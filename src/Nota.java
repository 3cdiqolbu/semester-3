
class Nota {
    private MenuItem[] items;
    private int[] jumlah;
    private int jumlahItem;

    public Nota(int kapasitas) {
        items = new MenuItem[kapasitas];
        jumlah = new int[kapasitas];
        jumlahItem = 0;
    }

    public void tambahItem(MenuItem item, int jumlahPesanan) {
        items[jumlahItem] = item;
        jumlah[jumlahItem] = jumlahPesanan;
        jumlahItem++;
    }

    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            total += items[i].getHarga() * jumlah[i];
        }
        return total;
    }

    //double total = 0;
   //for (int i = 0; i < ; i++) {
        //total += [i].getHarga() * [i];
   // }
    //return total;


    public void cetakNota() {
        System.out.println("\nNota Pemesanan Makanan:");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%s x%d - Rp %.2f\n", items[i].getNama(), jumlah[i], items[i].getHarga() * jumlah[i]);
        }
        System.out.printf("Total Harga: Rp %.2f\n", hitungTotal());
    }
}

