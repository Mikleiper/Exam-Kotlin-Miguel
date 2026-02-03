package cat.example.exam_miguel

data class Tasca(
    val id: Int,
    val nom: String,
    val categoria: Categoria,
    val data: String,
    val estat: Estat
)