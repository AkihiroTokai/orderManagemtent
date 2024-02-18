package xyz.techrelation.ordermanagement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter( val list: List<Order>) : RecyclerView.Adapter<ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item_view, parent, false)
        return ItemHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.apply {
            val order = list[position]
            item_queueID.text = order.item_queueID
            item_time.text = order.item_time
            item_taiyaki_normal.text = order.item_taiyaki_normal
            item_taiyaki_special.text = order.item_taiyaki_special
            item_dango.text = order.item_dango
            item_zenzai.text = order.item_zenzai
            item_payment.text = order.item_payment
            item_remarks.text = order.item_remarks
        }
    }

    override fun getItemCount(): Int = list.size
}