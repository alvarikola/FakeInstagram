data class Publicacion(val fotoAutor: String, val autor: String, val foto: String, val descripcion: String)

data class Cuenta(val nombreCuenta: String, val fotoCuenta: String)


val cuentaSugerida = listOf<Cuenta>(
    Cuenta("Alejandro", "fotoFuego"),
    Cuenta("Maria", "fotoFuego"),
    Cuenta("Yoel", "fotoFuego"),
    Cuenta("Samuel", "fotoFuego"),
)
val historias = listOf<Cuenta>(
    Cuenta("Lucas", "fotoFuego"),
    Cuenta("Andrei", "fotoFuego"),
    Cuenta("David", "fotoFuego"),
    Cuenta("Aday", "fotoFuego"),
)

val publicaciones = listOf<Publicacion>(
    Publicacion("fotoAutor", "Alvaro", "foto", "Una mañana en la playa"),
    Publicacion("fotoAutor", "Zsofia", "foto", "Always with you"),
    Publicacion("fotoAutor", "Javier", "foto", "Iron Man"),
)

