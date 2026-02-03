package cat.example.exam_miguel

import android.view.LayoutInflater

class TasquesAdapter(
    private val tasques : list<Tasca>(),
    private val onItemClick: Tasca) -> Unit
) : RecyclerView.Adapter<TascaViewHolder>() {

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        holder.renderitza(tasques[position])
    }

}