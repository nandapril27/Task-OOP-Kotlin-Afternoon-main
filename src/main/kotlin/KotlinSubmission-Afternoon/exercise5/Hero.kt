package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name  : $name")
        println("Age   : $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan(steps: Int) {
        checkHealth()
        println("$name sedang berjalan $steps langkah..")
        health -= 1 * steps
    }

    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */

    fun lari(steps: Int) {
        checkHealth()
        println("$name sedang berlari $steps langkah...")
        health -= 2 * steps
    }

    fun makan(times: Int) {
        checkHealth()
        println("$name sedang makan $times kali...")
        health += 2 * times
    }

    fun minum(times: Int) {
        checkHealth()
        println("$name sedang minum $times kali...")
        health += 2 * times
    }

    fun lompat(times: Int){
        checkHealth()
        println("$name sedang lompat $times kali...")
        health -= 2 * times
    }

    fun duduk(times: Int){
        checkHealth()
        println("$name sedang duduk $times kali...")
        health += 1 * times
    }

}

