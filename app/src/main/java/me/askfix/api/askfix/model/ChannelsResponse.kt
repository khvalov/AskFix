package me.askfix.api.askfix.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ChannelsResponse : Serializable {

    @Expose
    @SerializedName("applications")
    val applications: List<Applications>? = null
    @Expose
    @SerializedName("channels")
    val channels: List<Channels>? = null

    class Applications : Serializable {
        @Expose
        @SerializedName("uuid")
        val uuid: String? = null
        @Expose
        @SerializedName("description")
        val description: String? = null
        @Expose
        @SerializedName("name")
        val name: String? = null
    }

    class Channels : Serializable {
        @Expose
        @SerializedName("uuid")
        val uuid: String? = null
        @Expose
        @SerializedName("description")
        val description: String? = null
        @Expose
        @SerializedName("domain")
        val domain: String? = null
        @Expose
        @SerializedName("name")
        val name: String? = null
    }
}
