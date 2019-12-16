package com.rifkistwn.top10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataUniv extends AppCompatActivity {
    private TextView GetText;
    private ImageView GetIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_univ);
        getSupportActionBar().setTitle("Data Bola");
        GetIcon = findViewById(R.id.getIcon);
        GetText = findViewById(R.id.getText);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData() {
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama) {
            case "AboutMe":
                GetIcon.setImageResource(R.drawable.rifki);
                GetText.setText("Top 10 Universitas di Indonesia\nAplikasi ini untuk mengetahui Top 10 Universitas yang ada di Indonesia\nMuhammad Rifki Setiawan\nmail@rifkistwn.com\nNPM 1717051004\nKelas B");
                break;

            case "InstitutTeknologiBandung":
                GetIcon.setImageResource(R.drawable.itb);
                GetText.setText("Dengan skor 3.671 – klaster 1. Peringkat universitas terbaik di Indonesia dipegang ITB, singkatan dari Institut Teknologi Bandung. PTN di Bandung ini layak menjadi institut terbaik di Indonesia yang bergerak di bidang pengembangan teknik dan sains. ITB didirikan sejak tahun 1959 dan mampu mempertahankan kualitas sebagai salah satu yang termasuk daftar PTN terbaik di Indonesia.\n" +
                        "Singkatan : ITB\n" +
                        "Kota : Bandung, Jawa Barat\n" +
                        "Didirikan : 2 Maret 1959\n");
                break;

            case "UniversitasGadjahMada":
                GetIcon.setImageResource(R.drawable.ugm);
                GetText.setText("Dengan skor 3.594 – klaster 1. Urutan universitas terbaik di Indonesia selanjutnya adalah Universitas Gajah Mada atau biasa disingkat UGM. Kampus UGM terletak di Yogyakarta dan sudah didirikan sejak tahun 1949. UGM memang konsisten menempati posisi 1 daftar universitas terbaik di Indonesia. Dengan statusnya sebagai PTN.\n" +
                        "Singkatan : UGM\n" +
                        "Kota : Sleman, Yogyakarta\n" +
                        "Didirikan : 19 Desember 1949\n");
                break;

            case "InstitutPertanianBogor":
                GetIcon.setImageResource(R.drawable.ipb);
                GetText.setText("Dengan skor 3.577 – klaster 1. Sama seperti ITB, Institut Pembangunan Bogor adalah perguruan tinggi berbentuk institut yang berada di provinsi Jawa Barat, tepatnya di kota Bogor. IPB lebih berfokus di bidang pertanian, meski banyak juga jurusan non-agragris. IPB konsisten masuk dalam daftar universitas terbaik di Indonesia di peringkat 10 besar.\n" +
                        "Singkatan : IPB\n" +
                        "Kota : Bogor, Jawa Barat\n" +
                        "Didirikan : 1 September 1963\n");
                break;

            case "InstitutTeknologiSepuluhNopember":
                GetIcon.setImageResource(R.drawable.its);
                GetText.setText("Dengan skor 3.462 – klaster 1. Tak lengkap membahas daftar ranking universitas di Indonesia terbaru tanpa memasukkan universitas di Surabaya. Singkatan dari ITS adalah Institut Teknologi Sepuluh Nopember dan terletak di daerah Sukolilo, Surabaya. Pertama didirikan di tahun 1957, ITS berfokus untuk mengembangkan bidang teknologi dan maritim Indonesia.\n" +
                        "Singkatan : ITS\n" +
                        "Kota : Surabaya, Jawa Timur\n" +
                        "Didirikan : 10 November 1957\n");
                break;

            case "UniversitasIndonesia":
                GetIcon.setImageResource(R.drawable.ui);
                GetText.setText("Dengan skor 3.401 – klaster 1. Berikutnya dalam daftar perguruan tinggi terbaik di Indonesia adalah Universitas Indonesia atau UI. Letaknya berada di perbatasn kota Depok dan Jakarta, namun sering dianggap sebagai universitas di Jakarta. Kampus negeri di Jakarta ini pertama didirikan di tahun 1849. UI juga pernah beberapa kali menempati peringkat 1 list universitas terfavorit di Indonesia dan termasuk salah satu universitas terbesar di Indonesia.\n" +
                        "Singkatan : UI\n" +
                        "Kota : Depok, Jawa Barat\n" +
                        "Didirikan : 1849\n");
                break;

            case "UniversitasDiponegoro":
                GetIcon.setImageResource(R.drawable.undip);
                GetText.setText("Dengan skor 3.207 – klaster 1. UNDIP juga termasuk dalam urutan universitas terbaik se Indonesia ini. UNDIP atau Universitas Diponegoro terletak di kota Semarang, dan layak dianggap sebagai universitas terbaik di Jawa Tengah. Letaknya yang cukup strategis serta pilihan jurusan yang bervariasi membuat UNDIP jadi salah satu rekomendasi tempat kuliah terbaik di Indonesia yang enak.\n" +
                        "Singkatan : UNDIP\n" +
                        "Kota : Semarang, Jawa Tengah\n" +
                        "Didirikan : 9 Januari 1957\n");
                break;

            case "UniversitasAirlangga":
                GetIcon.setImageResource(R.drawable.unair);
                GetText.setText("Dengan skor 3.056 – klaster 1. Satu lagi kampus negeri di Surabaya yang masuk 10 besar peringkat perguruan tinggi terbaik di Indonesia, apa lagi kalau bukan UNAIR. Universitas Airlangga atau UNAIR mungkin paling pas jika disebut sebagai universitas terbaik di Surabaya. UNAIR terkenal sebagai kampus yang memiliki kredibililtas dan moralitas tinggi serta salah satu universitas terbaik di Jawa Timur.\n" +
                        "Singkatan : UNAIR\n" +
                        "Kota : Surabaya, Jawa Timur\n" +
                        "Didirikan : 10 November 1954\n");
                break;

            case "UniversitasHasanuddin":
                GetIcon.setImageResource(R.drawable.hasanuddin);
                GetText.setText("Dengan skor 3.036 – klaster 1. Tidak mau kalah dengan yang di jawa, Universitas Hasanuddin, masuk di daftar universitas terbaik. Universitas Hasanuddin yang kemudian disingkat UNHAS, merupakan sebuah perguruan tinggi negeri di kota Makassar, Provinsi Sulawesi Selatan, Indonesia, yang berdiri pada 10 September 1956.\n" +
                        "Singkatan : UNHAS\n" +
                        "Kota : Makassar, Provinsi Sulawesi Selatan\n" +
                        "Didirikan : 10 September 1956\n");
                break;

            case "UniversitasBrawijaya":
                GetIcon.setImageResource(R.drawable.brawijaya);
                GetText.setText("Dengan skor 2.948 – klaster 1. Tidak mau ketinggalan dari universitas di surabaya, Universitas Brawijaya juga menjadi salah satu universitas terbaik di Jawa Timur. Universitas Brawijaya atau UB didirikan di tahun 1963 dan terletak di kota Malang. Dulunya singkatan universitas ini adalah UNIBRAW, namun kemudian disederhanakan lagi menjadi UB sampai sekarang.\n" +
                        "Singkatan : UB\n" +
                        "Kota : Malang, Jawa Timur\n" +
                        "Didirikan : 5 Januari 1963\n");
                break;

            case "UniversitasPadjadjaran":
                GetIcon.setImageResource(R.drawable.unpad);
                GetText.setText("Dengan skor 2.906 – klaster 1. Tidak mau kalah dengan tetangganya ITB, Universitas Padjadjaran atau yang sering dikenal UNPAD menjadi universitas terbaik ke 10. UNPAD merupakan salah satu perguruan tinggi negeri yang terletak di Bandung, Jawa Barat, Indonesia.\n" +
                        "Singkatan : UNPAD\n" +
                        "Kota : Bandung, Jawa Barat\n" +
                        "Didirikan :  11 September 1957\n");
                break;
        }
    }
}