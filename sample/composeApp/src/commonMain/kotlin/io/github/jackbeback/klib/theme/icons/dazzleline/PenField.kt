package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenField: ImageVector
    get() {
        if (_PenField != null) {
            return _PenField!!
        }
        _PenField = ImageVector.Builder(
            name = "PenField",
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
                moveTo(8f, 9f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 9f, 4.52f, 9f, 4.092f, 9.218f)
                curveTo(3.716f, 9.41f, 3.41f, 9.716f, 3.218f, 10.092f)
                curveTo(3f, 10.52f, 3f, 11.08f, 3f, 12.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                horizontalLineTo(17.787f)
                curveTo(18.907f, 21f, 19.467f, 21f, 19.895f, 20.782f)
                curveTo(20.271f, 20.59f, 20.577f, 20.284f, 20.769f, 19.908f)
                curveTo(20.987f, 19.48f, 20.987f, 18.92f, 20.987f, 17.8f)
                verticalLineTo(12f)
                moveTo(6f, 15f)
                horizontalLineTo(6.01f)
                moveTo(10f, 15f)
                horizontalLineTo(10.01f)
                moveTo(11.519f, 12.895f)
                lineTo(12.834f, 12.635f)
                curveTo(13.543f, 12.495f, 13.898f, 12.424f, 14.229f, 12.295f)
                curveTo(14.522f, 12.181f, 14.801f, 12.032f, 15.06f, 11.852f)
                curveTo(15.351f, 11.649f, 15.607f, 11.393f, 16.118f, 10.882f)
                lineTo(21.267f, 5.733f)
                curveTo(21.954f, 5.046f, 21.954f, 3.932f, 21.267f, 3.244f)
                curveTo(20.58f, 2.557f, 19.465f, 2.557f, 18.778f, 3.244f)
                lineTo(13.542f, 8.481f)
                curveTo(13.063f, 8.96f, 12.823f, 9.2f, 12.629f, 9.471f)
                curveTo(12.458f, 9.712f, 12.313f, 9.972f, 12.199f, 10.245f)
                curveTo(12.07f, 10.552f, 11.992f, 10.882f, 11.837f, 11.542f)
                lineTo(11.519f, 12.895f)
                close()
            }
        }.build()

        return _PenField!!
    }

@Suppress("ObjectPropertyName")
private var _PenField: ImageVector? = null
