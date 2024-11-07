    package App;

    public class Main {
        public static void main(String[]args){
            //Mengaturnamaperpustakaan
            Library.libraryName="Perpustakaan Kota";
            //Membuatobjekbuku
            Library.Book book1 = new Library.Book("Pemrograman Java", "Budi", "1234567890");
            Library.Book book2= new Library.Book("Algoritmadan Struktur Data","Siti","0987654321");
            //Menampilkaninformasibuku
            book1.displayBookInfo();
            book2.displayBookInfo();
            }
    }
