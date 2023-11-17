package id.infinitelearning.KotlinSubmission.exercise2
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    // Membuat list untuk menyimpan bilangan genap dari 1 hingga 100
        val evenNumbers = mutableListOf<Int>()

        // Menggunakan for loop dan logika if untuk mengisi bilangan genap pada list
        for (number in 1..100) {
            if (number % 2 == 0) {
                evenNumbers.add(number)
            }
        }

        // Menampilkan isi list
        println("List bilangan genap dari 1 hingga 100:")
        println(evenNumbers)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini
     */
    // Membuat Map untuk menyimpan daftar nama bulan dalam setahun
    val monthMap = mapOf(
    "Jan" to "January",
    "Feb" to "February",
    "Mar" to "March",
    "Apr" to "April",
    "May" to "May",
    "Jun" to "June",
    "Jul" to "July",
    "Aug" to "August",
    "Sep" to "September",
    "Oct" to "October",
    "Nov" to "November",
    "Dec" to "December"
    )

    // Menampilkan judul untuk isi Map
    println("")
    println("Daftar nama bulan dalam setahun:")

    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini
    */
    // Menampilkan isi Map dengan format menggunakan forEach
    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    // Mendapatkan bulan sekarang
    val monthNow = LocalDate.now().month.getDisplayName(TextStyle.FULL, Locale.getDefault())

    // Menetapkan bulan lahir
    val birthMonth = "April"

    // Menampilkan hasil dengan format string yang diinginkan
    println("")
    println("It's $monthNow now, I was born in $birthMonth")



}
