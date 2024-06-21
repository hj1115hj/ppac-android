package team.ppac.designsystem.component.chip

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import team.ppac.designsystem.FarmemeTheme
import team.ppac.designsystem.foundation.FarmemeRadius

@Composable
fun FarmemeChip(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = false,
    onClick: () -> Unit = { },
) {
    val (backgroundColor, textStyle, textColor) = if (enabled) {
        Triple(
            FarmemeTheme.backgroundColor.brandAssistive,
            FarmemeTheme.typography.body.medium.bold,
            FarmemeTheme.textColor.brand
        )
    } else {
        Triple(
            FarmemeTheme.backgroundColor.assistive,
            FarmemeTheme.typography.body.medium.semibold,
            FarmemeTheme.textColor.secondary
        )
    }

    Box(
        modifier = modifier
            .clip(FarmemeRadius.Radius25.shape)
            .background(color = backgroundColor)
            .clickable(onClick = onClick)
            .padding(
                horizontal = 10.dp,
                vertical = 5.dp,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            style = textStyle,
            color = textColor,
        )
    }
}

@Composable
@Preview
fun FarmemeChipEnabledPreview() {
    FarmemeChip(
        text = "Text",
        enabled = true,
    )
}

@Composable
@Preview
fun FarmemeChipDisabledPreview() {
    FarmemeChip(
        text = "Text",
        enabled = false,
    )
}