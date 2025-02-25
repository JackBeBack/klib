package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.IdCard: ImageVector
    get() {
        if (_IdCard != null) {
            return _IdCard!!
        }
        _IdCard = ImageVector.Builder(
            name = "IdCard",
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
                moveTo(18f, 12f)
                horizontalLineTo(15f)
                moveTo(21f, 8f)
                horizontalLineTo(3f)
                moveTo(18f, 16f)
                horizontalLineTo(15f)
                moveTo(13f, 19f)
                curveTo(12.622f, 17.288f, 10.975f, 16f, 9f, 16f)
                curveTo(7.033f, 16f, 5.39f, 17.279f, 5.004f, 18.981f)
                moveTo(9f, 12f)
                horizontalLineTo(9.01f)
                moveTo(5.004f, 18.981f)
                curveTo(5.318f, 19f, 5.704f, 19f, 6.2f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3f, 16.92f, 3f, 17.48f, 3.218f, 17.908f)
                curveTo(3.41f, 18.284f, 3.716f, 18.59f, 4.092f, 18.782f)
                curveTo(4.33f, 18.903f, 4.61f, 18.957f, 5.004f, 18.981f)
                close()
                moveTo(10f, 12f)
                curveTo(10f, 12.552f, 9.552f, 13f, 9f, 13f)
                curveTo(8.448f, 13f, 8f, 12.552f, 8f, 12f)
                curveTo(8f, 11.448f, 8.448f, 11f, 9f, 11f)
                curveTo(9.552f, 11f, 10f, 11.448f, 10f, 12f)
                close()
            }
        }.build()

        return _IdCard!!
    }

@Suppress("ObjectPropertyName")
private var _IdCard: ImageVector? = null
