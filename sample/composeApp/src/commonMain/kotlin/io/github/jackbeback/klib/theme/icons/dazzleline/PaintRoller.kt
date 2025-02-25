package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PaintRoller: ImageVector
    get() {
        if (_PaintRoller != null) {
            return _PaintRoller!!
        }
        _PaintRoller = ImageVector.Builder(
            name = "PaintRoller",
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
                moveTo(11f, 16f)
                curveTo(11f, 15.068f, 11f, 14.602f, 11.152f, 14.235f)
                curveTo(11.355f, 13.745f, 11.745f, 13.355f, 12.235f, 13.152f)
                curveTo(12.602f, 13f, 13.068f, 13f, 14f, 13f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 13f, 18.48f, 13f, 18.908f, 12.782f)
                curveTo(19.284f, 12.59f, 19.59f, 12.284f, 19.782f, 11.908f)
                curveTo(20f, 11.48f, 20f, 10.92f, 20f, 9.8f)
                verticalLineTo(9.2f)
                curveTo(20f, 8.08f, 20f, 7.52f, 19.782f, 7.092f)
                curveTo(19.59f, 6.716f, 19.284f, 6.41f, 18.908f, 6.218f)
                curveTo(18.48f, 6f, 17.92f, 6f, 16.8f, 6f)
                horizontalLineTo(16f)
                moveTo(16f, 6f)
                curveTo(16f, 6.932f, 16f, 7.398f, 15.848f, 7.765f)
                curveTo(15.645f, 8.255f, 15.255f, 8.645f, 14.765f, 8.848f)
                curveTo(14.398f, 9f, 13.932f, 9f, 13f, 9f)
                horizontalLineTo(7f)
                curveTo(6.068f, 9f, 5.602f, 9f, 5.235f, 8.848f)
                curveTo(4.745f, 8.645f, 4.355f, 8.255f, 4.152f, 7.765f)
                curveTo(4f, 7.398f, 4f, 6.932f, 4f, 6f)
                curveTo(4f, 5.068f, 4f, 4.602f, 4.152f, 4.235f)
                curveTo(4.355f, 3.745f, 4.745f, 3.355f, 5.235f, 3.152f)
                curveTo(5.602f, 3f, 6.068f, 3f, 7f, 3f)
                horizontalLineTo(13f)
                curveTo(13.932f, 3f, 14.398f, 3f, 14.765f, 3.152f)
                curveTo(15.255f, 3.355f, 15.645f, 3.745f, 15.848f, 4.235f)
                curveTo(16f, 4.602f, 16f, 5.068f, 16f, 6f)
                close()
                moveTo(10.6f, 21f)
                horizontalLineTo(11.4f)
                curveTo(11.96f, 21f, 12.24f, 21f, 12.454f, 20.891f)
                curveTo(12.642f, 20.795f, 12.795f, 20.642f, 12.891f, 20.454f)
                curveTo(13f, 20.24f, 13f, 19.96f, 13f, 19.4f)
                verticalLineTo(17.6f)
                curveTo(13f, 17.04f, 13f, 16.76f, 12.891f, 16.546f)
                curveTo(12.795f, 16.358f, 12.642f, 16.205f, 12.454f, 16.109f)
                curveTo(12.24f, 16f, 11.96f, 16f, 11.4f, 16f)
                horizontalLineTo(10.6f)
                curveTo(10.04f, 16f, 9.76f, 16f, 9.546f, 16.109f)
                curveTo(9.358f, 16.205f, 9.205f, 16.358f, 9.109f, 16.546f)
                curveTo(9f, 16.76f, 9f, 17.04f, 9f, 17.6f)
                verticalLineTo(19.4f)
                curveTo(9f, 19.96f, 9f, 20.24f, 9.109f, 20.454f)
                curveTo(9.205f, 20.642f, 9.358f, 20.795f, 9.546f, 20.891f)
                curveTo(9.76f, 21f, 10.04f, 21f, 10.6f, 21f)
                close()
            }
        }.build()

        return _PaintRoller!!
    }

@Suppress("ObjectPropertyName")
private var _PaintRoller: ImageVector? = null
