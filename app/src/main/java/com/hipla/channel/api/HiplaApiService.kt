package com.hipla.channel.api

import com.hipla.channel.entity.response.ApplicationResponse
import com.hipla.channel.entity.response.GenerateOTPResponse
import com.hipla.channel.entity.response.SalesPageResponse
import com.hipla.channel.entity.response.VerifyOTPResponse
import retrofit2.Response
import retrofit2.http.*

interface HiplaApiService {

    @GET("business/v1/user")
    suspend fun fetchSalesUserList(
        @Query("currentPage") currentPage: Int,
        @Query("pageSize") pageSize: Int
    ): Response<SalesPageResponse>

    @POST("business/v1/user/generateOtp")
    suspend fun generateOTP(@Body otpRequestMap: Map<String, String>): Response<GenerateOTPResponse>

    @POST("notification/v1/verifyAnonymousOTP")
    suspend fun verifyOtp(@Body otpRequestMap: Map<String, String>): Response<VerifyOTPResponse>

    @POST("business/v1/extra/transactionInfo")
    suspend fun createApplication(@Body createApplicationRequestMap: Map<String, String>): Response<ApplicationResponse>

    @PATCH("business/v1/extra/transactionInfo")
    suspend fun updateApplication(@Body createApplicationRequestMap: Map<String, String>): Response<ApplicationResponse>

}