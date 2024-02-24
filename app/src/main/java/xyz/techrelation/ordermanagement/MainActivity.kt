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
            Order("999A\uD83C\uDF7D",false,"12:00","1",true,"0",false,"0",false,"0",false,360,true,"test1"),
            Order("999B\uD83D\uDECD",true, "12:10","0",false,"0",false,"1",true,"0",false,360,true,"test1"),
            Order("1000\uD83C\uDF7D",false,"12:10","0",false,"2",true,"0",false,"0",false,260,true,"test2"),
            Order("1001\uD83C\uDF7D",false,"12:13","1",true,"0",false,"1",true,"0",false,240,true,"test3"),
            Order("1002\uD83D\uDECD",true,"12:14","3",true,"0",false,"1",true,"0",false,480,true,"test4"),
            Order("Alice\uD83C\uDF7D",false,"12:20","0",false,"1",true,"0",false,"1",true,680,true,"test5"),
            Order("1004\uD83D\uDECD",true,"12:24","2,1",true,"0",false,"0",false,"0",false,360,true,"test6"),
            Order("1005\uD83D\uDECD",true,"12:26","1",true,"0",false,"0",false,"0",false,120,true,"test7"),
            Order("1006\uD83D\uDECD",true,"12:29","1",true,"0",false,"0",false,"0",false,120,true,"test8"),
            Order("1007\uD83C\uDF7D",false,"12:40","1",false,"0",false,"1",true,"0",false,240,true,"test9"),
            Order("Bob\uD83C\uDF7D",false,"12:42","1",true,"0",false,"1",true,"0",false,240,true,"test10"),
            Order("1008\uD83C\uDF7D",false,"12:44","0",false,"0",false,"1",true,"0",false,120,true,"test11"),
            Order("1009\uD83C\uDF7D",false,"12:48","0",false,"3",true,"0",false,"0",false,390,true,"test12"),
            Order("1010\uD83C\uDF7D",false,"12:49","1",true,"0",false,"0",false,"2",true,1120,true,"test13"),
            Order("1011\uD83D\uDECD",true,"12:50","1",true,"1",true,"1",true,"0",false,360,true,"test14"),
            Order("Charlie\uD83C\uDF7D",false,"12:52","0",false,"1",true,"0",false,"1",true,680,true,"test15"),
            Order("1012A\uD83C\uDF7D",false,"12:55","0",false,"1(6)",true,"0",false,"0",false,780,true,"test16"),
            Order("1012B\uD83D\uDECD", true,"12:58","0",false,"5(6)",true,"0",false,"0",false,780,true,"test16"),
            Order("1013\uD83D\uDECD",true,"12:59","1",true,"0",false,"0",false,"0",false,120,true,"test17"),
            Order("1014\uD83C\uDF7D",false,"13:00","1",true,"0",false,"0",false,"0",false,500,true,"test18"),
            Order("1015\uD83D\uDECD",true,"13:05","2,3,1",true,"0",false,"1",true,"0",false,840,true,"test19"),
            Order("Dave\uD83C\uDF7D",false,"13:10","1",true,"0",false,"1",true,"0",false,240,true,"test20")

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