# I18N di Number 

- Apakah perlu I18N di number?
- Yup perlu, karena kadang beda bahasa beda juga format penulisan number nya
- Contoh, di Indonesia menggunakan `. (titik)` sebagai pemisah ribuan, dan `, (koma)` untuk pemisah bilangan pecahan, sedangkan di Amerika itu terbalik

# NumberFormat Class

- Untuk melakukan I18N di Java, kita bisa menggunakan class NumberFormat
- NumberFormat adalah abstract class untuk membuat object NumberFormat, kita bisa menggunakan static method `getInstance()` milik class NumberFormat