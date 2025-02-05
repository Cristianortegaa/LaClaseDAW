fun main() {
    val alumnos = listOf(
        Alumnado("Juan", 7.5, "DAM"),
        Alumnado("Pedro", 8.5, "DAM"),
        Alumnado("Ana", 9.5, "DAW"),
        Alumnado("María", 8.5, "DAM"),
        Alumnado("José", 9.5, "DAW"),
        Alumnado("Alicia", 7.5, "DAW")
    )

    //Todos los alumnos
    println("Mostrar todos los alumnos: ")
    println("$alumnos\n")

    //Alumnos de DAW
    println("Alumnos de DAW: ")
    val alumnosDAW = alumnos.filter { it.curso == "DAW" }
    println("$alumnosDAW\n")

    //Alumnos con nota >= 8.5
    println("Alumnos con nota >= 8.5: ")
    val alumnosNota = alumnos.filter { it.nota >= 8.5 }
    println("$alumnosNota\n")

    //Lista de Alumnos de DAW con nota >= 8.5 (sobresalientes) y alumnos con otra.
    println("Alumnos de DAW con nota >= 8.5 y alumnos con otra")
    val (sobresaliente, otros) = alumnos.partition { it.nota >= 8.5 && it.curso == "DAW" }
    println("Alumnos >= 8.5: $sobresaliente , otros: $otros\n")

    //Alumnos con nota máxima
    println("Alumnos con nota máxima: ")
    val alumnosNotaMax = alumnos.maxOf { it.nota }
    println("${alumnos.filter { it.nota == alumnosNotaMax}}\n")

    //Nota media de los alumnos de DAW
    println("Nota media de los alumnos de DAW: ")
    val mediaAlumnosDAW = alumnos.filter { it.curso == "DAW" }.map { it.notaRedondeada }.average()
    println("$mediaAlumnosDAW\n")

    //Alumnos que empieza su nombre por A
    println("Alumnos que empieza su nombre por A: ")
    val alumnosInicialA = alumnos.filter { it.nombre.startsWith("A")}
    println("$alumnosInicialA\n")

    //Número de alumnos cuyo nombre empieza por J
    println("Número de alumnos cuyo nombre empieza por J: ")
    val numeroAlumnosInicialJ = alumnos.count { it.nombre.startsWith("J")  }
    println("$numeroAlumnosInicialJ\n")

    //Alumnado agrupado por grupo
    println("Alumnado agrupado por grupo")
    val agrupadosGrupo = alumnos.groupBy { it.curso }
    println("$agrupadosGrupo\n")

    //Número de alumnos agrupados por grupo
    println("Número de alumnos agrupados por grupo: ")
    val numeroAgrupadosGrupo = alumnos.groupingBy { it.curso }.eachCount()
    println("$numeroAgrupadosGrupo\n")

    //Alumnado agrupado por nota mayor que 8.5
    println("Alumnado agrupado por nota mayor que 8.5: ")
    val agrupadoNota = alumnos.groupBy { it.nota > 8.5 }
    println("$agrupadoNota\n")

    //Alumnado ordenado por nota descendente
    println("Alumnado ordenado por nota descendente: ")
    val notaDescendente = alumnos.sortedByDescending { it.nota }
    println("$notaDescendente\n")

    //Buscar alumnos con nota >= 8.5
    println("Buscar alumnos con nota >= 8.5: ")
    val notaMayor = alumnos.filter { it.nota >= 8.5 }
    println("$notaMayor\n")

    //Buscar alumnos con nota >= 8.5 y curso DAW
    println("Buscar alumnos con nota >= 8.5 y curso DAW: ")
    val notaCurso = alumnos.filter { it.curso == "DAW" && it.nota >= 8.5 }
    println("$notaCurso\n")

    //Número de alumnos agrupados por nota mayor que 8.5
    println("Número de alumnos agrupados por nota mayor que 8.5: ")
    val agrupadosNota = alumnos.groupingBy { it.nota > 8.5 }.eachCount()
    println("$agrupadosNota\n")

    //Alumnos agrupados por la primera letra de nombre
    println("Alumnos agrupados por la primera letra de nombre: ")
    val agrupadosPrimeraLetra = alumnos.groupBy { it.nombre.first() }
    println("$agrupadosPrimeraLetra\n")

    //Número de alumnos agrupados por la primera letra de nombre
    println("Número de alumnos agrupados por la primera letra de nombre: ")
    val numeroAgrupadosLetra = alumnos.groupingBy { it.nombre.first() }.eachCount()
    println("$numeroAgrupadosLetra\n")

    //Alumnado paginado de 2 en dos con desplazamiento igual al tamaño de la página
    println("Alumnado paginado de 2 en dos con desplazamiento igual al tamaño de la página: ")
    println(alumnos.windowed(2,2))


}