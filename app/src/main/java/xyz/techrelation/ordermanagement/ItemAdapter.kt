package xyz.techrelation.ordermanagement

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.NotificationCompat.getColor
import androidx.recyclerview.widget.RecyclerView


class ItemAdapter(val list: List<Order>, val selectedTable: Int) : RecyclerView.Adapter<ItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item_view, parent, false)
        return ItemHolder(itemView)
    }

    @SuppressLint("ResourceAsColor")
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

            when (selectedTable){
                0 -> {
                    item_queueID.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_time.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_dango.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_zenzai.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_payment.setBackgroundResource(R.drawable.frame_style_notserved)
                    item_remarks.setBackgroundResource(R.drawable.frame_style_notserved)
                }
                1 -> {
                    item_queueID.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_time.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_dango.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_zenzai.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_payment.setBackgroundResource(R.drawable.frame_style_notpaid)
                    item_remarks.setBackgroundResource(R.drawable.frame_style_notpaid)
                }
                2 -> {
                    item_queueID.setBackgroundResource(R.drawable.frame_style_done)
                    item_time.setBackgroundResource(R.drawable.frame_style_done)
                    item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_done)
                    item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_done)
                    item_dango.setBackgroundResource(R.drawable.frame_style_done)
                    item_zenzai.setBackgroundResource(R.drawable.frame_style_done)
                    item_payment.setBackgroundResource(R.drawable.frame_style_done)
                    item_remarks.setBackgroundResource(R.drawable.frame_style_done)
                }
            }

            item_taiyaki_normal.setOnClickListener {
                item_taiyaki_normal.setTextColor(Color.parseColor("#FF03DAC5"))
                Toast.makeText(item_taiyaki_normal.getContext(), list[position].toString()+"Taiyaki_normal", Toast.LENGTH_SHORT).show();
            }

            item_taiyaki_special.setOnClickListener {
                item_taiyaki_special.setTextColor(Color.parseColor("#FF03DAC5"))
                //Toast.makeText(item_taiyaki_special.getContext(), list[position].toString()+"Taiyaki_special", Toast.LENGTH_SHORT).show();
            }

            item_dango.setOnClickListener{
                item_dango.setTextColor(Color.parseColor("#FF03DAC5"))
                //Toast.makeText(item_dango.getContext(), list[position].toString()+"dango", Toast.LENGTH_SHORT).show();
            }

            item_zenzai.setOnClickListener{
                item_zenzai.setTextColor(Color.parseColor("#FF03DAC5"))
                //Toast.makeText(item_zenzai.getContext(), list[position].toString()+"zenzai", Toast.LENGTH_SHORT).show();
            }

            item_payment.setOnClickListener {
                item_payment.setTextColor(Color.parseColor("#FF03DAC5"))
                //Toast.makeText(item_taiyaki_special.getContext(), list[position].toString()+"Taiyaki_special", Toast.LENGTH_SHORT).show();
            }
        }
    }

    override fun getItemCount(): Int = list.size

}