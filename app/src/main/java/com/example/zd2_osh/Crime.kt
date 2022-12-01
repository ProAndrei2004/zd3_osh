package com.example.zd2_osh

import java.util.*

data class Crime (val id: UUID=UUID.randomUUID()){
    var title:String = ""
    var date:Date = Date()
    var isSolved: Boolean = false;

}