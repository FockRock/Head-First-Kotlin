package lesson4

class Song (
        private val title: String,
        private val artist: String
) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}


fun main() {
    val songOne = Song("F.E.B.N.", "Trash Talk")
    val songTwo = Song("High Road", "Mastodon")
    val songThree = Song("Church of the Motherfuckers", "Dead Cross")

    songOne.play()
    songOne.stop()
    songThree.play()
    songThree.stop()
}