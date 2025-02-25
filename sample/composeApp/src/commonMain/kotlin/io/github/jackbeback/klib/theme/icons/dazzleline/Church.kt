package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Church: ImageVector
    get() {
        if (_Church != null) {
            return _Church!!
        }
        _Church = ImageVector.Builder(
            name = "Church",
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
                moveTo(12f, 8f)
                lineTo(8.798f, 9.561f)
                curveTo(8.146f, 9.879f, 7.82f, 10.038f, 7.581f, 10.278f)
                curveTo(7.37f, 10.49f, 7.21f, 10.747f, 7.111f, 11.03f)
                curveTo(7f, 11.349f, 7f, 11.712f, 7f, 12.438f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(12.438f)
                curveTo(17f, 11.712f, 17f, 11.349f, 16.889f, 11.03f)
                curveTo(16.791f, 10.747f, 16.63f, 10.49f, 16.419f, 10.278f)
                curveTo(16.181f, 10.038f, 15.855f, 9.879f, 15.202f, 9.561f)
                lineTo(12f, 8f)
                close()
                moveTo(12f, 8f)
                verticalLineTo(3f)
                moveTo(14f, 5f)
                horizontalLineTo(10f)
                moveTo(7f, 13f)
                lineTo(4.769f, 14.116f)
                curveTo(4.127f, 14.437f, 3.806f, 14.597f, 3.571f, 14.837f)
                curveTo(3.364f, 15.048f, 3.206f, 15.304f, 3.109f, 15.584f)
                curveTo(3f, 15.901f, 3f, 16.26f, 3f, 16.978f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(16.978f)
                curveTo(21f, 16.26f, 21f, 15.901f, 20.891f, 15.584f)
                curveTo(20.794f, 15.304f, 20.636f, 15.048f, 20.429f, 14.837f)
                curveTo(20.194f, 14.597f, 19.873f, 14.437f, 19.231f, 14.116f)
                lineTo(17f, 13f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.896f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Church!!
    }

@Suppress("ObjectPropertyName")
private var _Church: ImageVector? = null
