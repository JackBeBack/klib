package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Flashlight: ImageVector
    get() {
        if (_Flashlight != null) {
            return _Flashlight!!
        }
        _Flashlight = ImageVector.Builder(
            name = "Flashlight",
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
                moveTo(15f, 9f)
                verticalLineTo(15f)
                moveTo(15f, 9f)
                horizontalLineTo(6f)
                curveTo(5.068f, 9f, 4.602f, 9f, 4.235f, 9.152f)
                curveTo(3.745f, 9.355f, 3.355f, 9.745f, 3.152f, 10.235f)
                curveTo(3f, 10.602f, 3f, 11.068f, 3f, 12f)
                curveTo(3f, 12.932f, 3f, 13.398f, 3.152f, 13.765f)
                curveTo(3.355f, 14.255f, 3.745f, 14.645f, 4.235f, 14.848f)
                curveTo(4.602f, 15f, 5.068f, 15f, 6f, 15f)
                horizontalLineTo(15f)
                moveTo(15f, 9f)
                curveTo(17.4f, 6f, 21f, 6f, 21f, 6f)
                verticalLineTo(18f)
                curveTo(17.4f, 18f, 15f, 15f, 15f, 15f)
                moveTo(9f, 12f)
                horizontalLineTo(11f)
            }
        }.build()

        return _Flashlight!!
    }

@Suppress("ObjectPropertyName")
private var _Flashlight: ImageVector? = null
