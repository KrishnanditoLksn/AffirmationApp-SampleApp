package app.dito.affirmationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResources: Int,
    @DrawableRes val imageResourcesId: Int
)
