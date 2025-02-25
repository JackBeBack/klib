package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Crown",
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
                moveTo(4f, 8f)
                lineTo(6f, 20f)
                horizontalLineTo(18f)
                lineTo(20f, 8f)
                moveTo(4f, 8f)
                lineTo(5.716f, 9.373f)
                curveTo(6.832f, 10.266f, 7.39f, 10.712f, 7.953f, 10.781f)
                curveTo(8.445f, 10.842f, 8.943f, 10.717f, 9.349f, 10.431f)
                curveTo(9.812f, 10.105f, 10.094f, 9.448f, 10.656f, 8.135f)
                lineTo(12f, 5f)
                moveTo(4f, 8f)
                curveTo(4.552f, 8f, 5f, 7.552f, 5f, 7f)
                curveTo(5f, 6.448f, 4.552f, 6f, 4f, 6f)
                curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
                curveTo(3f, 7.552f, 3.448f, 8f, 4f, 8f)
                close()
                moveTo(20f, 8f)
                lineTo(18.284f, 9.373f)
                curveTo(17.168f, 10.266f, 16.61f, 10.712f, 16.047f, 10.781f)
                curveTo(15.555f, 10.842f, 15.057f, 10.717f, 14.651f, 10.431f)
                curveTo(14.188f, 10.105f, 13.906f, 9.448f, 13.344f, 8.135f)
                lineTo(12f, 5f)
                moveTo(20f, 8f)
                curveTo(20.552f, 8f, 21f, 7.552f, 21f, 7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                curveTo(19.448f, 6f, 19f, 6.448f, 19f, 7f)
                curveTo(19f, 7.552f, 19.448f, 8f, 20f, 8f)
                close()
                moveTo(12f, 5f)
                curveTo(12.552f, 5f, 13f, 4.552f, 13f, 4f)
                curveTo(13f, 3.448f, 12.552f, 3f, 12f, 3f)
                curveTo(11.448f, 3f, 11f, 3.448f, 11f, 4f)
                curveTo(11f, 4.552f, 11.448f, 5f, 12f, 5f)
                close()
                moveTo(12f, 4f)
                horizontalLineTo(12.01f)
                moveTo(20f, 7f)
                horizontalLineTo(20.01f)
                moveTo(4f, 7f)
                horizontalLineTo(4.01f)
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null
