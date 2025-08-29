package com.lagradost.cloudstream3.movieproviders

import com.lagradost.cloudstream3.*

class MiraculousProvider : MainAPI() {
    override var mainUrl = "https://miraculous.to"
    override var name = "MiraculousTest"
    override val supportedTypes = setOf(TvType.Anime)
    override val hasDownloadSupport = true

    override suspend fun load(url: String): LoadResponse {
        return newMovieLoadResponse("Miraculous Test Video", url, TvType.Movie) {
            this.posterUrl = null
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        callback.invoke(
            ExtractorLink(
                this.name,
                "Miraculous Test Link",
                "https://ep-distribution.miraculous.to/episodes/video2/EN615/EN615_.m3u8",
                "",
                Qualities.P720.value
            )
        )
        return true
    }
}
