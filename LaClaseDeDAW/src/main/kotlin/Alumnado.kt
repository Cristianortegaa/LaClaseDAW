import extensions.roundTo
import kotlin.math.pow
import kotlin.math.round

data class Alumnado(
    val nombre: String,
    val nota: Double,
    val curso: String
){
    val notaRedondeada: Double
        get() = nota.roundTo(2)
}
