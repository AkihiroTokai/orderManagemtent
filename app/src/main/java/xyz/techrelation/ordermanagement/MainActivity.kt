package xyz.techrelation.ordermanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var notServed: TextView
    private lateinit var notPaid: TextView
    private lateinit var done: TextView
    private lateinit var queueID: TextView
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

        queueID = this.findViewById(R.id.queueID)
        time = this.findViewById(R.id.time)
        taiyaki_normal = this.findViewById(R.id.taiyaki_normal)
        taiyaki_special = this.findViewById(R.id.taiyaki_special)
        dango = this.findViewById(R.id.dango)
        zenzai = this.findViewById(R.id.zenzai)
        payment = this.findViewById(R.id.payment)
        remarks = this.findViewById(R.id.remarks)
        recyclerView = this.findViewById(R.id.recyclerView)





        val testOrders = arrayListOf(
            Order("999A\uD83C\uDF7D","12:00","0","0","0","0","500","test1"),
            Order("999B\uD83D\uDECD", "12:10","0","0","1","0","500","test1"),
            Order("1000\uD83C\uDF7D","12:10","0","2","0","0","260","test2"),
            Order("1002\uD83C\uDF7D","12:13","1","0","1","0","240","test3"),
            Order("1003\uD83D\uDECD","12:14","3","0","1","0","480","test4"),
            Order("Alice\uD83C\uDF7D","12:20","0","1","0","1","680","test5"),
            Order("1004\uD83D\uDECD","12:24","2,1","0","0","0","360","test6"),
            Order("1005\uD83D\uDECD","12:26","1","0","0","0","120","test7"),
            Order("1006\uD83D\uDECD","12:29","1","0","0","0","120","test8"),
            Order("999C\uD83C\uDF7D","12:35","1","0","0","0","500","test1"),
            Order("1007\uD83C\uDF7D","12:40","1","0","1","0","240","test9"),
            Order("Bob\uD83C\uDF7D","12:42","1","0","1","0","240","test10"),
            Order("1008\uD83C\uDF7D","12:44","0","0","1","0","120","test11"),
            Order("1009\uD83C\uDF7D","12:48","0","3","0","0","390","test12"),
            Order("1010\uD83C\uDF7D","12:49","1","0","0","2","1120","test13"),
            Order("1011\uD83D\uDECD","12:50","1","1","1","0","360","test14"),
            Order("Charlie\uD83C\uDF7D","12:52","0","1","0","1","680","test15"),
            Order("1012A\uD83C\uDF7D","12:55","0","1(6)","0","0","780","test16"),
            Order("1012B\uD83D\uDECD", "12:58","0","5(6)","0","0","780","test16"),
            Order("1013\uD83D\uDECD","12:59","1","0","0","0","120","test17"),
            Order("1014\uD83C\uDF7D","13:00","1","0","0","0","500","test18"),
            Order("1015\uD83D\uDECD","13:05","2,3,1","0","1","0","840","test19"),
            Order("Dave\uD83C\uDF7D","13:10","1","0","1","0","240","test20"),

        )

        var adapter = ItemAdapter(testOrders,selectedTable)
        recyclerView.adapter = adapter



        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        notServed.setOnClickListener{
            selectedTable = 0

            queueID.setBackgroundResource(R.drawable.frame_style_notserved)
            time.setBackgroundResource(R.drawable.frame_style_notserved)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notserved)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_notserved)
            dango.setBackgroundResource(R.drawable.frame_style_notserved)
            zenzai.setBackgroundResource(R.drawable.frame_style_notserved)
            payment.setBackgroundResource(R.drawable.frame_style_notserved)
            remarks.setBackgroundResource(R.drawable.frame_style_notserved)

            adapter = ItemAdapter(testOrders,selectedTable)
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }

        notPaid.setOnClickListener{
            selectedTable = 1

            queueID.setBackgroundResource(R.drawable.frame_style_notpaid)
            time.setBackgroundResource(R.drawable.frame_style_notpaid)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_notpaid)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_notpaid)
            dango.setBackgroundResource(R.drawable.frame_style_notpaid)
            zenzai.setBackgroundResource(R.drawable.frame_style_notpaid)
            payment.setBackgroundResource(R.drawable.frame_style_notpaid)
            remarks.setBackgroundResource(R.drawable.frame_style_notpaid)

            adapter = ItemAdapter(testOrders,selectedTable)
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()
        }

        done.setOnClickListener{
            selectedTable = 2

            queueID.setBackgroundResource(R.drawable.frame_style_done)
            time.setBackgroundResource(R.drawable.frame_style_done)
            taiyaki_normal.setBackgroundResource(R.drawable.frame_style_done)
            taiyaki_special.setBackgroundResource(R.drawable.frame_style_done)
            dango.setBackgroundResource(R.drawable.frame_style_done)
            zenzai.setBackgroundResource(R.drawable.frame_style_done)
            payment.setBackgroundResource(R.drawable.frame_style_done)
            remarks.setBackgroundResource(R.drawable.frame_style_done)

            adapter = ItemAdapter(testOrders,selectedTable)
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }


  }

}