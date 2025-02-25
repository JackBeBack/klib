package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bandage: ImageVector
    get() {
        if (_Bandage != null) {
            return _Bandage!!
        }
        _Bandage = ImageVector.Builder(
            name = "Bandage",
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
                moveTo(7f, 17f)
                verticalLineTo(7f)
                moveTo(17f, 17f)
                verticalLineTo(7f)
                moveTo(10f, 10f)
                horizontalLineTo(10.01f)
                moveTo(14f, 10f)
                horizontalLineTo(14.01f)
                moveTo(14f, 14f)
                horizontalLineTo(14.01f)
                moveTo(10f, 14f)
                horizontalLineTo(10.01f)
                moveTo(6.2f, 17f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 17f, 19.48f, 17f, 19.908f, 16.782f)
                curveTo(20.284f, 16.59f, 20.59f, 16.284f, 20.782f, 15.908f)
                curveTo(21f, 15.48f, 21f, 14.92f, 21f, 13.8f)
                verticalLineTo(10.2f)
                curveTo(21f, 9.08f, 21f, 8.52f, 20.782f, 8.092f)
                curveTo(20.59f, 7.716f, 20.284f, 7.41f, 19.908f, 7.218f)
                curveTo(19.48f, 7f, 18.92f, 7f, 17.8f, 7f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 7f, 4.52f, 7f, 4.092f, 7.218f)
                curveTo(3.716f, 7.41f, 3.41f, 7.716f, 3.218f, 8.092f)
                curveTo(3f, 8.52f, 3f, 9.08f, 3f, 10.2f)
                verticalLineTo(13.8f)
                curveTo(3f, 14.92f, 3f, 15.48f, 3.218f, 15.908f)
                curveTo(3.41f, 16.284f, 3.716f, 16.59f, 4.092f, 16.782f)
                curveTo(4.52f, 17f, 5.08f, 17f, 6.2f, 17f)
                close()
            }
        }.build()

        return _Bandage!!
    }

@Suppress("ObjectPropertyName")
private var _Bandage: ImageVector? = null
