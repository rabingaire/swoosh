package np.com.rabingaire.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import np.com.rabingaire.swoosh.Model.Player
import np.com.rabingaire.swoosh.Utilities.*
import np.com.rabingaire.swoosh.R

class LeagueActivity : AppCompatActivity() {
    var player = Player( "",  "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = mensLeagueButton.text.toString()
    }

    fun onWomensClicked(view: View) {
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = womensLeagueButton.text.toString()
    }

    fun onCoedClicked(view: View) {
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        player.league = coedLeagueButton.text.toString()
    }

    fun leagueNextClicked(view: View) {
        if ( player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please Select the League.", Toast.LENGTH_SHORT).show()
        }
    }
}
