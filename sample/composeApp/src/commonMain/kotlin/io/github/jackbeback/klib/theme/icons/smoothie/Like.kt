package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Like",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFFFFFF))) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(3f, 12.5f)
                    curveTo(3f, 11.395f, 3.895f, 10.5f, 5f, 10.5f)
                    horizontalLineTo(6f)
                    curveTo(7.105f, 10.5f, 8f, 11.395f, 8f, 12.5f)
                    verticalLineTo(18.5f)
                    curveTo(8f, 19.605f, 7.105f, 20.5f, 6f, 20.5f)
                    horizontalLineTo(5f)
                    curveTo(3.895f, 20.5f, 3f, 19.605f, 3f, 18.5f)
                    verticalLineTo(12.5f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8f, 12.5f)
                    curveTo(9f, 12.5f, 13f, 10f, 13f, 5f)
                    curveTo(13f, 3f, 16f, 3f, 16f, 5f)
                    curveTo(16f, 7f, 16f, 8f, 15f, 10.5f)
                    horizontalLineTo(21f)
                    curveTo(21.552f, 10.5f, 22f, 10.948f, 22f, 11.5f)
                    verticalLineTo(14.74f)
                    curveTo(22f, 15.229f, 21.82f, 15.702f, 21.495f, 16.068f)
                    lineTo(18.597f, 19.329f)
                    curveTo(18.217f, 19.756f, 17.673f, 20f, 17.102f, 20f)
                    horizontalLineTo(10.333f)
                    curveTo(10.117f, 20f, 9.906f, 19.93f, 9.733f, 19.8f)
                    lineTo(8f, 18.5f)
                }
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
