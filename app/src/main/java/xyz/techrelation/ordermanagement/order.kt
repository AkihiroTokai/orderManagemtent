package xyz.techrelation.ordermanagement


data class Order (
    var item_queueID: String = "999A",
    var item_time: String = "00:00",
    var item_taiyaki_normal: String = "0",
    var item_taiyaki_special: String = "0",
    var item_dango: String = "0",
    var item_zenzai: String = "0",
    var item_payment: String = "0",
    var item_remarks: String = "test",
)