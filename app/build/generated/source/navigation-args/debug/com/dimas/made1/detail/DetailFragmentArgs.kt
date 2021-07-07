package com.dimas.made1.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.dimas.made1.core.domain.model.DataDomain
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val content: String,
  public val detailData: DataDomain
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __content : String?
      if (bundle.containsKey("content")) {
        __content = bundle.getString("content")
        if (__content == null) {
          throw IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"content\" is missing and does not have an android:defaultValue")
      }
      val __detailData : DataDomain?
      if (bundle.containsKey("detail_data")) {
        if (Parcelable::class.java.isAssignableFrom(DataDomain::class.java) ||
            Serializable::class.java.isAssignableFrom(DataDomain::class.java)) {
          __detailData = bundle.get("detail_data") as DataDomain?
        } else {
          throw UnsupportedOperationException(DataDomain::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__detailData == null) {
          throw IllegalArgumentException("Argument \"detail_data\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"detail_data\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__content, __detailData)
    }
  }
}
