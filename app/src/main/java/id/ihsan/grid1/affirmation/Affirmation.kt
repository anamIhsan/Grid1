package id.ihsan.grid1.affirmation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import id.ihsan.grid1.R

// Data class 'Affirmation' digunakan untuk menyimpan data afirmasi.
// Ini memiliki dua properti: stringResourceId yang mengacu pada resource string,
// dan imageResourceId yang mengacu pada resource gambar.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

// Kelas 'Datasource' bertujuan untuk menyediakan data afirmasi.
// Metode 'loadAffirmations' akan mengembalikan daftar afirmasi.
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            // Setiap item 'Affirmation' di sini merepresentasikan satu afirmasi
            // dengan string dan gambar yang terhubung.
            Affirmation(R.string.affirmation1, R.drawable.img1),
            Affirmation(R.string.affirmation2, R.drawable.img2),
            Affirmation(R.string.affirmation3, R.drawable.img3),
            Affirmation(R.string.affirmation4, R.drawable.img4),
            Affirmation(R.string.affirmation5, R.drawable.img5),
            Affirmation(R.string.affirmation6, R.drawable.img6))
    }
}
