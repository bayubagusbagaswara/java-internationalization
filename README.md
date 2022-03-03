# 11th Path Learning Java : Java Internationalization

# Tools

- Java JDK 17
- Maven Project `maven-archetype-quickstart`
- JUnit 5

# Agenda

- Pengenalan Internationalization
- Locale Class
- Resource Bundle
- I18N di Date
- I18N di Number
- I18N di Currency
- Message Format
- dan lain-lain

# Internationalization

- Internationalization atau biasa disingkat I18N, karena ada 18 karakter diantara huruf I dan N
- I18N adalah proses membuat desain aplikasi yang bisa beradaptasi sesuai dengan bahasa dan tempat dari pengguna aplikasinya tanpa harus melakukan perubahan pada kode program aplikasi yang kita buat
- Java sudah mendukung I18N, jadi kita bisa membuat aplikasi kita mendukung banyak bahasa (misal bahasa Indonesia, Inggris, dan lain-lain)

# Karakteristik Aplikasi yang Mendukung I18N

- Penambahan dukungan bahasa tidak perlu melakukan perubahan kode program Java
- Tampilan yang berubah text/label, seperti misal status, label di komponen UI, semuanya tidak di hardcode di kode program, melainkan disimpan di tempat diluar kode program, dan diambil secara dinamis sesuai dengan bahasa dan lokasi pengguna aplikasi
- Mengikuti kultur lokasi user, seperti format tanggal, waktu, angka, dan mata uang
- Penambahan dukungan bahasa baru bisa dilakukan secara tepat
