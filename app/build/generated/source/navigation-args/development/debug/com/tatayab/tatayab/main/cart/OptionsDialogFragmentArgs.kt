package com.tatayab.tatayab.main.cart

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tatayab.model.MapValueXXX
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OptionsDialogFragmentArgs(
  public val optionItems: MapValueXXX
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
      result.putParcelable("optionItems", this.optionItems as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
      result.putSerializable("optionItems", this.optionItems as Serializable)
    } else {
      throw UnsupportedOperationException(MapValueXXX::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
      result.set("optionItems", this.optionItems as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
      result.set("optionItems", this.optionItems as Serializable)
    } else {
      throw UnsupportedOperationException(MapValueXXX::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): OptionsDialogFragmentArgs {
      bundle.setClassLoader(OptionsDialogFragmentArgs::class.java.classLoader)
      val __optionItems : MapValueXXX?
      if (bundle.containsKey("optionItems")) {
        if (Parcelable::class.java.isAssignableFrom(MapValueXXX::class.java) ||
            Serializable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
          __optionItems = bundle.get("optionItems") as MapValueXXX?
        } else {
          throw UnsupportedOperationException(MapValueXXX::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__optionItems == null) {
          throw IllegalArgumentException("Argument \"optionItems\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"optionItems\" is missing and does not have an android:defaultValue")
      }
      return OptionsDialogFragmentArgs(__optionItems)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): OptionsDialogFragmentArgs {
      val __optionItems : MapValueXXX?
      if (savedStateHandle.contains("optionItems")) {
        if (Parcelable::class.java.isAssignableFrom(MapValueXXX::class.java) ||
            Serializable::class.java.isAssignableFrom(MapValueXXX::class.java)) {
          __optionItems = savedStateHandle.get<MapValueXXX?>("optionItems")
        } else {
          throw UnsupportedOperationException(MapValueXXX::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__optionItems == null) {
          throw IllegalArgumentException("Argument \"optionItems\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"optionItems\" is missing and does not have an android:defaultValue")
      }
      return OptionsDialogFragmentArgs(__optionItems)
    }
  }
}
