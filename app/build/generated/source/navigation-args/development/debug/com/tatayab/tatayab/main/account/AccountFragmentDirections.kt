package com.tatayab.tatayab.main.account

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tatayab.tatayab.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public class AccountFragmentDirections private constructor() {
  private data class NextActionAddresses(
    public val fromCheckOut: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.next_action_addresses

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("fromCheckOut", this.fromCheckOut)
        return result
      }
  }

  private data class NextActionContactUs(
    public val url: String
  ) : NavDirections {
    public override val actionId: Int = R.id.next_action_contact_us

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("url", this.url)
        return result
      }
  }

  private data class NextActionPrivacy(
    public val url: String
  ) : NavDirections {
    public override val actionId: Int = R.id.next_action_privacy

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("url", this.url)
        return result
      }
  }

  private data class NextLoginOptions(
    public val fromCheckout: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.next_login_options

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("fromCheckout", this.fromCheckout)
        return result
      }
  }

  public companion object {
    public fun nextActionAddresses(fromCheckOut: Boolean = false): NavDirections =
        NextActionAddresses(fromCheckOut)

    public fun nextActionProfile(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_profile)

    public fun nextActionOrders(): NavDirections = ActionOnlyNavDirections(R.id.next_action_orders)

    public fun nextActionWallet(): NavDirections = ActionOnlyNavDirections(R.id.next_action_wallet)

    public fun nextActionWishlist(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_wishlist)

    public fun nextActionCountries(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_countries)

    public fun nextActionCurriencies(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_curriencies)

    public fun nextActionAboutUs(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_about_us)

    public fun nextActionRefer(): NavDirections = ActionOnlyNavDirections(R.id.next_action_refer)

    public fun nextActionContactUs(url: String): NavDirections = NextActionContactUs(url)

    public fun nextActionPrivacy(url: String): NavDirections = NextActionPrivacy(url)

    public fun nextLoginOptions(fromCheckout: Boolean = false): NavDirections =
        NextLoginOptions(fromCheckout)
  }
}
