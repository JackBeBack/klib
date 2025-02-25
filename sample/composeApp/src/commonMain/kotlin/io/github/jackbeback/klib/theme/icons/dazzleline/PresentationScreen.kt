package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PresentationScreen: ImageVector
    get() {
        if (_PresentationScreen != null) {
            return _PresentationScreen!!
        }
        _PresentationScreen = ImageVector.Builder(
            name = "PresentationScreen",
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
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                moveTo(12f, 18f)
                lineTo(7f, 21f)
                moveTo(12f, 18f)
                lineTo(17f, 21f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(12f, 18f)
                verticalLineTo(15f)
                moveTo(12f, 15f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 15f, 17.48f, 15f, 17.908f, 14.782f)
                curveTo(18.284f, 14.59f, 18.59f, 14.284f, 18.782f, 13.908f)
                curveTo(19f, 13.48f, 19f, 12.92f, 19f, 11.8f)
                verticalLineTo(7f)
                moveTo(12f, 15f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 15f, 6.52f, 15f, 6.092f, 14.782f)
                curveTo(5.716f, 14.59f, 5.41f, 14.284f, 5.218f, 13.908f)
                curveTo(5f, 13.48f, 5f, 12.92f, 5f, 11.8f)
                verticalLineTo(7f)
            }
        }.build()

        return _PresentationScreen!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationScreen: ImageVector? = null
