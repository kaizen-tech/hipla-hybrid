package com.hipla.channel.entity

import com.hipla.channel.common.AppConfig
import com.hipla.channel.common.AppConfig.APPLICATION_TITLE
import com.hipla.channel.common.AppConfig.INVENTORY_TITLE
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlowConfig(val tag: String, val type: String, val title : String) {

    companion object {
        fun createApplicationFlowConfig(): FlowConfig {
            return FlowConfig(
                tag = AppConfig.APPLICATION_TAG,
                type = AppConfig.APPLICATION_TYPE,
                title = APPLICATION_TITLE
            )
        }

        fun createInventoryFlowConfig(): FlowConfig {
            return FlowConfig(
                tag = AppConfig.INVENTORY_TAG,
                type = AppConfig.INVENTORY_TYPE,
                title = INVENTORY_TITLE
            )
        }
    }

}

