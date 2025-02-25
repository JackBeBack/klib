package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationPlus: ImageVector
    get() {
        if (_LocationPlus != null) {
            return _LocationPlus!!
        }
        _LocationPlus = ImageVector.Builder(
            name = "LocationPlus",
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
                moveTo(12f, 13f)
                verticalLineTo(7f)
                moveTo(15f, 10.001f)
                lineTo(9f, 10f)
                moveTo(19f, 10.2f)
                curveTo(19f, 14.176f, 15.5f, 17.4f, 12f, 21f)
                curveTo(8.5f, 17.4f, 5f, 14.176f, 5f, 10.2f)
                curveTo(5f, 6.224f, 8.134f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.224f, 19f, 10.2f)
                close()
            }
        }.build()

        return _LocationPlus!!
    }

@Suppress("ObjectPropertyName")
private var _LocationPlus: ImageVector? = null
