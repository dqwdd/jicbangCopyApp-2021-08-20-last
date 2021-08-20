package com.neppplus.jicbangcopyapp_2021_08_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopyapp_2021_08_20.RoomAdapter.RoomAdapter
import com.neppplus.jicbangcopyapp_2021_08_20.RoomData.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( "은평구", 37500, 3,"역에서 멈"))
        mRoomList.add( RoomData( "동작구", 7500, -1,"역에서 멈"))
        mRoomList.add( RoomData( "어디구", 17500, 0,"역에서 멈"))
        mRoomList.add( RoomData( "저쩌구", 1247500, 12,"역에서 멈"))




    }
}