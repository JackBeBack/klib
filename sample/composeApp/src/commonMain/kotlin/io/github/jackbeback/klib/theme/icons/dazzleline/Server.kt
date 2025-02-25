package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Server: ImageVector
    get() {
        if (_Server != null) {
            return _Server!!
        }
        _Server = ImageVector.Builder(
            name = "Server",
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
                moveTo(18f, 7f)
                horizontalLineTo(18.01f)
                moveTo(15f, 7f)
                horizontalLineTo(15.01f)
                moveTo(18f, 17f)
                horizontalLineTo(18.01f)
                moveTo(15f, 17f)
                horizontalLineTo(15.01f)
                moveTo(6f, 10f)
                horizontalLineTo(18f)
                curveTo(18.932f, 10f, 19.398f, 10f, 19.765f, 9.848f)
                curveTo(20.255f, 9.645f, 20.645f, 9.255f, 20.848f, 8.765f)
                curveTo(21f, 8.398f, 21f, 7.932f, 21f, 7f)
                curveTo(21f, 6.068f, 21f, 5.602f, 20.848f, 5.235f)
                curveTo(20.645f, 4.745f, 20.255f, 4.355f, 19.765f, 4.152f)
                curveTo(19.398f, 4f, 18.932f, 4f, 18f, 4f)
                horizontalLineTo(6f)
                curveTo(5.068f, 4f, 4.602f, 4f, 4.235f, 4.152f)
                curveTo(3.745f, 4.355f, 3.355f, 4.745f, 3.152f, 5.235f)
                curveTo(3f, 5.602f, 3f, 6.068f, 3f, 7f)
                curveTo(3f, 7.932f, 3f, 8.398f, 3.152f, 8.765f)
                curveTo(3.355f, 9.255f, 3.745f, 9.645f, 4.235f, 9.848f)
                curveTo(4.602f, 10f, 5.068f, 10f, 6f, 10f)
                close()
                moveTo(6f, 20f)
                horizontalLineTo(18f)
                curveTo(18.932f, 20f, 19.398f, 20f, 19.765f, 19.848f)
                curveTo(20.255f, 19.645f, 20.645f, 19.255f, 20.848f, 18.765f)
                curveTo(21f, 18.398f, 21f, 17.932f, 21f, 17f)
                curveTo(21f, 16.068f, 21f, 15.602f, 20.848f, 15.235f)
                curveTo(20.645f, 14.745f, 20.255f, 14.355f, 19.765f, 14.152f)
                curveTo(19.398f, 14f, 18.932f, 14f, 18f, 14f)
                horizontalLineTo(6f)
                curveTo(5.068f, 14f, 4.602f, 14f, 4.235f, 14.152f)
                curveTo(3.745f, 14.355f, 3.355f, 14.745f, 3.152f, 15.235f)
                curveTo(3f, 15.602f, 3f, 16.068f, 3f, 17f)
                curveTo(3f, 17.932f, 3f, 18.398f, 3.152f, 18.765f)
                curveTo(3.355f, 19.255f, 3.745f, 19.645f, 4.235f, 19.848f)
                curveTo(4.602f, 20f, 5.068f, 20f, 6f, 20f)
                close()
            }
        }.build()

        return _Server!!
    }

@Suppress("ObjectPropertyName")
private var _Server: ImageVector? = null
