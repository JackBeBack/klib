package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramPrevious: ImageVector
    get() {
        if (_DiagramPrevious != null) {
            return _DiagramPrevious!!
        }
        _DiagramPrevious = ImageVector.Builder(
            name = "DiagramPrevious",
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
                moveTo(6.6f, 9f)
                horizontalLineTo(6f)
                curveTo(5.068f, 9f, 4.602f, 9f, 4.235f, 8.848f)
                curveTo(3.745f, 8.645f, 3.355f, 8.255f, 3.152f, 7.765f)
                curveTo(3f, 7.398f, 3f, 6.932f, 3f, 6f)
                curveTo(3f, 5.068f, 3f, 4.602f, 3.152f, 4.235f)
                curveTo(3.355f, 3.745f, 3.745f, 3.355f, 4.235f, 3.152f)
                curveTo(4.602f, 3f, 5.068f, 3f, 6f, 3f)
                horizontalLineTo(18f)
                curveTo(18.932f, 3f, 19.398f, 3f, 19.765f, 3.152f)
                curveTo(20.255f, 3.355f, 20.645f, 3.745f, 20.848f, 4.235f)
                curveTo(21f, 4.602f, 21f, 5.068f, 21f, 6f)
                curveTo(21f, 6.932f, 21f, 7.398f, 20.848f, 7.765f)
                curveTo(20.645f, 8.255f, 20.255f, 8.645f, 19.765f, 8.848f)
                curveTo(19.398f, 9f, 18.932f, 9f, 18f, 9f)
                horizontalLineTo(17.4f)
                moveTo(12f, 15f)
                verticalLineTo(7f)
                moveTo(12f, 7f)
                lineTo(10f, 9f)
                moveTo(12f, 7f)
                lineTo(14f, 9f)
                moveTo(6f, 15f)
                horizontalLineTo(18f)
                curveTo(18.932f, 15f, 19.398f, 15f, 19.765f, 15.152f)
                curveTo(20.255f, 15.355f, 20.645f, 15.745f, 20.848f, 16.235f)
                curveTo(21f, 16.602f, 21f, 17.068f, 21f, 18f)
                curveTo(21f, 18.932f, 21f, 19.398f, 20.848f, 19.765f)
                curveTo(20.645f, 20.255f, 20.255f, 20.645f, 19.765f, 20.848f)
                curveTo(19.398f, 21f, 18.932f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.068f, 21f, 4.602f, 21f, 4.235f, 20.848f)
                curveTo(3.745f, 20.645f, 3.355f, 20.255f, 3.152f, 19.765f)
                curveTo(3f, 19.398f, 3f, 18.932f, 3f, 18f)
                curveTo(3f, 17.068f, 3f, 16.602f, 3.152f, 16.235f)
                curveTo(3.355f, 15.745f, 3.745f, 15.355f, 4.235f, 15.152f)
                curveTo(4.602f, 15f, 5.068f, 15f, 6f, 15f)
                close()
            }
        }.build()

        return _DiagramPrevious!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramPrevious: ImageVector? = null
