package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Home",
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
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9f, 21f)
                    horizontalLineTo(4f)
                    curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                    verticalLineTo(12.414f)
                    curveTo(3f, 12.149f, 3.105f, 11.895f, 3.293f, 11.707f)
                    lineTo(11.293f, 3.707f)
                    curveTo(11.683f, 3.317f, 12.317f, 3.317f, 12.707f, 3.707f)
                    lineTo(20.707f, 11.707f)
                    curveTo(20.895f, 11.895f, 21f, 12.149f, 21f, 12.414f)
                    verticalLineTo(20f)
                    curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                    horizontalLineTo(15f)
                    moveTo(9f, 21f)
                    horizontalLineTo(15f)
                    moveTo(9f, 21f)
                    verticalLineTo(15f)
                    curveTo(9f, 14.448f, 9.448f, 14f, 10f, 14f)
                    horizontalLineTo(14f)
                    curveTo(14.552f, 14f, 15f, 14.448f, 15f, 15f)
                    verticalLineTo(21f)
                }
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null
