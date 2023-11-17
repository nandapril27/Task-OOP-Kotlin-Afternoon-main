package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun main() {
        try {
            // Bagian kode yang mungkin menyebabkan exception
            val result = divide(10, 2)
            println("Hasil pembagian : $result")
        } catch (e: ArithmeticException) {
            // Menangani exception ArithmeticException
            println("Terjadi kesalahan aritmatika : ${e.message}")
        } catch (e: Exception) {
            // Menangani exception umum
            println("Terjadi kesalahan : ${e.message}")
        } finally {
            // Bagian yang akan dijalankan selalu, terlepas dari apakah exception terjadi atau tidak
            println("Proses selesai !")
        }
    }

fun divide(a: Int, b: Int): Int {
    // Fungsi untuk membagi dua angka
    return a / b
}
