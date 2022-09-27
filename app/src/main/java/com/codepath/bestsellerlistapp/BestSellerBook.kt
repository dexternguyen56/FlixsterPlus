package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    @SerializedName("rank")
    var rank = 0

    @SerializedName("poster_path")
    var bookImageUrl: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("amazon_product_url")
    var amazonUrl: String? = null

    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    //TODO bookImageUrl


    //TODO description


    //TODO-STRETCH-GOALS amazonUrl
}