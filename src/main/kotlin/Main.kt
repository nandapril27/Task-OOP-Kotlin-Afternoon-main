import id.infinitelearning.KotlinSubmission.exercise1.groupDetail
import id.infinitelearning.KotlinSubmission.exercise1.myProfile
import id.infinitelearning.KotlinSubmission.exercise1.myTeam

fun main(args: Array<String>) {

    // Memanggil fungsi myProfile untuk menampilkan informasi
    myProfile()

    val groupId = "OmniDev"
    val members = listOf("Faqih", "Eva", "Maya", "Nanda", "Hasan", "Ilham")
    val session = "Afternoon"

    // Memanggil fungsi groupDetail
    val groupDetailResult = groupDetail(groupId, members, session)
    println(groupDetailResult)

    // Memanggil fungsi myTeam
    val result = myTeam()


    // Menampilkan nilai kembalian ke layar
    println("Anggota tim saya: $result")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}