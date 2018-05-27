package np.com.rabingaire.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import np.com.rabingaire.swoosh.Utilities.*
import np.com.rabingaire.swoosh.R

class SkillActivity : AppCompatActivity() {

    var selectedSkill = ""
    var league =  ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        skillBallerButton.isChecked = false
        selectedSkill = skillBeginnerButton.text.toString()
    }

    fun onBallerClicked(view: View) {
        skillBeginnerButton.isChecked = false
        selectedSkill = skillBallerButton.text.toString()
    }

    fun skillFinishClick(view: View) {
        if ( selectedSkill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please Select the Skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
