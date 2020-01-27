package com.solvabit.mate

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager

class ConnectivityReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context, p1: Intent?) {

        if (connectivityReceiverListner!= null) {
            connectivityReceiverListner!!.onNetworkConnectionChanged(isConnectedOrConnecting(p0))
        }

    }


    private fun isConnectedOrConnecting(context: Context): Boolean {

        val connMgr = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connMgr.activeNetworkInfo

        return (networkInfo != null && networkInfo.isConnectedOrConnecting)

    }

    interface ConnectivityReceiverListner {
        fun onNetworkConnectionChanged(isConnected: Boolean)
    }

    companion object {

        var connectivityReceiverListner: ConnectivityReceiverListner? = null
    }


}