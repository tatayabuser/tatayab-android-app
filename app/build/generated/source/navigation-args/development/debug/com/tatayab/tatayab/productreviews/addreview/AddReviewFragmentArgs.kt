package com.tatayab.tatayab.productreviews.addreview

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddReviewFragmentArgs(
  public val productId: String? = null,
  public val productName: String? = null,
  public val productImage: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("productId", this.productId)
    result.putString("productName", this.productName)
    result.putString("productImage", this.productImage)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productId", this.productId)
    result.set("productName", this.productName)
    result.set("productImage", this.productImage)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddReviewFragmentArgs {
      bundle.setClassLoader(AddReviewFragmentArgs::class.java.classLoader)
      val __productId : String?
      if (bundle.containsKey("productId")) {
        __productId = bundle.getString("productId")
      } else {
        __productId = null
      }
      val __productName : String?
      if (bundle.containsKey("productName")) {
        __productName = bundle.getString("productName")
      } else {
        __productName = null
      }
      val __productImage : String?
      if (bundle.containsKey("productImage")) {
        __productImage = bundle.getString("productImage")
      } else {
        __productImage = null
      }
      return AddReviewFragmentArgs(__productId, __productName, __productImage)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddReviewFragmentArgs {
      val __productId : String?
      if (savedStateHandle.contains("productId")) {
        __productId = savedStateHandle["productId"]
      } else {
        __productId = null
      }
      val __productName : String?
      if (savedStateHandle.contains("productName")) {
        __productName = savedStateHandle["productName"]
      } else {
        __productName = null
      }
      val __productImage : String?
      if (savedStateHandle.contains("productImage")) {
        __productImage = savedStateHandle["productImage"]
      } else {
        __productImage = null
      }
      return AddReviewFragmentArgs(__productId, __productName, __productImage)
    }
  }
}
