package com.neppplus.jicbangcopyapp_2021_08_20.RoomAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jicbangcopyapp_2021_08_20.R
import com.neppplus.jicbangcopyapp_2021_08_20.RoomData.RoomData

class RoomAdapter (
    val mContext : Context,
    val resId : Int,
    val mroomList : ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext, resId, mroomList){

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow==null) {
            tempRow = mInflater.inflate(R.layout.room_item_list, null)
        }
        val row = tempRow!!



        return row
    }

    }


