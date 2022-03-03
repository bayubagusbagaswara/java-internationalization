# I18N di Date dan Time

- I18N di tipe data String mungkin sederhana, bagaimana jika tipe data Date atau Waktu?
- Di Java kita tahu bahwa tipe data Date dan Time direpresentasikan dalam class Date
- Bagaimana misal jika kita ingin menampilkan tanggal dalam bahasa Indonesia, bahasa Inggris, atau yang lainnya?
- Di Java, I18N di Date sudah disediakan menggunakan `DateFormatter`

# DateFormat Class

- DateFormat merupakan class yang bisa kita gunakan untuk melakukan parsing dari String ke Date, atau format dari Date ke String
- DateFormat mendukung I18N jika misal kita ingin melakukan format dan parse(merubah), sehingga bisa menerima hari dengan data Sunday, Monday, atau Minggu, Senin
- DateFormat adalah abstract class, salah satu implementasinya adalah class `SimpleDateFormat`