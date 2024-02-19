package xyz.techrelation.ordermanagement

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
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

            item_taiyaki_normal.setOnClickListener {
                Toast.makeText(item_taiyaki_normal.getContext(), list[position].toString()+"Taiyaki_normal", Toast.LENGTH_SHORT).show();
            }

            item_taiyaki_special.setOnClickListener {
                Toast.makeText(item_taiyaki_special.getContext(), list[position].toString()+"Taiyaki_special", Toast.LENGTH_SHORT).show();
            }

            item_dango.setOnClickListener{
                Toast.makeText(item_dango.getContext(), list[position].toString()+"dango", Toast.LENGTH_SHORT).show();
            }

            item_zenzai.setOnClickListener{
                Toast.makeText(item_zenzai.getContext(), list[position].toString()+"zenzai", Toast.LENGTH_SHORT).show();
            }
        }
    }

    override fun getItemCount(): Int = list.size
}