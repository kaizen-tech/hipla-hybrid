package com.hipla.channel.entity

open class AppEvent(open val id: Int, open val message: String? = null)

class AppEventWithData<T>(
    override val id: Int,
    override val message: String? = null,
    val extras: T? = null
) : AppEvent(id, message)

const val APP_EVENT_ERROR = 0

const val APP_EVENT_APPLICATION_SUCCESS = 10
const val APP_EVENT_APPLICATION_FAILED = 11
const val APP_EVENT_APPLICATION_COMPLETE = 12

const val OTP_GENERATING = 20
const val OTP_GENERATE_COMPLETE = 21
const val OTP_GENERATE_SUCCESS = 22
const val OTP_GENERATE_FAILED = 23

const val OTP_VERIFYING = 30
const val OTP_VERIFICATION_COMPLETE = 31
const val OTP_VERIFICATION_FAILED = 32
const val OTP_VERIFICATION_INVALID = 33
const val OTP_VERIFICATION_SUCCESS = 34
const val OTP_SHOW_VERIFICATION_DIALOG = 35


const val PAYMENT_INFO_UPDATED = 40