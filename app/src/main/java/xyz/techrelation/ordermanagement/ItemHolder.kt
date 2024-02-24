package xyz.techrelation.ordermanagement

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemHolder(item: View) : RecyclerView.ViewHolder(item)  {
    val item_queueID: TextView = item.findViewById(R.id.item_id)
    val item_time: TextView = item.findViewById(R.id.item_time)
    val item_taiyaki_normal: TextView = item.findViewById(R.id.item_taiyaki_normal)
    val item_taiyaki_special: TextView = item.findViewById(R.id.item_taiyaki_special)
    val item_dango: TextView = item.findViewById(R.id.item_dango)
    val item_zenzai: TextView = item.findViewById(R.id.item_zenzai)
    val item_payment: TextView = item.findViewById(R.id.item_payment)
    val item_remarks: TextView = item.findViewById(R.id.item_remarks)

    var nc_taiyaki_normal: Boolean = false
    var nc_taiyaki_special: Boolean = false
    var nc_dango: Boolean = false
    var nc_zenzai: Boolean = false
    var nc_payment: Boolean = false
}