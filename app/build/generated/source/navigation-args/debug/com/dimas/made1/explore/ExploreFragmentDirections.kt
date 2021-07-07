package com.dimas.made1.explore

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.dimas.made1.R
import com.dimas.made1.core.domain.model.DataDomain
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class ExploreFragmentDirections private constructor() {
  private data class ActionExploreFragmentToNavDetail(
    public val content: String,
    public val detailData: DataDomain
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_exploreFragment_to_nav_detail

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("content", this.content)
      if (Parcelable::class.java.isAssignableFrom(DataDomain::class.java)) {
        result.putParcelable("detail_data", this.detailData as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(DataDomain::class.java)) {
        result.putSerializable("detail_data", this.detailData as Serializable)
      } else {
        throw UnsupportedOperationException(DataDomain::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionExploreFragmentToNavDetail(content: String, detailData: DataDomain):
        NavDirections = ActionExploreFragmentToNavDetail(content, detailData)
  }
}
