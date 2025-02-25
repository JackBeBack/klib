package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.IdBadge: ImageVector
    get() {
        if (_IdBadge != null) {
            return _IdBadge!!
        }
        _IdBadge = ImageVector.Builder(
            name = "IdBadge",
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
                moveTo(14f, 6f)
                horizontalLineTo(10f)
                moveTo(15f, 17f)
                curveTo(14.716f, 15.859f, 13.481f, 15f, 12f, 15f)
                curveTo(10.519f, 15f, 9.284f, 15.859f, 9f, 17f)
                moveTo(12f, 11f)
                horizontalLineTo(12.01f)
                moveTo(8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(19f, 5.08f, 19f, 4.52f, 18.782f, 4.092f)
                curveTo(18.59f, 3.716f, 18.284f, 3.41f, 17.908f, 3.218f)
                curveTo(17.48f, 3f, 16.92f, 3f, 15.8f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                close()
                moveTo(13f, 11f)
                curveTo(13f, 11.552f, 12.552f, 12f, 12f, 12f)
                curveTo(11.448f, 12f, 11f, 11.552f, 11f, 11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                close()
            }
        }.build()

        return _IdBadge!!
    }

@Suppress("ObjectPropertyName")
private var _IdBadge: ImageVector? = null
