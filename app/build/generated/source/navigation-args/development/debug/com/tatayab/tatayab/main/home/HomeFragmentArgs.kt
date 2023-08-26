package com.tatayab.tatayab.main.home

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tatayab.model.home.CompositeBlockItem
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class HomeFragmentArgs(
  public val blocksList: Array<CompositeBlockItem>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("blocksList", this.blocksList)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("blocksList", this.blocksList)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST","DEPRECATION")
    public fun fromBundle(bundle: Bundle): HomeFragmentArgs {
      bundle.setClassLoader(HomeFragmentArgs::class.java.classLoader)
      val __blocksList : Array<CompositeBlockItem>?
      if (bundle.containsKey("blocksList")) {
        __blocksList = bundle.getParcelableArray("blocksList")?.map { it as CompositeBlockItem
            }?.toTypedArray()
        if (__blocksList == null) {
          throw IllegalArgumentException("Argument \"blocksList\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"blocksList\" is missing and does not have an android:defaultValue")
      }
      return HomeFragmentArgs(__blocksList)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): HomeFragmentArgs {
      val __blocksList : Array<CompositeBlockItem>?
      if (savedStateHandle.contains("blocksList")) {
        __blocksList = savedStateHandle.get<Array<Parcelable>>("blocksList")?.map { it as
            CompositeBlockItem }?.toTypedArray()
        if (__blocksList == null) {
          throw IllegalArgumentException("Argument \"blocksList\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"blocksList\" is missing and does not have an android:defaultValue")
      }
      return HomeFragmentArgs(__blocksList)
    }
  }
}
