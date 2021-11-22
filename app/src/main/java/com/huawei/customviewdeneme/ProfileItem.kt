package com.huawei.customviewdeneme

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.withStyledAttributes
import com.huawei.customviewdeneme.databinding.ViewCustomProfileItemBinding

/**
 * Created by Oguz Sahin on 11/22/2021.
 */
class ProfileItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: ViewCustomProfileItemBinding =
        ViewCustomProfileItemBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        context.withStyledAttributes(attrs, R.styleable.ProfileItem) {
            val name = getString(R.styleable.ProfileItem_name) ?: ""
            val mail = getString(R.styleable.ProfileItem_mail) ?: ""
            val imageUrl = getString(R.styleable.ProfileItem_imageUrl) ?: ""
            setProperties(UserModel(name, mail, imageUrl))
        }

    }

    fun setProperties(userModel: UserModel) {
        binding.userModel = userModel
    }


}

