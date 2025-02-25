package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DotsVerticalAlt: ImageVector
    get() {
        if (_DotsVerticalAlt != null) {
            return _DotsVerticalAlt!!
        }
        _DotsVerticalAlt = ImageVector.Builder(
            name = "DotsVerticalAlt",
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
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 19f)
                curveTo(14f, 20.105f, 13.105f, 21f, 12f, 21f)
                curveTo(10.895f, 21f, 10f, 20.105f, 10f, 19f)
                curveTo(10f, 17.895f, 10.895f, 17f, 12f, 17f)
                curveTo(13.105f, 17f, 14f, 17.895f, 14f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                curveTo(14f, 6.105f, 13.105f, 7f, 12f, 7f)
                curveTo(10.895f, 7f, 10f, 6.105f, 10f, 5f)
                curveTo(10f, 3.895f, 10.895f, 3f, 12f, 3f)
                curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
                close()
            }
        }.build()

        return _DotsVerticalAlt!!
    }

@Suppress("ObjectPropertyName")
private var _DotsVerticalAlt: ImageVector? = null
