package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Sleigh: ImageVector
    get() {
        if (_Sleigh != null) {
            return _Sleigh!!
        }
        _Sleigh = ImageVector.Builder(
            name = "Sleigh",
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
                moveTo(14f, 21f)
                horizontalLineTo(18f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                moveTo(14f, 21f)
                horizontalLineTo(7f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                moveTo(7f, 21f)
                horizontalLineTo(4f)
                moveTo(7f, 21f)
                verticalLineTo(16.841f)
                moveTo(4f, 3f)
                verticalLineTo(10.6f)
                curveTo(4f, 12.84f, 4f, 13.96f, 4.436f, 14.816f)
                curveTo(4.819f, 15.569f, 5.431f, 16.181f, 6.184f, 16.564f)
                curveTo(7.04f, 17f, 8.16f, 17f, 10.4f, 17f)
                horizontalLineTo(13.6f)
                curveTo(15.84f, 17f, 16.96f, 17f, 17.816f, 16.564f)
                curveTo(18.569f, 16.181f, 19.181f, 15.569f, 19.564f, 14.816f)
                curveTo(20f, 13.96f, 20f, 12.84f, 20f, 10.6f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                curveTo(18.068f, 8f, 17.602f, 8f, 17.235f, 8.152f)
                curveTo(16.745f, 8.355f, 16.355f, 8.745f, 16.152f, 9.235f)
                curveTo(16f, 9.602f, 16f, 10.068f, 16f, 11f)
                horizontalLineTo(14f)
                curveTo(10.686f, 11f, 8f, 8.314f, 8f, 5f)
                curveTo(8f, 3.895f, 7.105f, 3f, 6f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 3f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Sleigh!!
    }

@Suppress("ObjectPropertyName")
private var _Sleigh: ImageVector? = null
