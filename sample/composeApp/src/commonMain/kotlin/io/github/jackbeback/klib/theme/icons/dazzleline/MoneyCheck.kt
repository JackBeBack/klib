package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoneyCheck: ImageVector
    get() {
        if (_MoneyCheck != null) {
            return _MoneyCheck!!
        }
        _MoneyCheck = ImageVector.Builder(
            name = "MoneyCheck",
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
                moveTo(7f, 14f)
                horizontalLineTo(17f)
                moveTo(7f, 10f)
                horizontalLineTo(17f)
                moveTo(6.2f, 18f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 18f, 19.48f, 18f, 19.908f, 17.782f)
                curveTo(20.284f, 17.59f, 20.59f, 17.284f, 20.782f, 16.908f)
                curveTo(21f, 16.48f, 21f, 15.92f, 21f, 14.8f)
                verticalLineTo(9.2f)
                curveTo(21f, 8.08f, 21f, 7.52f, 20.782f, 7.092f)
                curveTo(20.59f, 6.716f, 20.284f, 6.41f, 19.908f, 6.218f)
                curveTo(19.48f, 6f, 18.92f, 6f, 17.8f, 6f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 6f, 4.52f, 6f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3f, 7.52f, 3f, 8.08f, 3f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                close()
            }
        }.build()

        return _MoneyCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyCheck: ImageVector? = null
