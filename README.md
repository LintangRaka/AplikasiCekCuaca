# Cek Cuaca GUI

Nama : Lintang Raka Buana  
NPM : 2210010381  
Kelas: 5A REG Banjarbaru

![image](https://github.com/user-attachments/assets/9f9986da-9c35-4295-a33a-60aa37400e5b)
![image](https://github.com/user-attachments/assets/437f459a-6c9c-4653-9450-5c452e0d69f6)
![image](https://github.com/user-attachments/assets/9cbab64d-dcdf-4f13-8af9-abe51b2f87b7)
![image](https://github.com/user-attachments/assets/218a2734-9167-4d3f-8464-2d6318ec2445)


Program ini adalah aplikasi Java GUI untuk menampilkan data cuaca secara real-time dengan menggunakan API OpenWeatherMap. Aplikasi ini memungkinkan pengguna untuk mendapatkan informasi cuaca terkini di berbagai kota, menyimpan kota favorit, dan menyimpan data cuaca ke dalam file CSV.

## Fitur Utama

1. **Mengintegrasikan API Cuaca Eksternal**  
   Menggunakan OpenWeatherMap API untuk mengambil data cuaca real-time berdasarkan kota yang dimasukkan.

2. **Tampilan Cuaca**  
   Menampilkan informasi cuaca yang meliputi:
   - Nama cuaca (cerah, berawan, hujan, dll.)
   - Keterangan tambahan cuaca
   - Suhu
   - Ikon cuaca yang sesuai dengan kondisi cuaca saat ini

3. **GUI Interaktif**  
   Komponen antarmuka meliputi:
   - `JFrame`, `JPanel`, `JLabel`, `JTextField` untuk input kota dan informasi cuaca.
   - `JButton` untuk tombol "Cek Cuaca".
   - `JComboBox` untuk menyimpan dan memilih kota favorit.

4. **Penyimpanan Data**  
   - Menyimpan daftar kota favorit yang sering dicek, agar dapat dipilih dengan cepat.
   - Menyimpan data cuaca ke dalam file CSV untuk akses data di masa mendatang.
   - Memuat data cuaca dari file CSV ke dalam tabel `JTable`.

## Cara Menggunakan

1. **Input Nama Kota**  
   Masukkan nama kota di kolom input yang disediakan.

2. **Cek Cuaca**  
   Klik tombol "Cek Cuaca" untuk mengambil data cuaca dari API OpenWeatherMap dan menampilkan hasilnya.

3. **Menambahkan Kota ke Favorit**  
   Setelah pengecekan cuaca, kota tersebut otomatis ditambahkan ke `JComboBox` favorit, sehingga pengguna dapat memilihnya di lain waktu tanpa perlu mengetik ulang.

4. **Simpan Data ke CSV**  
   Klik tombol "Simpan" untuk menyimpan data cuaca yang telah ditampilkan dalam format CSV.

5. **Memuat Data dari CSV**  
   Klik tombol "Load" untuk memuat data cuaca dari file CSV ke dalam tabel `JTable`.

## Teknologi yang Digunakan

- **Java Swing** untuk GUI
- **OpenWeatherMap API** untuk data cuaca
- **JSON** untuk parsing data cuaca dari API
- **CSV File Handling** untuk menyimpan dan memuat data cuaca

## Event Handling

- **ActionListener** untuk tombol "Cek Cuaca"
- **ItemListener** pada `JComboBox` untuk memilih kota dari daftar favorit
