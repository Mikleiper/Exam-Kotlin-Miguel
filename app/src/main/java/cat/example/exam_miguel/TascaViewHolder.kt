package cat.example.exam_miguel

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nom: TextView = view.findViewById(R.id.tvNom)
    private val categoria: TextView = view.findViewById(R.id.tvCategoria)
    private val data: TextView = view.findViewById(R.id.tvData)
    private val estat: TextView = view.findViewById(R.id.tvEstat)

    fun renderitza(tasca: Tasca) {
        tvNom.text = tasca.nom
        tvCategoria.text = categoria.nom
        tvData.text = tasca.data
        tvEstat.text = estat.nom
    }
}
