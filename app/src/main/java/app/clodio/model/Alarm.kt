package app.clodio.model

import java.time.LocalTime
import kotlin.random.Random

data class Alarm(
    val time: LocalTime,
    val name: String,
    val enabled: Boolean,
    val daysEnabled: MutableList<Boolean>
) {
    companion object {
        fun getRandomAlarm(): Alarm {
            return Alarm(
                time = LocalTime.of(
                    Random.nextInt(0, 24),
                    Random.nextInt(0, 60),
                ),
                name = "Alarm ${Random.nextInt(0, 1000)}",
                enabled = Random.nextBoolean(),
                daysEnabled = (1..7).map { Random.nextBoolean() }.toMutableList()
            )
        }
    }
}