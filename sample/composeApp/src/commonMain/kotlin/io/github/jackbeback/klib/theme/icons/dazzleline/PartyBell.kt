package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PartyBell: ImageVector
    get() {
        if (_PartyBell != null) {
            return _PartyBell!!
        }
        _PartyBell = ImageVector.Builder(
            name = "PartyBell",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 19f)
                curveTo(20.015f, 17.404f, 19.278f, 16.666f, 18.532f, 16.424f)
                curveTo(17.876f, 16.21f, 16.532f, 16.405f, 15.537f, 15.896f)
                curveTo(14.585f, 15.409f, 14.048f, 14.12f, 14.003f, 12.657f)
                moveTo(16f, 20f)
                lineTo(15.999f, 20.01f)
                moveTo(7.65f, 19f)
                lineTo(7.65f, 19.01f)
                moveTo(19.66f, 7f)
                lineTo(19.66f, 7.01f)
                moveTo(12.5f, 19f)
                curveTo(12.5f, 17.5f, 12f, 16.5f, 11.065f, 15.595f)
                moveTo(16.422f, 10.238f)
                curveTo(17.5f, 11f, 18.5f, 11.5f, 20.083f, 11.008f)
                moveTo(14.728f, 6.243f)
                curveTo(13.603f, 5.117f, 12.076f, 4.485f, 10.485f, 4.485f)
                curveTo(8.894f, 4.485f, 7.368f, 5.117f, 6.243f, 6.243f)
                curveTo(5.117f, 7.368f, 4.485f, 8.894f, 4.485f, 10.485f)
                curveTo(4.485f, 12.077f, 5.117f, 13.603f, 6.243f, 14.728f)
                lineTo(14.728f, 6.243f)
                close()
            }
        }.build()

        return _PartyBell!!
    }

@Suppress("ObjectPropertyName")
private var _PartyBell: ImageVector? = null
