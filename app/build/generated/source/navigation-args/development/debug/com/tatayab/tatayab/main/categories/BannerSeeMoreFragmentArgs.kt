package com.tatayab.tatayab.main.categories

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tatayab.tatayab.main.categories.response.ListOfBanner
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BannerSeeMoreFragmentArgs(
  public val screenType: Int = 1,
  public val screenTitle: String? = null,
  public val bannerList: ListOfBanner? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("screenType", this.screenType)
    result.putString("screenTitle", this.screenTitle)
    if (Parcelable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
      result.putParcelable("bannerList", this.bannerList as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
      result.putSerializable("bannerList", this.bannerList as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("screenType", this.screenType)
    result.set("screenTitle", this.screenTitle)
    if (Parcelable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
      result.set("bannerList", this.bannerList as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
      result.set("bannerList", this.bannerList as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): BannerSeeMoreFragmentArgs {
      bundle.setClassLoader(BannerSeeMoreFragmentArgs::class.java.classLoader)
      val __screenType : Int
      if (bundle.containsKey("screenType")) {
        __screenType = bundle.getInt("screenType")
      } else {
        __screenType = 1
      }
      val __screenTitle : String?
      if (bundle.containsKey("screenTitle")) {
        __screenTitle = bundle.getString("screenTitle")
      } else {
        __screenTitle = null
      }
      val __bannerList : ListOfBanner?
      if (bundle.containsKey("bannerList")) {
        if (Parcelable::class.java.isAssignableFrom(ListOfBanner::class.java) ||
            Serializable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
          __bannerList = bundle.get("bannerList") as ListOfBanner?
        } else {
          throw UnsupportedOperationException(ListOfBanner::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __bannerList = null
      }
      return BannerSeeMoreFragmentArgs(__screenType, __screenTitle, __bannerList)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BannerSeeMoreFragmentArgs {
      val __screenType : Int?
      if (savedStateHandle.contains("screenType")) {
        __screenType = savedStateHandle["screenType"]
        if (__screenType == null) {
          throw IllegalArgumentException("Argument \"screenType\" of type integer does not support null values")
        }
      } else {
        __screenType = 1
      }
      val __screenTitle : String?
      if (savedStateHandle.contains("screenTitle")) {
        __screenTitle = savedStateHandle["screenTitle"]
      } else {
        __screenTitle = null
      }
      val __bannerList : ListOfBanner?
      if (savedStateHandle.contains("bannerList")) {
        if (Parcelable::class.java.isAssignableFrom(ListOfBanner::class.java) ||
            Serializable::class.java.isAssignableFrom(ListOfBanner::class.java)) {
          __bannerList = savedStateHandle.get<ListOfBanner?>("bannerList")
        } else {
          throw UnsupportedOperationException(ListOfBanner::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __bannerList = null
      }
      return BannerSeeMoreFragmentArgs(__screenType, __screenTitle, __bannerList)
    }
  }
}
