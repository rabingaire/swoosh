package np.com.rabingaire.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import np.com.rabingaire.swoosh.Model.Player
import np.com.rabingaire.swoosh.R
import np.com.rabingaire.swoosh.Utilities.*

class FinishActivity : AppCompatActivity() {
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        finishText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
