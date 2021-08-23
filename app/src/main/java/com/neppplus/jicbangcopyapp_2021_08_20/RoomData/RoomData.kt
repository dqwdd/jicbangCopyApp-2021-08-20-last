package com.neppplus.jicbangcopyapp_2021_08_20.RoomData

import java.text.NumberFormat
import java.util.*

class RoomData (
    val place : String,
    val price : Int,
    val floor : Int,
    val description : String ) {
    
    fun getFormattedFloor() : String {
//        ${} 검색
        if(this.floor > 0) {
            return "${this.floor}"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
//            그냥 "지하 ${-this.floor}층"하면 지하 -2층 떠서 '-' 더 붙여서 양수로 만들어야 함츠
        }
    }
    
    

//        추가 기능 (1000단위마다 ','이나 '억' 찍는 것) 구현

        fun getFormattedPrice() : String {

            if (this.price >= 10000) {
                val uk = this.price / 10000
//                나누기 하면 내림 효과임
                val rest = this.price % 10000
//                나머지 연산자 %, 35600 % 10000 하면 5600 나옴
                val result = "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
                return result
            }
            else{
                val result = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
                return result
            }
        }

    }

