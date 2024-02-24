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

            item_taiyaki_normal.text = order.item_taiyaki_normal.toString()
            nc_taiyaki_normal = order.nc_taiyaki_normal
            if(!nc_taiyaki_normal && order.item_taiyaki_normal != "0"){
                item_taiyaki_normal.setTextColor(Color.parseColor("#CAC4D0") )
            }

            item_taiyaki_special.text = order.item_taiyaki_special.toString()
            nc_taiyaki_special = order.nc_taiyaki_special
            if(!nc_taiyaki_special && order.item_taiyaki_special != "0"){
                item_taiyaki_special.setTextColor(Color.parseColor("#CAC4D0") )
            }

            item_dango.text = order.item_dango.toString()
            nc_dango = order.nc_dango
            if(!nc_dango && order.item_dango != "0"){
                item_dango.setTextColor(Color.parseColor("#CAC4D0") )
            }

            item_zenzai.text = order.item_zenzai.toString()
            nc_zenzai = order.nc_zenzai
            if(!nc_zenzai && order.item_zenzai != "0"){
                item_zenzai.setTextColor(Color.parseColor("#CAC4D0") )
            }

            item_payment.text = order.item_payment.toString()
            nc_payment = order.nc_payment
            if(!nc_payment){
                item_payment.setTextColor(Color.parseColor("#CAC4D0") )
            }

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
                if (nc_taiyaki_normal){
                    item_taiyaki_normal.setTextColor(Color.parseColor("#03DAC5"))
                    nc_taiyaki_normal = false
                    Toast.makeText(item_taiyaki_normal.getContext(), list[position].toString()+"Taiyaki_normal", Toast.LENGTH_SHORT).show()
                }else if (!nc_taiyaki_normal && order.item_taiyaki_normal != "0" ){
                    item_taiyaki_normal.setTextColor(Color.parseColor("#CAC4D0") )
                    nc_taiyaki_normal = true
                }
            }

            item_taiyaki_special.setOnClickListener {
                if (nc_taiyaki_special){
                    item_taiyaki_special.setTextColor(Color.parseColor("#03DAC5"))
                    nc_taiyaki_special = false
                    Toast.makeText(item_taiyaki_special.getContext(), list[position].toString()+"Taiyaki_special", Toast.LENGTH_SHORT).show()
                }else if (!nc_taiyaki_special && order.item_taiyaki_special != "0" ){
                    item_taiyaki_special.setTextColor(Color.parseColor("#CAC4D0") )
                    nc_taiyaki_special = true
                }
            }

            item_dango.setOnClickListener{
                if(order.nc_dango) {
                    item_dango.setTextColor(Color.parseColor("#03DAC5"))
                    order.nc_dango = false
                }else if (!nc_dango && order.item_dango != "0" ){
                    item_dango.setTextColor(Color.parseColor("#CAC4D0"))
                    order.nc_dango = true
                }
            }

            item_zenzai.setOnClickListener{
                if(nc_zenzai) {
                    item_zenzai.setTextColor(Color.parseColor("#03DAC5"))
                    nc_zenzai = false
                }else if (!nc_zenzai && order.item_zenzai != "0" ){
                    item_zenzai.setTextColor(Color.parseColor("#CAC4D0"))
                    nc_zenzai = true
                }
            }

            item_payment.setOnClickListener {
                if(nc_payment){
                    item_payment.setTextColor(Color.parseColor("#03DAC5"))
                    nc_payment = false
                }else{
                    item_payment.setTextColor(Color.parseColor("#FFDE03"))
                    nc_payment = true
                }
            }
        }
    }

    override fun getItemCount(): Int = list.size

}