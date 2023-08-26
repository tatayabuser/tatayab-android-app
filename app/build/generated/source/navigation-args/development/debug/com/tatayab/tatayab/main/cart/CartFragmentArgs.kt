package com.tatayab.tatayab.main.cart

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.tatayab.model.KnetData
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CartFragmentArgs(
  public val orderId: String? = null,
  public val deliveryTime: String? = null,
  public val knetData: KnetData? = null,
  public val amount: String? = null,
  public val totalUserOrders: String? = "0",
  public val paymentStatus: Boolean = false
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("orderId", this.orderId)
    result.putString("deliveryTime", this.deliveryTime)
    if (Parcelable::class.java.isAssignableFrom(KnetData::class.java)) {
      result.putParcelable("knetData", this.knetData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(KnetData::class.java)) {
      result.putSerializable("knetData", this.knetData as Serializable?)
    }
    result.putString("amount", this.amount)
    result.putString("totalUserOrders", this.totalUserOrders)
    result.putBoolean("paymentStatus", this.paymentStatus)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("deliveryTime", this.deliveryTime)
    if (Parcelable::class.java.isAssignableFrom(KnetData::class.java)) {
      result.set("knetData", this.knetData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(KnetData::class.java)) {
      result.set("knetData", this.knetData as Serializable?)
    }
    result.set("amount", this.amount)
    result.set("totalUserOrders", this.totalUserOrders)
    result.set("paymentStatus", this.paymentStatus)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): CartFragmentArgs {
      bundle.setClassLoader(CartFragmentArgs::class.java.classLoader)
      val __orderId : String?
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getString("orderId")
      } else {
        __orderId = null
      }
      val __deliveryTime : String?
      if (bundle.containsKey("deliveryTime")) {
        __deliveryTime = bundle.getString("deliveryTime")
      } else {
        __deliveryTime = null
      }
      val __knetData : KnetData?
      if (bundle.containsKey("knetData")) {
        if (Parcelable::class.java.isAssignableFrom(KnetData::class.java) ||
            Serializable::class.java.isAssignableFrom(KnetData::class.java)) {
          __knetData = bundle.get("knetData") as KnetData?
        } else {
          throw UnsupportedOperationException(KnetData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __knetData = null
      }
      val __amount : String?
      if (bundle.containsKey("amount")) {
        __amount = bundle.getString("amount")
      } else {
        __amount = null
      }
      val __totalUserOrders : String?
      if (bundle.containsKey("totalUserOrders")) {
        __totalUserOrders = bundle.getString("totalUserOrders")
      } else {
        __totalUserOrders = "0"
      }
      val __paymentStatus : Boolean
      if (bundle.containsKey("paymentStatus")) {
        __paymentStatus = bundle.getBoolean("paymentStatus")
      } else {
        __paymentStatus = false
      }
      return CartFragmentArgs(__orderId, __deliveryTime, __knetData, __amount, __totalUserOrders,
          __paymentStatus)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CartFragmentArgs {
      val __orderId : String?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
      } else {
        __orderId = null
      }
      val __deliveryTime : String?
      if (savedStateHandle.contains("deliveryTime")) {
        __deliveryTime = savedStateHandle["deliveryTime"]
      } else {
        __deliveryTime = null
      }
      val __knetData : KnetData?
      if (savedStateHandle.contains("knetData")) {
        if (Parcelable::class.java.isAssignableFrom(KnetData::class.java) ||
            Serializable::class.java.isAssignableFrom(KnetData::class.java)) {
          __knetData = savedStateHandle.get<KnetData?>("knetData")
        } else {
          throw UnsupportedOperationException(KnetData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __knetData = null
      }
      val __amount : String?
      if (savedStateHandle.contains("amount")) {
        __amount = savedStateHandle["amount"]
      } else {
        __amount = null
      }
      val __totalUserOrders : String?
      if (savedStateHandle.contains("totalUserOrders")) {
        __totalUserOrders = savedStateHandle["totalUserOrders"]
      } else {
        __totalUserOrders = "0"
      }
      val __paymentStatus : Boolean?
      if (savedStateHandle.contains("paymentStatus")) {
        __paymentStatus = savedStateHandle["paymentStatus"]
        if (__paymentStatus == null) {
          throw IllegalArgumentException("Argument \"paymentStatus\" of type boolean does not support null values")
        }
      } else {
        __paymentStatus = false
      }
      return CartFragmentArgs(__orderId, __deliveryTime, __knetData, __amount, __totalUserOrders,
          __paymentStatus)
    }
  }
}
