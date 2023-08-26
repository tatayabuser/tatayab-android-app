package com.tatayab.tatayab.main.categories

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tatayab.tatayab.R
import com.tatayab.tatayab.main.categories.response.ListOfBanner
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class CategoriesFragmentDirections private constructor() {
  private data class NextAction(
    public val categoryId: String?,
    public val categoryName: String?,
    public val categoryType: String? = null,
    public val graphKey: String? = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.next_action

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("categoryType", this.categoryType)
        result.putString("categoryId", this.categoryId)
        result.putString("categoryName", this.categoryName)
        result.putString("graphKey", this.graphKey)
        return result
      }
  }

  private data class NextActionShowAllBanners(
    public val screenType: Int = 1,
    public val screenTitle: String? = null,
    public val bannerList: ListOfBanner? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.next_action_show_all_banners

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun nextAction(
      categoryId: String?,
      categoryName: String?,
      categoryType: String? = null,
      graphKey: String? = ""
    ): NavDirections = NextAction(categoryId, categoryName, categoryType, graphKey)

    public fun nextActionSupplier(): NavDirections =
        ActionOnlyNavDirections(R.id.next_action_supplier)

    public fun nextActionShowAllBanners(
      screenType: Int = 1,
      screenTitle: String? = null,
      bannerList: ListOfBanner? = null
    ): NavDirections = NextActionShowAllBanners(screenType, screenTitle, bannerList)

    public fun openConcierge(): NavDirections = ActionOnlyNavDirections(R.id.open_concierge)
  }
}
