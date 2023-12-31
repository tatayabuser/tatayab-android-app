package com.tatayab.model.responses.graph_responses

import com.google.gson.annotations.SerializedName

class GiftItemsResponse (@SerializedName("data") val data: DataModel):BaseGrapgQlResponse(){
    class DataModel (@SerializedName("GiftWrapListing") val mGiftWrapListingModel: GiftWrapListingModel?)
    class GiftWrapListingModel (@SerializedName("giftwraps") val GiftItemsList: ArrayList<ItemModel?>)
    class PriceModel (@SerializedName("value") val value: Float?=0f,@SerializedName("currency") val currency:String?="")
    class ItemModel (
        @SerializedName("entity_id") val entityId: Int?=0,
        @SerializedName("status") val status: Int?=0,
        @SerializedName("name") val name: String?="",
        @SerializedName("price") val price: PriceModel?=null,
        @SerializedName("image") val image: String?=""
     )
}
/*{
	"data": {
		"GiftWrapListing": {
			"giftwraps": [
				{
					"entity_id": 1,
					"status": 1,
					"name": "Red flowers",
"price": {
						"value": 12,
						"currency": "KWD"
					},					"image": "https:\/\/magento-dev.tatayab.com\/media\/amasty\/giftwrap\/cache\/R\/e\/100\/100\/Red_flowers_002_gi56-8j.jpeg"
				},
				{
					"entity_id": 2,
					"status": 1,
					"name": "Pink flowers",
					"price": "12.00",
					"image": "https:\/\/magento-dev.tatayab.com\/media\/amasty\/giftwrap\/cache\/P\/i\/100\/100\/Pink_Flower_001.jpeg"
				},
				{
					"entity_id": 3,
					"status": 1,
					"name": "white flowers",
					"price": "12.00",
					"image": "https:\/\/magento-dev.tatayab.com\/media\/amasty\/giftwrap\/cache\/w\/h\/100\/100\/white_flowers_003_8nzi-rt.jpeg"
				},
				{
					"entity_id": 4,
					"status": 1,
					"name": "Navy with blue ribbon",
					"price": "1.50",
					"image": "https:\/\/magento-dev.tatayab.com\/media\/amasty\/giftwrap\/cache\/N\/a\/100\/100\/Navy-with-Blue-Ribbon.jpg"
				}
			]
		}
	}
}*/