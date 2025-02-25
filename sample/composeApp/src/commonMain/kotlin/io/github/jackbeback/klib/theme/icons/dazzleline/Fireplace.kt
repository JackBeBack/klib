package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) {
            return _Fireplace!!
        }
        _Fireplace = ImageVector.Builder(
            name = "Fireplace",
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
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                moveTo(3f, 8f)
                horizontalLineTo(21f)
                moveTo(19f, 4f)
                verticalLineTo(20f)
                moveTo(5f, 4f)
                verticalLineTo(20f)
                moveTo(13.768f, 19.219f)
                curveTo(12.792f, 20.26f, 11.208f, 20.26f, 10.232f, 19.219f)
                curveTo(9.744f, 18.698f, 9.5f, 18.016f, 9.5f, 17.333f)
                curveTo(9.5f, 16.651f, 9.744f, 15.968f, 10.232f, 15.448f)
                curveTo(10.232f, 15.448f, 10.438f, 16f, 11.063f, 16.333f)
                curveTo(11.063f, 15.667f, 11.219f, 14.667f, 11.996f, 14f)
                curveTo(12.625f, 14.667f, 13.278f, 14.926f, 13.768f, 15.448f)
                curveTo(14.256f, 15.968f, 14.5f, 16.651f, 14.5f, 17.333f)
                curveTo(14.5f, 18.016f, 14.256f, 18.698f, 13.768f, 19.219f)
                close()
            }
        }.build()

        return _Fireplace!!
    }

@Suppress("ObjectPropertyName")
private var _Fireplace: ImageVector? = null
