package xyz.techrelation.ordermanagement


data class Order (
    var item_queueID: String = "999A",
    var item_type: String = "EI",
    var item_time: String = "00:00",
    var item_taiyaki_normal: String = "0",
    var nc_taiyaki_normal:Boolean = false,
    var item_taiyaki_special: String = "0",
    var nc_taiyaki_special:Boolean = false,
    var item_dango: String = "0",
    var nc_dango:Boolean = false,
    var item_zenzai: String = "0",
    var nc_zenzai:Boolean = false,
    var item_payment: String = "0",
    var nc_payment:Boolean = false,
    var item_remarks: String = "test",
)