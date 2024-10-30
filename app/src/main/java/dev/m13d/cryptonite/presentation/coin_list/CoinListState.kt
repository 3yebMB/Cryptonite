package dev.m13d.cryptonite.presentation.coin_list.components

import androidx.compose.runtime.Immutable
import dev.m13d.cryptonite.presentation.model.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null,
)
