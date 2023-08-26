package com.tatayab.tatayab.main.cart

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ReferCartFragmentArgs(
  public val cartListItems: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("cartListItems", this.cartListItems)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("cartListItems", this.cartListItems)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReferCartFragmentArgs {
      bundle.setClassLoader(ReferCartFragmentArgs::class.java.classLoader)
      val __cartListItems : String?
      if (bundle.containsKey("cartListItems")) {
        __cartListItems = bundle.getString("cartListItems")
      } else {
        throw IllegalArgumentException("Required argument \"cartListItems\" is missing and does not have an android:defaultValue")
      }
      return ReferCartFragmentArgs(__cartListItems)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ReferCartFragmentArgs {
      val __cartListItems : String?
      if (savedStateHandle.contains("cartListItems")) {
        __cartListItems = savedStateHandle["cartListItems"]
      } else {
        throw IllegalArgumentException("Required argument \"cartListItems\" is missing and does not have an android:defaultValue")
      }
      return ReferCartFragmentArgs(__cartListItems)
    }
  }
}
