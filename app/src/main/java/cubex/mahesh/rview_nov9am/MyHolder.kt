package cubex.mahesh.rview_nov9am

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.indiview.view.*

class MyHolder(var v:View) : RecyclerView.ViewHolder(v)
{
    var iView:ImageView? = null
    var fname:TextView? = null
    var fsize : TextView? = null
    var del:Button? = null

    init {
        iView = v.iview
        fname = v.name
        fsize = v.size
        del = v.delete
    }


}