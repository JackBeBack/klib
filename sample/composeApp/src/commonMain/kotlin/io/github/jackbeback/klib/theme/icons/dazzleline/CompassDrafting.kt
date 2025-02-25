package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CompassDrafting: ImageVector
    get() {
        if (_CompassDrafting != null) {
            return _CompassDrafting!!
        }
        _CompassDrafting = ImageVector.Builder(
            name = "CompassDrafting",
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
                moveTo(21f, 21f)
                lineTo(13.319f, 8.624f)
                moveTo(21f, 12.938f)
                curveTo(18.801f, 15.429f, 15.584f, 17f, 12f, 17f)
                curveTo(8.416f, 17f, 5.199f, 15.429f, 3f, 12.938f)
                moveTo(3f, 21f)
                lineTo(10.681f, 8.624f)
                moveTo(12f, 4f)
                curveTo(10.619f, 4f, 9.5f, 5.119f, 9.5f, 6.5f)
                curveTo(9.5f, 7.397f, 9.972f, 8.183f, 10.681f, 8.624f)
                moveTo(12f, 4f)
                curveTo(13.381f, 4f, 14.5f, 5.119f, 14.5f, 6.5f)
                curveTo(14.5f, 7.397f, 14.028f, 8.183f, 13.319f, 8.624f)
                moveTo(12f, 4f)
                verticalLineTo(3f)
                moveTo(13.319f, 8.624f)
                curveTo(12.936f, 8.862f, 12.484f, 9f, 12f, 9f)
                curveTo(11.516f, 9f, 11.064f, 8.862f, 10.681f, 8.624f)
            }
        }.build()

        return _CompassDrafting!!
    }

@Suppress("ObjectPropertyName")
private var _CompassDrafting: ImageVector? = null
