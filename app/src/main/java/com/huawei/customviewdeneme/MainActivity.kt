package com.huawei.customviewdeneme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val profileItemView: ProfileItem by lazy { findViewById(R.id.profileItem) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userModel = UserModel(
            name = "Doğan",
            mail = "dogan@gmail.com",
            imageUrl = "https://pos.bakiyem.com/surucuimg/0C6299908F669B21AA05485DC74D8D05.jpeg"
        )
        profileItemView.setProperties(userModel)
    }
}