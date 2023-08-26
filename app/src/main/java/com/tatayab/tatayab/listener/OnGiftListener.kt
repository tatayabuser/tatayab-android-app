package com.tatayab.tatayab.listener

import com.tatayab.model.ProductX

interface OnGiftListener {

    fun onAddButtonClicked(mProductX : ProductX)
    fun updateGift(mProductX : ProductX)
    fun onDeleteButtonClicked(mProductID : String)
}