package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramPredecessor: ImageVector
    get() {
        if (_DiagramPredecessor != null) {
            return _DiagramPredecessor!!
        }
        _DiagramPredecessor = ImageVector.Builder(
            name = "DiagramPredecessor",
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
                moveTo(10f, 3f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 3f, 17.48f, 3f, 17.908f, 3.218f)
                curveTo(18.284f, 3.41f, 18.59f, 3.716f, 18.782f, 4.092f)
                curveTo(19f, 4.52f, 19f, 5.08f, 19f, 6.2f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                lineTo(17f, 7f)
                moveTo(19f, 9f)
                lineTo(21f, 7f)
                moveTo(6f, 6f)
                horizontalLineTo(9f)
                moveTo(6f, 9f)
                horizontalLineTo(9f)
                curveTo(9.932f, 9f, 10.398f, 9f, 10.765f, 8.848f)
                curveTo(11.255f, 8.645f, 11.645f, 8.255f, 11.848f, 7.765f)
                curveTo(12f, 7.398f, 12f, 6.932f, 12f, 6f)
                curveTo(12f, 5.068f, 12f, 4.602f, 11.848f, 4.235f)
                curveTo(11.645f, 3.745f, 11.255f, 3.355f, 10.765f, 3.152f)
                curveTo(10.398f, 3f, 9.932f, 3f, 9f, 3f)
                horizontalLineTo(6f)
                curveTo(5.068f, 3f, 4.602f, 3f, 4.235f, 3.152f)
                curveTo(3.745f, 3.355f, 3.355f, 3.745f, 3.152f, 4.235f)
                curveTo(3f, 4.602f, 3f, 5.068f, 3f, 6f)
                curveTo(3f, 6.932f, 3f, 7.398f, 3.152f, 7.765f)
                curveTo(3.355f, 8.255f, 3.745f, 8.645f, 4.235f, 8.848f)
                curveTo(4.602f, 9f, 5.068f, 9f, 6f, 9f)
                close()
                moveTo(6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.932f, 21f, 19.398f, 21f, 19.765f, 20.848f)
                curveTo(20.255f, 20.645f, 20.645f, 20.255f, 20.848f, 19.765f)
                curveTo(21f, 19.398f, 21f, 18.932f, 21f, 18f)
                curveTo(21f, 17.068f, 21f, 16.602f, 20.848f, 16.235f)
                curveTo(20.645f, 15.745f, 20.255f, 15.355f, 19.765f, 15.152f)
                curveTo(19.398f, 15f, 18.932f, 15f, 18f, 15f)
                horizontalLineTo(6f)
                curveTo(5.068f, 15f, 4.602f, 15f, 4.235f, 15.152f)
                curveTo(3.745f, 15.355f, 3.355f, 15.745f, 3.152f, 16.235f)
                curveTo(3f, 16.602f, 3f, 17.068f, 3f, 18f)
                curveTo(3f, 18.932f, 3f, 19.398f, 3.152f, 19.765f)
                curveTo(3.355f, 20.255f, 3.745f, 20.645f, 4.235f, 20.848f)
                curveTo(4.602f, 21f, 5.068f, 21f, 6f, 21f)
                close()
            }
        }.build()

        return _DiagramPredecessor!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramPredecessor: ImageVector? = null
