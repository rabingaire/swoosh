package np.com.rabingaire.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import np.com.rabingaire.swoosh.Model.Player
import np.com.rabingaire.swoosh.Utilities.*
import np.com.rabingaire.swoosh.R

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View) {
        skillBallerButton.isChecked = false
        player.skill = skillBeginnerButton.text.toString()
    }

    fun onBallerClicked(view: View) {
        skillBeginnerButton.isChecked = false
        player.skill = skillBallerButton.text.toString()
    }

    fun skillFinishClick(view: View) {
        if ( player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please Select the Skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
