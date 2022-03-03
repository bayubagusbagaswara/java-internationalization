# Message Format

- Ketika melakukan I18N, kadang kita membutuhkan data yang bentuknya dinamis, sesuai dengan parameter, misal kita butuh String Hi {nama}, Selamat Datang di {aplikasi}
- Jika kita menggunakan Resource Bundle, hal tersebut tidak bisa dilakukan secara otomatis, kita perlu melakukannya secara manual, dengan cara menggabungkan beberapa String
- Untungnya di Java terdapat class bernama MessageFormat
- MessageFormat class ini digunakan untuk melakukan substitusi data parameter, namun data string awalnya perlu ditambahkan penanda parameter

# Parameter di MessageFormat

- Penggunaan parameter di MessageFormat itu menggunakan tanda kurung kurawal buka, lalu diikuti dengan index (dimulai dari 0) dan diakhiri dengan kurung kurawal tutup
- Misalnya: Hi {0},  Selamat Datang di {1}
- Jika kita menggunakan nomor index yang sama, artinya data akan menggunakan parameter yang sama
- Misal: Hi {0}, Anda bisa mencari data Anda dengan mengetik "{0}" di pencarian.

# Integrasi dengan ResourceBundle

- Sebenarnya sekilas kita perhatikan jika MessageFormat itu tidak ada hubungannya dengan I18N
- Namun, kita juga bisa mengkombinasikan dengan ResourceBundle, dan menyimpan pattern nya di dalam ResourceBundle properties file
- Dengan demikian, MessageFormat seakan-akan memiliki kemampuan I18N