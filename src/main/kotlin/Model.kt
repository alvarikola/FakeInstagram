data class Publicacion(val fotoAutor: String, val autor: String, val foto: String, val descripcion: String)

data class Cuenta(val nombreCuenta: String, val fotoCuenta: String)


val cuentaSugerida = listOf<Cuenta>(
    Cuenta("Xin Xa", "foto1.jpeg"),
    Cuenta("Sofía", "foto1.jpeg"),
    Cuenta("Yoel", "foto1.jpeg"),
    Cuenta("Samuel", "foto1.jpeg"),
)
val historias = listOf<Cuenta>(
    Cuenta("Xin Xa", "Imagenes/foto1.jpeg"),
    Cuenta("Sofía", "Imagenes/foto3.jpeg"),
    Cuenta("Carmen Rosa", "Imagenes/foto4.jpeg"),
    Cuenta("Akira Junior", "Imagenes/foto6.jpeg"),
)

val publicaciones = listOf<Publicacion>(
    Publicacion("Imagenes/foto1.jpeg", "Alvaro", "Imagenes/amanecer.jpg", "Una mañana en la playa"),
//    Publicacion("foto1.jpeg", "Zsofia", "foto", "Always with you"),
//    Publicacion("foto1.jpeg", "Javier", "foto", "Iron Man"),
)

