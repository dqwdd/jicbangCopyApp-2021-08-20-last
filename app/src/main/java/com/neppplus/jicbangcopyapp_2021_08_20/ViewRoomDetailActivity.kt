package com.neppplus.jicbangcopyapp_2021_08_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopyapp_2021_08_20.RoomData.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomData") as RoomData

        roomData.price

    }
}