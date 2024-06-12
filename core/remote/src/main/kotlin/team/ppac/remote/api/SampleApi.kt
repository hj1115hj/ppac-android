package team.ppac.remote.api

import retrofit2.http.GET
import team.ppac.remote.model.sample.SampleResponse

internal interface SampleApi {
    @GET("v2/list")
    suspend fun getImages(): List<SampleResponse>
}