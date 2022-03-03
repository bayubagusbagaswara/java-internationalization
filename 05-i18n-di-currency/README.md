# I18N di Currency

- Java juga mendukung I18N untuk mata uang atau currency
- Ada 2 class yang bisa kita gunakan untuk melakukan I18N di Java, yaitu class `Currency` dan class `NumberFormat`

# Currency Class

- Currency class adalah implementasi standard dari ISO 4217 currency codes
- Dengan menggunakan class ini, kita bisa mengetahui nama mata uang, kode mata uang sampai simbol yang digunakan
- Untuk membuat object Currency, kita wajib menggunakan Locale yang memiliki negara, karena memang mata uang tergantung dari negaranya, bukan bahasanya
- Constructor Currency class adalah private, jadi untuk membuat Currency, kita harus menggunakan static method `getInstance()`

# Currency di NumberFormat

- Currency class hanya digunakan untuk mendapatkan data nama mata uang, satuan, dan simbol. Bagaimana jika kita ingin melakukan format number dalam bentuk mata uang?
- Jika dalam kasus ini, lebih baik menggunakan NumberFormat
- NumberFormat juga tidak hanya bisa digunakan untuk format dan parsing number, tapi juga number dalam bentuk currency
- Untuk membuat NumberFormat yang mendukung currency, kita bisa gunakan static method `getCurrencyInstance()`