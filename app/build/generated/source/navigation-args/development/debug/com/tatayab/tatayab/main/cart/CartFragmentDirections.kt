package com.tatayab.tatayab.main.cart

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tatayab.model.MapValueXXX
import com.tatayab.model.OptionsMap
import com.tatayab.model.responses.CartOrderResponse
import com.tatayab.tatayab.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class CartFragmentDirections private constructor() {
  private data class NextProductDetails(
    public val productId: String? = null,
    public val optionItems: Array<OptionsMap>? = null,
    public val cartId: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.next_product_details

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("productId", this.productId)
        result.putParcelableArray("optionItems", this.optionItems)
        result.putString("cartId", this.cartId)
        return result
      }
  }

  private data class NextActionCheckout(
    public val subTotal: Float,
    public val cartItems: Array<CartOrderResponse>?,
    public val loggedIn: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.nextActionCheckout

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putFloat("subTotal", this.subTotal)
        result.putParcelableArray("cartItems", this.cartItems)
        result.putBoolean("loggedIn", this.loggedIn)
        return result
      }
  }

  private data class ActionOptionDialog(
    public val optionItems: MapValueXXX
  ) : NavDirections {
    public override val actionId: Int = R.id.action_option_dialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ShareCart(
    public val cartListItems: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.share_cart

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("cartListItems", this.cartListItems)
        return result
      }
  }

  public companion object {
    public fun actionOrderSuccessToHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_order_success_to_home)

    public fun actionToCart(): NavDirections = ActionOnlyNavDirections(R.id.action_to_cart)

    public fun nextProductDetails(
      productId: String? = null,
      optionItems: Array<OptionsMap>? = null,
      cartId: String? = null
    ): NavDirections = NextProductDetails(productId, optionItems, cartId)

    public fun nextActionCheckout(
      subTotal: Float,
      cartItems: Array<CartOrderResponse>?,
      loggedIn: Boolean
    ): NavDirections = NextActionCheckout(subTotal, cartItems, loggedIn)

    public fun actionOptionDialog(optionItems: MapValueXXX): NavDirections =
        ActionOptionDialog(optionItems)

    public fun shareCart(cartListItems: String? = null): NavDirections = ShareCart(cartListItems)
  }
}
