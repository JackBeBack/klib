package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudExclamation: ImageVector
    get() {
        if (_CloudExclamation != null) {
            return _CloudExclamation!!
        }
        _CloudExclamation = ImageVector.Builder(
            name = "CloudExclamation",
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
                moveTo(12f, 9.5f)
                verticalLineTo(12.5f)
                moveTo(12f, 15.5f)
                horizontalLineTo(12.01f)
                moveTo(8.4f, 19f)
                curveTo(5.418f, 19f, 3f, 16.604f, 3f, 13.649f)
                curveTo(3f, 11.2f, 4.8f, 8.938f, 7.5f, 8.5f)
                curveTo(8.347f, 6.486f, 10.351f, 5f, 12.689f, 5f)
                curveTo(15.684f, 5f, 18.132f, 7.323f, 18.3f, 10.25f)
                curveTo(19.889f, 10.945f, 21f, 12.65f, 21f, 14.497f)
                curveTo(21f, 16.984f, 18.985f, 19f, 16.5f, 19f)
                lineTo(8.4f, 19f)
                close()
            }
        }.build()

        return _CloudExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _CloudExclamation: ImageVector? = null
