package cubex.mahesh.rview_nov9am

import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.io.File

class MyAdapter(var activity:MainActivity) : RecyclerView.Adapter<MyHolder>() {

    var list:Array<File>? = null

    init {
            readFiles()
   }

    fun  readFiles( )
    {
        var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/"
        var file = File(path)
        if(!file.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/"
            file = File(path)
        }
        list = file.listFiles()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {
        var inflater = LayoutInflater.from(activity)
        var v = inflater.inflate(R.layout.indiview,
            p0,false)
        return  MyHolder(v)
    }
    override fun getItemCount(): Int {
        return list!!.size
    }
    override fun onBindViewHolder(holder: MyHolder, pos: Int) {
        var f = list!![pos]
        holder.iView!!.setImageURI(Uri.fromFile(f))
        holder.fname!!.text = f.name
        holder.fsize!!.text = f.length().toString()
        holder.del!!.setOnClickListener {
            f.delete()
            readFiles()
            this.notifyDataSetChanged()
        }

    }

}