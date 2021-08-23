package com.neppplus.jicbangcopyapp_2021_08_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopyapp_2021_08_20.RoomData.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.activity_view_room_detail.descriptionTxt
import kotlinx.android.synthetic.main.activity_view_room_detail.priceTxt
import kotlinx.android.synthetic.main.room_item_list.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomData") as RoomData

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description

        placeAndFloorTxt.text = roomData.place
        floorTxt.text = roomData.getFormattedFloor()

    }
}