package com.neppplus.jicbangcopyapp_2021_08_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jicbangcopyapp_2021_08_20.RoomAdapter.RoomAdapter
import com.neppplus.jicbangcopyapp_2021_08_20.RoomData.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
//    방 목록을 담아주기 위한 배열

    lateinit var mRoomAdapter: RoomAdapter
    //나중에 대입한다(초기값 설정 안해도 됨) (var만 사용) (널 허용에는 사용 불가)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( "부산시 은평구", 37500, 3,"역에서 멈"))
        mRoomList.add( RoomData( "충청남도 동작구", 7500, -1,"집에서 멈"))
        mRoomList.add( RoomData( "경상도 어디구", 17500, 0,"친구 집에서 멈"))
        mRoomList.add( RoomData( "전라도 저쩌구", 1247500, 12,"학교에서 멈"))
        mRoomList.add( RoomData( "서울시 동대문구", 8000, 5, "1번째 방"))
        mRoomList.add( RoomData( "서울시 문구", 80000, 2, "2번째 방"))
        mRoomList.add( RoomData( "서울시 동구", 1230100, -3, "3번째 방"))
        mRoomList.add( RoomData( "서울시 홍구", 4050, 0, "14번째 방"))
        mRoomList.add( RoomData( "서울시 대구", 804200, -1, "11번째 방"))
        mRoomList.add( RoomData( "경기도 마구", 123, 51, "12번째 방"))

//        어댑터 연결 / 실행

        mRoomAdapter = RoomAdapter(this, R.layout.room_item_list, mRoomList)
        roomList.adapter = mRoomAdapter


        roomList.setOnItemClickListener { adapterView, view, position, l ->
//            셋온아이템클릭리스너 목록중에 괄호()이게 아니라 {}이거로 함
            val clickedRoom = mRoomList[position]
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomData", clickedRoom)
            startActivity(myIntent)

        }


    }
}