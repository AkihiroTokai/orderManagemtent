package xyz.techrelation.ordermanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var notServed: TextView
    private lateinit var notPaid: TextView
    private lateinit var done: TextView
    private lateinit var id: TextView
    private lateinit var time: TextView
    private lateinit var taiyaki_normal: TextView
    private lateinit var taiyaki_special: TextView
    private lateinit var dango: TextView
    private lateinit var zenzai: TextView
    private lateinit var payment: TextView
    private lateinit var remarks: TextView

    private lateinit var recyclerView: RecyclerView

    private lateinit var item_id: TextView
    private lateinit var item_time: TextView
    private lateinit var item_taiyaki_normal: TextView
    private lateinit var item_taiyaki_special: TextView
    private lateinit var item_dango: TextView
    private lateinit var item_zenzai: TextView
    private lateinit var item_payment: TextView
    private lateinit var item_remarks: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTable = 0

        notServed = this.findViewById(R.id.notServed)
        notPaid = this.findViewById(R.id.notPaid)
        done = this.findViewById(R.id.done)

        id = this.findViewById(R.id.id)
        time = this.findViewById(R.id.time)
        taiyaki_normal = this.findViewById(R.id.taiyaki_normal)
        taiyaki_special = this.findViewById(R.id.taiyaki_special)
        dango = this.findViewById(R.id.dango)
        zenzai = this.findViewById(R.id.zenzai)
        payment = this.findViewById(R.id.payment)
        remarks = this.findViewById(R.id.remarks)

        recyclerView = this.findViewById(R.id.recyclerView)

        item_id = this.findViewById(R.id.item_id)
        item_time = this.findViewById(R.id.item_time)
        item_taiyaki_normal = this.findViewById(R.id.item_taiyaki_normal)
        item_taiyaki_special = this.findViewById(R.id.item_taiyaki_special)
        item_dango = this.findViewById(R.id.item_dango)
        item_zenzai = this.findViewById(R.id.item_zenzai)
        item_payment = this.findViewById(R.id.item_payment)
        item_remarks = this.findViewById(R.id.item_remarks)


        notServed.setOnClickListener{
            selectedTable = 0

            id.setBackgroundResource(R.drawable.frame_style_notserved)
            time.setBackgroundResource(R.drawable.frame_style_notserved)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notserved)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_notserved)
            dango.setBackgroundResource(R.drawable.frame_style_notserved)
            zenzai.setBackgroundResource(R.drawable.frame_style_notserved)
            payment.setBackgroundResource(R.drawable.frame_style_notserved)
            remarks.setBackgroundResource(R.drawable.frame_style_notserved)

            item_id.setBackgroundResource(R.drawable.frame_style_notserved)
            item_time.setBackgroundResource(R.drawable.frame_style_notserved)
            item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notserved)
            item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_notserved)
            item_dango.setBackgroundResource(R.drawable.frame_style_notserved)
            item_zenzai.setBackgroundResource(R.drawable.frame_style_notserved)
            item_payment.setBackgroundResource(R.drawable.frame_style_notserved)
            item_remarks.setBackgroundResource(R.drawable.frame_style_notserved)

        }

        notPaid.setOnClickListener{
            selectedTable = 1

            id.setBackgroundResource(R.drawable.frame_style_notpaid)
            time.setBackgroundResource(R.drawable.frame_style_notpaid)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notpaid)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_notpaid)
            dango.setBackgroundResource(R.drawable.frame_style_notpaid)
            zenzai.setBackgroundResource(R.drawable.frame_style_notpaid)
            payment.setBackgroundResource(R.drawable.frame_style_notpaid)
            remarks.setBackgroundResource(R.drawable.frame_style_notpaid)

            item_id.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_time.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_dango.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_zenzai.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_payment.setBackgroundResource(R.drawable.frame_style_notpaid)
            item_remarks.setBackgroundResource(R.drawable.frame_style_notpaid)
        }

        done.setOnClickListener{
            selectedTable = 2

            id.setBackgroundResource(R.drawable.frame_style_done)
            time.setBackgroundResource(R.drawable.frame_style_done)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_done)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_done)
            dango.setBackgroundResource(R.drawable.frame_style_done)
            zenzai.setBackgroundResource(R.drawable.frame_style_done)
            payment.setBackgroundResource(R.drawable.frame_style_done)
            remarks.setBackgroundResource(R.drawable.frame_style_done)

            item_id.setBackgroundResource(R.drawable.frame_style_done)
            item_time.setBackgroundResource(R.drawable.frame_style_done)
            item_taiyaki_normal.setBackgroundResource(R.drawable.frame_style_done)
            item_taiyaki_special.setBackgroundResource(R.drawable.frame_style_done)
            item_dango.setBackgroundResource(R.drawable.frame_style_done)
            item_zenzai.setBackgroundResource(R.drawable.frame_style_done)
            item_payment.setBackgroundResource(R.drawable.frame_style_done)
            item_remarks.setBackgroundResource(R.drawable.frame_style_done)
        }



  }
}