package com.tatayab.tatayab.main.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tatayab.model.Product
import com.tatayab.tatayab.R
import java.io.Serializable
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class NextProductList(
    public val categoryType: String?,
    public val categoryId: String?,
    public val categoryName: String?,
    public val graphKey: String? = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.next_product_list

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

  private data class NextProductDetails(
    public val productId: String? = null,
    public val productUID: String? = "",
    public val productObject: Product? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.next_product_details

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putString("productId", this.productId)
        result.putString("productUID", this.productUID)
        if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
          result.putParcelable("productObject", this.productObject as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
          result.putSerializable("productObject", this.productObject as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun nextProductList(
      categoryType: String?,
      categoryId: String?,
      categoryName: String?,
      graphKey: String? = ""
    ): NavDirections = NextProductList(categoryType, categoryId, categoryName, graphKey)

    public fun nextProductDetails(
      productId: String? = null,
      productUID: String? = "",
      productObject: Product? = null
    ): NavDirections = NextProductDetails(productId, productUID, productObject)

    public fun nextSupplier(): NavDirections = ActionOnlyNavDirections(R.id.next_supplier)
  }
}
