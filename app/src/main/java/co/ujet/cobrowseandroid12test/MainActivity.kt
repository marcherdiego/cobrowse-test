package co.ujet.cobrowseandroid12test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.cobrowse.CobrowseIO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CobrowseIO.instance().apply {
            license("k7qfuiuXqPrTYA")
            start(this@MainActivity)
        }
    }
}