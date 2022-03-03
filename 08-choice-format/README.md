# Choice Format

- ChoiceFormat class adalah class yang digunakan untuk menyematkan data dengan range number, biasanya ini digunakan untuk kata plurals, misal jika 1 namanya file, jika banyak namanya files
- Pembuatan pattern untuk ChoiceFormat sangat sederhana, cukup gunakan `number#value` atau `number<value`, dan urutannya harus dari kecil ke besar, dan dipisahkan menggunakan tanda `| (pagar)`
- Misal: `-1#negatif | 0#kosong | 1#satu | 1<banyak`