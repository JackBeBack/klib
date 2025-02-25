package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramSubtask: ImageVector
    get() {
        if (_DiagramSubtask != null) {
            return _DiagramSubtask!!
        }
        _DiagramSubtask = ImageVector.Builder(
            name = "DiagramSubtask",
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
                moveTo(11f, 18f)
                curveTo(11f, 18.932f, 11f, 19.398f, 11.152f, 19.765f)
                curveTo(11.355f, 20.255f, 11.745f, 20.645f, 12.235f, 20.848f)
                curveTo(12.602f, 21f, 13.068f, 21f, 14f, 21f)
                horizontalLineTo(18f)
                curveTo(18.932f, 21f, 19.398f, 21f, 19.765f, 20.848f)
                curveTo(20.255f, 20.645f, 20.645f, 20.255f, 20.848f, 19.765f)
                curveTo(21f, 19.398f, 21f, 18.932f, 21f, 18f)
                curveTo(21f, 17.068f, 21f, 16.602f, 20.848f, 16.235f)
                curveTo(20.645f, 15.745f, 20.255f, 15.355f, 19.765f, 15.152f)
                curveTo(19.398f, 15f, 18.932f, 15f, 18f, 15f)
                horizontalLineTo(14f)
                curveTo(13.068f, 15f, 12.602f, 15f, 12.235f, 15.152f)
                curveTo(11.745f, 15.355f, 11.355f, 15.745f, 11.152f, 16.235f)
                curveTo(11f, 16.602f, 11f, 17.068f, 11f, 18f)
                close()
                moveTo(11f, 18f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 18f, 7.52f, 18f, 7.092f, 17.782f)
                curveTo(6.716f, 17.59f, 6.41f, 17.284f, 6.218f, 16.908f)
                curveTo(6f, 16.48f, 6f, 15.92f, 6f, 14.8f)
                verticalLineTo(9f)
                moveTo(6f, 9f)
                horizontalLineTo(18f)
                curveTo(18.932f, 9f, 19.398f, 9f, 19.765f, 8.848f)
                curveTo(20.255f, 8.645f, 20.645f, 8.255f, 20.848f, 7.765f)
                curveTo(21f, 7.398f, 21f, 6.932f, 21f, 6f)
                curveTo(21f, 5.068f, 21f, 4.602f, 20.848f, 4.235f)
                curveTo(20.645f, 3.745f, 20.255f, 3.355f, 19.765f, 3.152f)
                curveTo(19.398f, 3f, 18.932f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveTo(5.068f, 3f, 4.602f, 3f, 4.235f, 3.152f)
                curveTo(3.745f, 3.355f, 3.355f, 3.745f, 3.152f, 4.235f)
                curveTo(3f, 4.602f, 3f, 5.068f, 3f, 6f)
                curveTo(3f, 6.932f, 3f, 7.398f, 3.152f, 7.765f)
                curveTo(3.355f, 8.255f, 3.745f, 8.645f, 4.235f, 8.848f)
                curveTo(4.602f, 9f, 5.068f, 9f, 6f, 9f)
                close()
            }
        }.build()

        return _DiagramSubtask!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramSubtask: ImageVector? = null
