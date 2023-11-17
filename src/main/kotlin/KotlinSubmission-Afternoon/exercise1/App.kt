package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Mengisi variabel sesuai dengan ketentuan
    val firstName: String = "Nanda Aprillia"
    val lastName: String = "Lestari Mufti"
    val age: Int = 20
    val isSingle: Boolean = true

    // Menampilkan nilai variabel ke layar
    println("Nama Depan    : $firstName")
    println("Nama Belakang : $lastName")
    println("Umur          : $age tahun")
    println("Status        : ${if (isSingle) "Single" else "Tidak Single"}")
}

/**
 * Latihan 2
 * Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMembers: List<Any>, session: String): Any {
    println("Detail Grup:")
    println("Group ID: $groupId")

    // Mencetak anggota grup
    println("Anggota Grup:")
    for (member in groupMembers) {
        println("- $member")
    }

    println("Sesi: $session")

    // Anda dapat mengembalikan nilai lain sesuai kebutuhan
    return "Proses selesai"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    // Buat variable yang berisi daftar anggota group kamu
    val groupMembers = listOf("Faqih", "Eva", "Maya", "Nanda", "Hasan", "Ilham")

    // Akses item yang berisi nama Anda dari variable tersebut
    val myName = groupMembers[3]

    // Jadikan nilai kembalian untuk fungsi myTeam ini
    return listOf(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    // Contoh daftar mentor dan anggota grup
    val mentor = arrayOf("Kak Yogi", "Kak Hasan")
    val countOfGroup = listOf("Faqih", "Eva", "Maya", "Nanda", "Hasan", "Ilham")

    // Menghitung total mentor + jumlah anggota grup
    return mentor.size + countOfGroup.size
}

fun main() {
    // Memanggil fungsi myProfile
    myProfile()

    // Memanggil fungsi myTeam dan menampilkan hasilnya
    val myTeam = myTeam()
    println("My team is: $myTeam")

    // Memanggil fungsi totalMember dan menampilkan hasilnya
    val totalMember = totalMember()
    println("Total Member group : $totalMember")

/**
*  Latihan 5
*  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
*
*/
    // Memanggil fungsi groupDetail dengan nilai argumen yang telah diubah
    val groupId = "OmniDev"
    val members = listOf("Faqih", "Eva", "Maya", "Nanda", "Hasan", "Ilham")
    val session = "Afternoon"
    val result = groupDetail(groupId, members, session)
    println(result)
}
