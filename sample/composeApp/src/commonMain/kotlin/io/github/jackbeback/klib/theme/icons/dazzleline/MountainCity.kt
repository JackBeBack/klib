package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MountainCity: ImageVector
    get() {
        if (_MountainCity != null) {
            return _MountainCity!!
        }
        _MountainCity = ImageVector.Builder(
            name = "MountainCity",
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
                moveTo(11f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                moveTo(21f, 11f)
                verticalLineTo(21f)
                moveTo(21f, 11f)
                verticalLineTo(7f)
                moveTo(14f, 7f)
                horizontalLineTo(14.01f)
                moveTo(14f, 11f)
                horizontalLineTo(14.01f)
                moveTo(18f, 14f)
                horizontalLineTo(18.01f)
                moveTo(18f, 18f)
                horizontalLineTo(18.01f)
                moveTo(5.955f, 16f)
                lineTo(8.811f, 11.166f)
                curveTo(9.038f, 10.782f, 9.151f, 10.59f, 9.298f, 10.525f)
                curveTo(9.427f, 10.469f, 9.573f, 10.469f, 9.702f, 10.525f)
                curveTo(9.849f, 10.59f, 9.962f, 10.782f, 10.189f, 11.166f)
                lineTo(13.045f, 16f)
                moveTo(5.955f, 16f)
                lineTo(3f, 21f)
                horizontalLineTo(16f)
                lineTo(13.045f, 16f)
                moveTo(5.955f, 16f)
                lineTo(8f, 18f)
                lineTo(9.5f, 16f)
                horizontalLineTo(13.045f)
            }
        }.build()

        return _MountainCity!!
    }

@Suppress("ObjectPropertyName")
private var _MountainCity: ImageVector? = null
