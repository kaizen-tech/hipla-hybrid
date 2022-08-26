package com.hipla.sentinelvms.sentinelKt.foodModule.network.request

import com.google.gson.annotations.SerializedName
import com.hipla.sentinelvms.sentinelKt.foodModule.network.response.Items

data class OrderRequestMeetingRoom(
    @SerializedName("pantryId") var pantryId: String? = null,
    @SerializedName("organizationId") var organizationId: String? = null,
    @SerializedName("businessId") var businessId: String? = null,
    @SerializedName("employeeId") var employeeId: String? = null,
    @SerializedName("roomId") var roomId: String? = null,
    @SerializedName("instruction") var instruction: String? = null,
    @SerializedName("items") var items: List<Items> = arrayListOf()
)