package cubex.mahesh.rview_nov9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.VERTICAL,
            false)
        var gManager = GridLayoutManager(
            this@MainActivity,2)

        rview.layoutManager = lManager // (or) gManager
        rview.adapter = MyAdapter(this@MainActivity)
    }
}
