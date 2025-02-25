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

val Smoothie.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Dislike",
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
                    moveTo(22f, 11.5f)
                    curveTo(22f, 12.605f, 21.105f, 13.5f, 20f, 13.5f)
                    lineTo(19f, 13.5f)
                    curveTo(17.895f, 13.5f, 17f, 12.605f, 17f, 11.5f)
                    lineTo(17f, 5.5f)
                    curveTo(17f, 4.395f, 17.895f, 3.5f, 19f, 3.5f)
                    lineTo(20f, 3.5f)
                    curveTo(21.105f, 3.5f, 22f, 4.395f, 22f, 5.5f)
                    lineTo(22f, 11.5f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(17f, 11.5f)
                    curveTo(16f, 11.5f, 12f, 14f, 12f, 19f)
                    curveTo(12f, 21f, 9f, 21f, 9f, 19f)
                    curveTo(9f, 17f, 9f, 16f, 10f, 13.5f)
                    lineTo(4f, 13.5f)
                    curveTo(3.448f, 13.5f, 3f, 13.052f, 3f, 12.5f)
                    lineTo(3f, 9.26f)
                    curveTo(3f, 8.771f, 3.18f, 8.298f, 3.505f, 7.932f)
                    lineTo(6.403f, 4.671f)
                    curveTo(6.783f, 4.244f, 7.327f, 4f, 7.898f, 4f)
                    lineTo(14.667f, 4f)
                    curveTo(14.883f, 4f, 15.094f, 4.07f, 15.267f, 4.2f)
                    lineTo(17f, 5.5f)
                }
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
