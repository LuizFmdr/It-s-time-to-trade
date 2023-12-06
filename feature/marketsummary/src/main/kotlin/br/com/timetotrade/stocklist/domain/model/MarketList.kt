package br.com.timetotrade.stocklist.domain.model

data class AvailableMarket(val code: String, val isSelected: Boolean)

private const val DEFAULT_MARKET = "US"

val MARKET_LIST = listOf(
    "US", "BR", "AU", "CA", "FR", "DE", "HK", "IN", "IT", "ES", "GB", "SG"
).map { code ->
    AvailableMarket(code, code == DEFAULT_MARKET)
}

val List<AvailableMarket>.selectedMarketCode: String
    get() = this.first { it.isSelected }.code
